package com.jiankangyouyi.health.ai.api.response.qas;

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

	/**
	 * 回答状态  0 找不到答案 1 正常返回答案 
	 */
	private String status;
	
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "QasQueryAnswerResponse [answer=" + answer + ", status=" + status + "]";
	}

	


}
