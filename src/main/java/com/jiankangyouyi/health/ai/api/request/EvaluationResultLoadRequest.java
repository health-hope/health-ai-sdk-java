package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.EvaluationResultLoadResponse;

/**
 * 获取评测结果
 * 
 * @since v1.0
 * @see /v2/evaluation/result/load.do
 * @author yangsongbo
 *
 */
public class EvaluationResultLoadRequest extends HealthAiRequest<EvaluationResultLoadResponse> {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/evaluation/result/load.do";

	/**
	 * 评测结果ID
	 */
	private String evaluationId;

	public String getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(String evaluationId) {
		this.evaluationId = evaluationId;
	}

	@Override
	public String getApiUrl() {
		return API_URL;
	}

	@Override
	public void check() {
	}

}
