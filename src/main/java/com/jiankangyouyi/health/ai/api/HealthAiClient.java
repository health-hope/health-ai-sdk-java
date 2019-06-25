package com.jiankangyouyi.health.ai.api;

public interface HealthAiClient {


    /**
     * 执行API请求
     *
     * @param reqDataJson 请求业务数据json字符串
     * @param url         API请求地址
     * @return 返回Json
     */
    String execute(String reqDataJson, String url);

}
