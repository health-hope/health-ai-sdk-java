package com.jiankangyouyi.health.ai.api.request.vision;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.vision.FoodElementQueryResponse;

/**
 * 痛风人群食物识别图像查询
 *
 * @since v2.0
 * @see /v2/food/element/gout
 * @author dongle
 */
public class FoodImageQueryGoutRequest extends HealthAiRequest<FoodElementQueryResponse> {

    private static final long serialVersionUID = 1L;

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/food/element/gout";

    /**
     * 图像Base64
     */
    private String image;

    /**
     * 图片URL
     */
    private String foodImageUrl;

    /**
     * 返回数量
     */
    private int top;

    private int imageWidth;

    @Override
    public String getApiUrl() {
        return API_URL;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    @Override
    public void check() {

    }
}
