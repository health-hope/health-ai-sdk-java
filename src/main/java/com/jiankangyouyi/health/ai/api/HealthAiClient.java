package com.jiankangyouyi.health.ai.api;

public interface HealthAiClient {

    <T extends HealthAiResponse> T execute(HealthAiRequest<T> request);

    String executeReturnJson(IHealthAiRequest request);

    String executeReturnJson(String reqData, String apiUrl);

}
