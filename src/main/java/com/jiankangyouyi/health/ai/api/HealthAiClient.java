package com.jiankangyouyi.health.ai.api;

public interface HealthAiClient {

    public <T extends HealthAiResponse> T execute(HealthAiRequest<T> request);

    public String executeReturnJson(IHealthAiRequest request);

    public String executeReturnJson(String reqData, String apiUrl);

}
