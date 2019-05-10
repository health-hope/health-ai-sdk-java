package com.jiankangyouyi.health.ai.api.request.query;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.PageInfo;
import com.jiankangyouyi.health.ai.api.request.query.bean.HighlightBean;
import com.jiankangyouyi.health.ai.api.response.query.LabelTextSpeechQueryGeneralResponse;

/**
 * 肥胖人群能不能吃标签查询
 *
 * @since v2.0
 * @see  /v2/query/fat/text/label/list.do
 * @author Ashon
 */
public class LabelTextQueryFatRequest extends HealthAiRequest<LabelTextSpeechQueryGeneralResponse> {

    private static final long serialVersionUID = 1L;

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/query/fat/text/label/list.do";

    /** 查询文本 **/
    private String text;

    /** 分页 **/
    private PageInfo pageInfo;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
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
