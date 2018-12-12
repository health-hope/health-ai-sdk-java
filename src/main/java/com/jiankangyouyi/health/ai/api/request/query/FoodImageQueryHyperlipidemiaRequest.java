package com.jiankangyouyi.health.ai.api.request.query;

import java.math.BigDecimal;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.query.FoodImageQueryGeneralResponse;

/**
 * 高血脂人群食物图像查询
 *
 * @since v2.0
 * @see /v2/query/hyperlipidemia/image/food/list.do
 * @author yangsongbo
 */
public class FoodImageQueryHyperlipidemiaRequest extends HealthAiRequest<FoodImageQueryGeneralResponse> {

    private static final long serialVersionUID = 1L;

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/query/hyperlipidemia/image/food/list.do";

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

    @Override
    public void check() {

    }
}
