package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.bean.evaluation.EvaluationUserInfoBean;
import com.jiankangyouyi.health.ai.api.response.EvaluationContentLoadResponse;

/**
 * 获取评测内容
 * 
 * @since v1.0
 * @see /v2/evaluation/content/load.do
 * @author yangsongbo
 *
 */
public class EvaluationContentLoadRequest extends HealthAiRequest<EvaluationContentLoadResponse> {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/evaluation/content/load.do";

	
	/**
	 * 评测编码
	 * 
	 */
	private String evaluationCode;

	/**
	 * 用户信息
	 */
	private EvaluationUserInfoBean userInfo;

	public String getEvaluationCode() {
		return evaluationCode;
	}

	public void setEvaluationCode(String evaluationCode) {
		this.evaluationCode = evaluationCode;
	}

	public EvaluationUserInfoBean getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(EvaluationUserInfoBean userInfo) {
		this.userInfo = userInfo;
	}

	

	@Override
	public String getApiUrl() {
		return API_URL;
	}

	@Override
	public void check() {
		
	}

}
