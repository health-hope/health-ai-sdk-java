package com.jiankangyouyi.health.ai.api.request.query;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.PageInfo;
import com.jiankangyouyi.health.ai.api.request.query.bean.HighlightBean;
import com.jiankangyouyi.health.ai.api.response.query.LabelTextSpeechQueryGeneralResponse;

/**
 * 冠心病人群食物语音查询
 *
 * @since v2.0
 * @see  /v2/query/coronary/speech/label/list.do
 * @author yangsongbo
 */
public class LabelSpeechQueryCoronaryHeartDiseaseRequest extends HealthAiRequest<LabelTextSpeechQueryGeneralResponse> {

    private static final long serialVersionUID = 1L;

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/query/coronary/speech/label/list.do";

    /** 查询文本 **/
    private String speech;

    /**
     * 音频格式
     */
    private String format;

    /** 分页 **/
    private PageInfo pageInfo;

    /**
     * 采样率 8000 或 16000
     */
    private int rate;

    /**
     * 高亮设置
     */
    private HighlightBean highlight;
    @Override
    public String getApiUrl() {
        return API_URL;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public HighlightBean getHighlight() {
        return highlight;
    }

    public void setHighlight(HighlightBean highlight) {
        this.highlight = highlight;
    }


    /* (non-Javadoc)
         * @see com.jiankangyouyi.health.ai.api.IHealthAiRequest#check()
         */
    @Override
    public void check() {
        // TODO Auto-generated method stub

    }
}
