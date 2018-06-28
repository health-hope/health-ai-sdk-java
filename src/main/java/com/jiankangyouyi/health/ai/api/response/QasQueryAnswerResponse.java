package com.jiankangyouyi.health.ai.api.response;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 问答服务
 * 
 * @author yangsongbo
 *
 */
public class QasQueryAnswerResponse extends HealthAiResponse {

	
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 答案
	 */
	private String answer;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "QasQueryAnswerResponse [answer=" + answer + "]";
	}


}
