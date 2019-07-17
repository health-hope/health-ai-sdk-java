package com.jiankangyouyi.health.ai.api.request;

import java.util.Map;

/**
 * Api Request
 *
 * @author yangsongbo
 */
public class ServiceMapRequest implements ServiceRequest {
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
    private Map<String, Object> reqData;

    public ServiceMapRequest() {
    }


    public ServiceMapRequest(String appId, String nonceStr, String version, String timestamp, Map<String, Object> reqData) {
        this.appId = appId;
        this.nonceStr = nonceStr;
        this.version = version;
        this.timestamp = timestamp;
        this.reqData = reqData;
    }

    @Override
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

    @Override
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSign() {
        return sign;
    }

    @Override
    public void setSign(String sign) {
        this.sign = sign;
    }

    public Map<String, Object> getReqData() {
        return reqData;
    }

    public void setReqData(Map<String, Object> reqData) {
        this.reqData = reqData;
    }


}
