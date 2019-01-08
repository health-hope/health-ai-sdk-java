package com.jiankangyouyi.health.ai.api.response.evaluation;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 获取评测简介
 * 
 * @see /v2/evaluation/brief/load.do
 * @author yangsongbo
 *
 */
public class EvaluationBriefLoadResponse extends HealthAiResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * 评测编码
	 * @see  EvaluationCodeEnum
	 */
	private String evaluationCode;

	/**
	 * 评测名称
	 */
	private String evaluationName;

	/**
	 * 评估依据
	 */
	private String evaluationBasis;

	/**
	 * 封面图片
	 */
	private String imageUrl;
	
	/**
	 * 参考资料
	 */
	private List<String> references;

	public String getEvaluationCode() {
		return evaluationCode;
	}

	public void setEvaluationCode(String evaluationCode) {
		this.evaluationCode = evaluationCode;
	}

	public String getEvaluationName() {
		return evaluationName;
	}

	public void setEvaluationName(String evaluationName) {
		this.evaluationName = evaluationName;
	}

	public String getEvaluationBasis() {
		return evaluationBasis;
	}

	public void setEvaluationBasis(String evaluationBasis) {
		this.evaluationBasis = evaluationBasis;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<String> getReferences() {
		return references;
	}

	public void setReferences(List<String> references) {
		this.references = references;
	}
	
	

}
