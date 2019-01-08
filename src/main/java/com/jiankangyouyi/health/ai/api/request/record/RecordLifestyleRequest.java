package com.jiankangyouyi.health.ai.api.request.record;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.record.RecordLifestyleResponse;

/**
 * 生活方式记录
 * 
 * @author yangsongbo
 *
 */
public class RecordLifestyleRequest extends HealthAiRequest<RecordLifestyleResponse> {

    private static final long serialVersionUID = 1L;

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/ai/lifestyle/record/query";

    /**
     * 记录的文本
     */
    private String message;

    @Override
    public String getApiUrl() {
        return API_URL;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "RecordLifestyleRequest [message=" + message + "]";
    }

    @Override
    public void check() {

    }

}
