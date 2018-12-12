package com.jiankangyouyi.health.ai.api.request.query;

import java.math.BigDecimal;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.query.FoodImageQueryGeneralResponse;

/**
 * 孕产妇人群食物图像查询
 *
 * @since v2.0
 * @see /v2/query/maternal/image/food/list.do
 * @author yangsongbo
 */
public class FoodImageQueryMaternalRequest extends HealthAiRequest<FoodImageQueryGeneralResponse> {

    private static final long serialVersionUID = 1L;

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/query/maternal/image/food/list.do";

    /**
     * 图像Base64
     */
    private String image;

    /**
     * 图片URL
     */
    private String foodImageUrl;

    /**
     * 数量
     */
    private BigDecimal count;

    /**
     * 返回数量
     */
    private int top;

    /**
     * 阶段 1 <孕早期(孕第1周到13周末期间)> 2 <孕中期(孕14周到孕27周末期间)> 3 <孕晚期(孕28周后)> 4 <哺乳期>
     */
    private String stage;

    @Override
    public String getApiUrl() {
        return API_URL;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFoodImageUrl() {
        return foodImageUrl;
    }

    public void setFoodImageUrl(String foodImageUrl) {
        this.foodImageUrl = foodImageUrl;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    @Override
    public void check() {

    }

}
