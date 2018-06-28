package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.TestResponse;

public class TestRequest extends HealthAiRequest<TestResponse>{

	@Override
	public String getApiUrl() {
		// TODO Auto-generated method stub
		return "/v2/qas/query.do";
	}

}
