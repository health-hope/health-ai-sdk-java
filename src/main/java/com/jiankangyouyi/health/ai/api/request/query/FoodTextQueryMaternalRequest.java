package com.jiankangyouyi.health.ai.api.request.query;

import java.math.BigDecimal;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.PageInfo;
import com.jiankangyouyi.health.ai.api.bean.query.HighlightBean;
import com.jiankangyouyi.health.ai.api.response.query.FoodTextSpeechQueryGeneralResponse;

import cn.jianzhishidai.core.annotations.JavaBean;

/**
 * 孕产妇人群食物文本查询
 *
 * @since v2.0
 * @see /v2/query/maternal/text/food/list.do
 * @author yangsongbo
 */
@JavaBean
public class FoodTextQueryMaternalRequest extends HealthAiRequest<FoodTextSpeechQueryGeneralResponse> {

    private static final long serialVersionUID = 1L;

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/query/maternal/text/food/list.do";

    /** 查询文本 **/
    private String text;

    /**
     * 数量
     */
    private BigDecimal count;

    /**
     * 阶段 1 <孕早期(孕第1周到13周末期间)> 2 <孕中期(孕14周到孕27周末期间)> 3 <孕晚期(孕28周后)> 4 <哺乳期>
     */
    private String stage;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
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

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    /* (non-Javadoc)
     * @see com.jiankangyouyi.health.ai.api.IHealthAiRequest#check()
     */
    @Override
    public void check() {
        // TODO Auto-generated method stub

    }

}
