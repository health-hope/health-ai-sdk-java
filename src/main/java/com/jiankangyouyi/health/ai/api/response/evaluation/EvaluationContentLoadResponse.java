package com.jiankangyouyi.health.ai.api.response.evaluation;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;
import com.jiankangyouyi.health.ai.api.bean.evaluation.EvaluationQuesOptionsBean;

/**
 * 获取评测内容
 * 
 * @since v1.0
 * @see /v2/evaluation/content/load.do
 * @author yangsongbo
 *
 */
public class EvaluationContentLoadResponse extends HealthAiResponse {


	private static final long serialVersionUID = 1L;

	/**
	 * 评测名称
	 */
	private String evaluationName;

	/**
	 * 题库ID
	 */
	private String quesBankId;

	/**
	 * 评测问题数据集合
	 */
	private List<EvaluationQuesOptionsBean> quesOptions;

	public String getEvaluationName() {
		return evaluationName;
	}

	public void setEvaluationName(String evaluationName) {
		this.evaluationName = evaluationName;
	}

	public String getQuesBankId() {
		return quesBankId;
	}

	public void setQuesBankId(String quesBankId) {
		this.quesBankId = quesBankId;
	}

	public List<EvaluationQuesOptionsBean> getQuesOptions() {
		return quesOptions;
	}

	public void setQuesOptions(List<EvaluationQuesOptionsBean> quesOptions) {
		this.quesOptions = quesOptions;
	}

	

}
