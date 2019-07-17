package com.jiankangyouyi.health.ai.api.request;

/**
 * @author yangsongbo
 */
public interface ServiceRequest {

    /**
     * 获取随机字符串
     *
     * @return 随机字符串
     */
    String getNonceStr();

    /**
     * 获取时间
     *
     * @return 时间 yyyy-MM-dd HH:mm:ss
     */
    String getTimestamp();

    /**
     * 设置签名
     *
     * @param sign 签名
     */
    void setSign(String sign);

}
