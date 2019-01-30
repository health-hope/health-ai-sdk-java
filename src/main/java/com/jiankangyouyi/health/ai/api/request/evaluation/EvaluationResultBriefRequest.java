package com.jiankangyouyi.health.ai.api.request.evaluation;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.bean.evaluation.EvaluationUserBriefInfoReqBean;
import com.jiankangyouyi.health.ai.api.bean.evaluation.EvaluationUserOptionsBean;
import com.jiankangyouyi.health.ai.api.response.evaluation.EvaluationDataSaveResponse;

import java.util.List;

/**
 * 获取评测内容
 *
 * @author yangsongbo
 * @see /evaluation/content/load.do
 * @since v1.0
 */

public class EvaluationResultBriefRequest extends HealthAiRequest<EvaluationDataSaveResponse> {

    private static final long serialVersionUID = 1L;

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/evaluation/robot/save.do";

    /**
     * 评测编码
     */

    private String evaluationCode;

    /**
     * 用户信息
     */
    private EvaluationUserBriefInfoReqBean userInfo;

    private List<EvaluationUserOptionsBean> userOptions;

    public String getEvaluationCode() {
        return evaluationCode;
    }

    public void setEvaluationCode(String evaluationCode) {
        this.evaluationCode = evaluationCode;
    }

    public EvaluationUserBriefInfoReqBean getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(EvaluationUserBriefInfoReqBean userInfo) {
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
