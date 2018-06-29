package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.QasQueryAnswerResponse;

/**
 * 问答服务
 * 
 * @author yangsongbo
 *
 */
public class QasQueryAnswerRequest extends HealthAiRequest<QasQueryAnswerResponse> {

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/health/qas/query.do";

	
	/**
	 * 问题
	 */
	private String question;
	
	
	@Override
	public String getApiUrl() {
		return API_URL;
	}
	
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	
	@Override
	public String toString() {
		return "QasQueryAnswerRequest [question=" + question + "]";
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}

}
