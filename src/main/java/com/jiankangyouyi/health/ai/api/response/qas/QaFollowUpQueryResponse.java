package com.jiankangyouyi.health.ai.api.response.qas;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 智能随访
 * 
 * @author dongle
 *
 */
public class QaFollowUpQueryResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 随访问题
     */
    private String question;
    /**
     * 提醒
     */
    private String remind;
    /**
     * 标签
     */
    private List<String> tag;
    /**
     * 回复用户反问
     */
    private String reply;

    @Override
    public String toString() {
        return "QaFollowUpQueryResponse{" + "question='" + question + '\'' + ", remind='" + remind + '\'' + ", tag="
            + tag + ", reply='" + reply + '\'' + '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getRemind() {
        return remind;
    }

    public void setRemind(String remind) {
        this.remind = remind;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }
}
