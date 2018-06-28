package com.jiankangyouyi.health.ai.api;

public interface HealthAiClient {

	public <T extends HealthAiResponse> T execute(HealthAiRequest<T> request);
	
}
