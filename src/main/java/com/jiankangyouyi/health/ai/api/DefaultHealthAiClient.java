package com.jiankangyouyi.health.ai.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.jiankangyouyi.health.ai.api.util.HttpClientUtil;
import com.jiankangyouyi.health.ai.api.util.JsonUtil;
import com.jiankangyouyi.health.ai.api.util.RSAUtil;
import com.jiankangyouyi.health.ai.api.util.UUIDUtil;
import com.sun.jmx.snmp.Timestamp;

public class DefaultHealthAiClient implements HealthAiClient{

	private String appId;
	private String privateKey;
	private String version;
	private String serverUrl;
	
	private DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINESE); 
	
	public DefaultHealthAiClient(String appId,String privateKey,String version,String serverUrl){
		this.appId = appId;
		this.privateKey = privateKey;
		this.version = version;
		this.serverUrl = serverUrl;
	}
	
	public <T extends HealthAiResponse> T execute(HealthAiRequest<T> request){
		ServiceRequest req = new ServiceRequest();
		req.setAppId(appId);
		req.setVersion(version);
		req.setNonceStr(UUIDUtil.getJavaUUID());
		req.setTimestamp(sdf.format(new Timestamp()));
		String signString = createSignString(req.signFiledMap());
		String sign = RSAUtil.signWithSHA256(signString, privateKey, HealthAiConstants.CHARSET_UTF8);
		req.setSign(sign);
		String reqDataJson = JsonUtil.toJson(request);
		req.setReqData(reqDataJson);
		String reqMessage = JsonUtil.toJson(req);
		String serviceUrl = this.serverUrl + request.getApiUrl();
		String rtn = HttpClientUtil.post(serviceUrl, reqMessage);
		if(rtn == null|| rtn.length()==0){
			throw new RuntimeException("没有返回数据");
		}
		ServiceResponse res = JsonUtil.fromJson(rtn, ServiceResponse.class);
		T trs = null;
		if(res.getResData()!=null&&res.getResData().length()>0){
			trs = JsonUtil.fromJson(res.getResData(), request.getResponseClass());
		}
		return trs;
		
	}
	
	/**
	 * 组装签名串
	 * @param params
	 * @return
	 */
	private String createSignString(Map<String, String> params){
		StringBuilder prestr = new StringBuilder("");
		if (params!=null&&!params.isEmpty()) {
			params.remove("sign");
			List<String> keys = new ArrayList<String>(params.keySet());

			Collections.sort(keys);

			for (int i = 0; i < keys.size(); i++) {
				String key = keys.get(i);
				String value = params.get(key);

				if (value == null || value.toString().length() == 0)
					continue;
				if (i != 0) {
					prestr.append("&");
				}
				prestr.append(key).append("=");
				prestr.append(value);
			}
		}
		return prestr.toString();
	}
	
	/**
	 * 内部请求POJO
	 * @author ThinkPad
	 *
	 */
	private class ServiceRequest{
		/**
		 * 随机字符串
		 */
		private String nonceStr;
		
		/**
		 * 应用ID
		 */
		private String appId;

		/**
		 * 版本号
		 */
		private String version;
		
		/**
		 * 请求时间
		 */
		private String timestamp;
		
		/**
		 * 签名
		 */
		private String sign;
		
		/**
		 * 业务数据
		 */
		private String reqData;

		public String getNonceStr() {
			return nonceStr;
		}

		public void setNonceStr(String nonceStr) {
			this.nonceStr = nonceStr;
		}

		public String getAppId() {
			return appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public String getSign() {
			return sign;
		}

		public void setSign(String sign) {
			this.sign = sign;
		}

		public String getReqData() {
			return reqData;
		}

		public void setReqData(String reqData) {
			this.reqData = reqData;
		}
		
		public Map<String,String> signFiledMap() {
	   		Map<String,String> map_=new HashMap<String,String>();
	    	map_.put("appId",getAppId());
	    	map_.put("version",getVersion());
	    	map_.put("timestamp",getTimestamp());
	    	map_.put("nonceStr",getNonceStr());
			return map_;
	    }
	}
	
	/**
	 * 内部应答POJO
	 * @author ThinkPad
	 *
	 */
	private class ServiceResponse{
		
		private String resData;
		
		private String sign;
		
		private String timestamp;
		

		public String getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public String getResData() {
			return resData;
		}

		public void setResData(String resData) {
			this.resData = resData;
		}

		public String getSign() {
			return sign;
		}

		public void setSign(String sign) {
			this.sign = sign;
		}
		
		public Map<String,String> signFiledMap() {
	   		Map<String,String> map_=new HashMap<String,String>();
	    	map_.put("resData",getResData());
	    	map_.put("timestamp",getTimestamp());
	    	map_.put("sign",getSign());
			return map_;
	    }
	}
	
}
