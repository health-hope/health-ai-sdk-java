package com.jiankangyouyi.health.ai.api.request;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.bean.evaluation.EvaluationUserInfoBean;
import com.jiankangyouyi.health.ai.api.bean.evaluation.EvaluationUserOptionsBean;
import com.jiankangyouyi.health.ai.api.response.EvaluationDataSaveResponse;

/**
 * 保存评测数据
 * 
 * @see /v2/evaluation/data/save.do
 * @since v1.0
 * @author yangsongbo
 *
 */
public class EvaluationDataSaveRequest extends HealthAiRequest<EvaluationDataSaveResponse> {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/evaluation/data/save.do";

	/**
	 * 题库ID
	 * 
	 */
	private String quesBankId;

	/**
	 * 评测编码
	 * 
	 * @see EvaluationCodeEnum
	 */
	private String evaluationCode;

	/**
	 * 用户信息
	 */
	private EvaluationUserInfoBean userInfo;

	/**
	 * 用户的选项
	 */
	private List<EvaluationUserOptionsBean> userOptions;

	public String getQuesBankId() {
		return quesBankId;
	}

	public void setQuesBankId(String quesBankId) {
		this.quesBankId = quesBankId;
	}

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

	public List<EvaluationUserOptionsBean> getUserOptions() {
		return userOptions;
	}

	public void setUserOptions(List<EvaluationUserOptionsBean> userOptions) {
		this.userOptions = userOptions;
	}

	@Override
	public String getApiUrl() {
		return API_URL;
	}

	@Override
	public void check() {

	}

}
