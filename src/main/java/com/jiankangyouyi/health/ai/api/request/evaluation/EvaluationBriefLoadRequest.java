package com.jiankangyouyi.health.ai.api.request.evaluation;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.evaluation.EvaluationBriefLoadResponse;

/**
 * 获取评测简介
 * 
 * @see /v2/evaluation/brief/load.do
 * @author yangsongbo
 *
 */
public class EvaluationBriefLoadRequest extends HealthAiRequest<EvaluationBriefLoadResponse> {

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/evaluation/brief/load.do";

	/**
	 * 评测编码
	 * 
	 * @see EvaluationCodeEnum
	 */
	private String evaluationCode;

	public String getEvaluationCode() {
		return evaluationCode;
	}

	public void setEvaluationCode(String evaluationCode) {
		this.evaluationCode = evaluationCode;
	}


	@Override
	public String getApiUrl() {	
		return API_URL;
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}

}
