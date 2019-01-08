package com.jiankangyouyi.health.ai.api.response.evaluation;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 保存评测数据
 * 
 * @see /v2/evaluation/data/save.do
 * @since v1.0
 * @author yangsongbo
 *
 */
public class EvaluationDataSaveResponse extends HealthAiResponse {

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 评测ID
	 */
	private String evaluationId;

	public String getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(String evaluationId) {
		this.evaluationId = evaluationId;
	}
}
