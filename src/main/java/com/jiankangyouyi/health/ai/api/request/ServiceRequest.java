package com.jiankangyouyi.health.ai.api.request;

import java.util.HashMap;
import java.util.Map;

/**
 * Api Request
 *
 * @author yangsongbo
 */
public class ServiceRequest {
    /**
     * 应用ID
     */
    private String appId;


    /**
     * 随机字符串
     */
    private String nonceStr;


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

    public ServiceRequest() {
    }

    public ServiceRequest(String appId, String nonceStr, String version, String timestamp, String reqData) {
        this.appId = appId;
        this.nonceStr = nonceStr;
        this.version = version;
        this.timestamp = timestamp;
        this.reqData = reqData;
    }

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

    public Map<String, String> signFiledMap() {
        Map<String, String> map_ = new HashMap<>();
        map_.put("appId", getAppId());
        map_.put("version", getVersion());
        map_.put("timestamp", getTimestamp());
        map_.put("nonceStr", getNonceStr());
        return map_;
    }
}
