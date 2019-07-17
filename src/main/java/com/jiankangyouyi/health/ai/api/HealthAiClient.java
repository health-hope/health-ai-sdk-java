package com.jiankangyouyi.health.ai.api;

import com.jiankangyouyi.health.ai.api.request.AbstractHealthAiReqData;
import com.jiankangyouyi.health.ai.api.response.AbstractHealthAiResData;
import com.jiankangyouyi.health.ai.api.response.HealthAiResponse;

import java.util.Map;

/**
 * API 执行接口
 *
 * @author yangsongbo
 */
public interface HealthAiClient {


    /**
     * 执行API请求
     *
     * @param reqDataJson 请求业务数据json字符串
     * @param url         API请求地址
     * @return 返回Json
     */
    String execute(String reqDataJson, String url);


    /**
     * 执行API请求
     *
     * @param reqData 请求业务数据Map
     * @param url     API请求地址
     * @return 返回Json
     */
    String execute(Map<String, Object> reqData, String url);


    /**
     * 执行API请求
     *
     * @param reqData 请求业务数据
     * @param url     API请求地址
     * @param <T>     返回对象
     * @return API Response
     */
    <T extends AbstractHealthAiResData> HealthAiResponse<T> execute(AbstractHealthAiReqData<T> reqData, String url);


}
