package com.jiankangyouyi.health.ai.api.response.evaluation;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;
import com.jiankangyouyi.health.ai.api.bean.evaluation.EvaluationManagementPlanBean;
import com.jiankangyouyi.health.ai.api.bean.evaluation.EvaluationPhysicalExamBean;
import com.jiankangyouyi.health.ai.api.bean.evaluation.EvaluationReportBean;
import com.jiankangyouyi.health.ai.api.bean.evaluation.EvaluationUserInfoBean;
import com.jiankangyouyi.health.ai.api.bean.evaluation.EvaluationUserOptionsBean;

/**
 * 获取评测内容
 * 
 * @since v1.0
 * @see /evaluation/content/load.do
 * @author yangsongbo
 *
 */
public class EvaluationResultLoadResponse extends HealthAiResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * 评测ID
	 */
	private String evaluationId;

	/**
	 * 评测编码
	 */
	private String evaluationCode;
	
	/**
	 * 评测名称
	 */
	private String evaluationName;
	
	/**
	 * 评测得分
	 */
	private int score; 
	
	/**
	 * 用户信息
	 */
	private EvaluationUserInfoBean userInfo;
	
	/**
	 * 参考资料
	 */
	private List<String> references;
	
	/**
	 * 用户的选项
	 */
	private List<EvaluationUserOptionsBean> userOptions;
	
	/**
	 * 评测报告
	 */
	private EvaluationReportBean evaluationReport;
	
	/**
	 * 管理方案
	 */
	private EvaluationManagementPlanBean managementPlan;
	
	/**
	 * 相关检查
	 */
	private EvaluationPhysicalExamBean physicalExam;

	public String getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(String evaluationId) {
		this.evaluationId = evaluationId;
	}

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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public EvaluationUserInfoBean getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(EvaluationUserInfoBean userInfo) {
		this.userInfo = userInfo;
	}

	public List<String> getReferences() {
		return references;
	}

	public void setReferences(List<String> references) {
		this.references = references;
	}

	public List<EvaluationUserOptionsBean> getUserOptions() {
		return userOptions;
	}

	public void setUserOptions(List<EvaluationUserOptionsBean> userOptions) {
		this.userOptions = userOptions;
	}

	public EvaluationReportBean getEvaluationReport() {
		return evaluationReport;
	}

	public void setEvaluationReport(EvaluationReportBean evaluationReport) {
		this.evaluationReport = evaluationReport;
	}

	public EvaluationManagementPlanBean getManagementPlan() {
		return managementPlan;
	}

	public void setManagementPlan(EvaluationManagementPlanBean managementPlan) {
		this.managementPlan = managementPlan;
	}

	public EvaluationPhysicalExamBean getPhysicalExam() {
		return physicalExam;
	}

	public void setPhysicalExam(EvaluationPhysicalExamBean physicalExam) {
		this.physicalExam = physicalExam;
	}

	@Override
	public String toString() {
		return "EvaluationResultLoadResData [evaluationId=" + evaluationId + ", evaluationCode=" + evaluationCode
				+ ", evaluationName=" + evaluationName + ", score=" + score + ", userInfo=" + userInfo + ", references="
				+ references + ", userOptions=" + userOptions + ", evaluationReport=" + evaluationReport
				+ ", managementPlan=" + managementPlan + ", physicalExam=" + physicalExam + "]";
	}

	
}
