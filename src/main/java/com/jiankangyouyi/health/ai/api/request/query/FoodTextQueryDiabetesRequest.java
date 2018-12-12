package com.jiankangyouyi.health.ai.api.request.query;

import java.math.BigDecimal;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.PageInfo;
import com.jiankangyouyi.health.ai.api.bean.query.HighlightBean;
import com.jiankangyouyi.health.ai.api.response.query.FoodTextSpeechQueryGeneralResponse;

/**
 * 糖尿病人群食物文本查询
 *
 * @since v2.0
 * @see /v2/query/diabetes/text/food/list.do
 * @author yangsongbo
 */
public class FoodTextQueryDiabetesRequest extends HealthAiRequest<FoodTextSpeechQueryGeneralResponse> {

    private static final long serialVersionUID = 1L;

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/query/diabetes/text/food/list.do";

    /** 查询文本 **/
    private String text;

    /**
     * 数量
     */
    private BigDecimal count;

    /**
     * 性别 {@link GenderEnum}
     */
    private String gender;

    /**
     * 年龄
     */
    private BigDecimal age;

    /**
     * 生日
     */
    private String birthday;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /* (non-Javadoc)
     * @see com.jiankangyouyi.health.ai.api.IHealthAiRequest#check()
     */
    @Override
    public void check() {
        // TODO Auto-generated method stub

    }

}
