package com.jiankangyouyi.health.ai.api.request.qas;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.qas.QaFollowUpQueryResponse;

/**
 * 智能随访
 *
 * @author dongle
 */
public class QaFollowUpQueryRequest extends HealthAiRequest<QaFollowUpQueryResponse> {

    private static final long serialVersionUID = 1L;

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/qa/follow/up/query";

    /**
     * 用户id
     */
    private String userId;
    /**
     * 上一轮用户的回复
     */
    private String lastReply;
    /**
     * 用户发过来的信息类型
     */
    private int userDataType;
    /**
     * 音频类型
     */
    private String format;
    /**
     * 采样率 8000 或 16000
     */
    private int rate;
    /**
     * 需要返回给用户的信息类型
     */
    private int questionType;
    /**
     * 期望返回音频声音
     */
    private int voice;
    /**
     * 期望返回音频类型
     */
    private int aue;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastReply() {
        return lastReply;
    }

    public void setLastReply(String lastReply) {
        this.lastReply = lastReply;
    }

    public int getUserDataType() {
        return userDataType;
    }

    public void setUserDataType(int userDataType) {
        this.userDataType = userDataType;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getQuestionType() {
        return questionType;
    }

    public void setQuestionType(int questionType) {
        this.questionType = questionType;
    }

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }

    public int getAue() {
        return aue;
    }

    public void setAue(int aue) {
        this.aue = aue;
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
