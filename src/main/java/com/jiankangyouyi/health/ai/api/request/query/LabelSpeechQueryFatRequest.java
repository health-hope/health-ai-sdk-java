package com.jiankangyouyi.health.ai.api.request.query;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.PageInfo;
import com.jiankangyouyi.health.ai.api.request.query.bean.HighlightBean;
import com.jiankangyouyi.health.ai.api.response.query.LabelTextSpeechQueryGeneralResponse;

/**
 * 肥胖人群食物能不能吃语音查询
 *
 * @since v2.0
 * @see  /v2/query/fat/speech/label/list.do
 * @author Ashon
 */
public class LabelSpeechQueryFatRequest extends HealthAiRequest<LabelTextSpeechQueryGeneralResponse> {

    private static final long serialVersionUID = 1L;

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/query/fat/speech/label/list.do";

    /**
     * 语音数据
     * </p>
     * 1、原始 PCM 的录音参数必须符合 8k/16k 采样率、16bit 位深、单声道， 支持的格式有：pcm（不压缩）、wav（不压缩，pcm编码）、amr（压缩格式）、map3
     * </p>
     * 2、目前系统支持的语音时长上限为60s，请不要超过这个长度
     * </p>
     */
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
