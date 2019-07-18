package com.jiankangyouyi.health.ai.api.response;

/**
 * Response
 *
 * @author yangsongbo
 */
public class HealthAiResponse<T extends AbstractHealthAiResData> {

    private static final long serialVersionUID = 1L;

    /**
     * API返回的Json串
     */
    private String responseJson;

    /**
     * 返回的resData对象
     */
    private T resData;

    public String getResponseJson() {
        return responseJson;
    }

    public void setResponseJson(String responseJson) {
        this.responseJson = responseJson;
    }

    public T getResData() {
        return resData;
    }

    public void setResData(T resData) {
        this.resData = resData;
    }

}
