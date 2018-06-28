package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.ImageFoodSingleRecognizeResponse;

/**
 * 一图一物食物识别请求接口Bean
 * 
 * @author yangsongbo
 *
 */
public class ImageFoodSingleRecognizeRequest extends HealthAiRequest<ImageFoodSingleRecognizeResponse> {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/food/nutrient/recognition.do";

	/**
	 * 图片的base64编码，优先支持image参数
	 */
	private String image;

	/**
	 * 图片的URL
	 */
	private String foodImageUrl;

	/**
	 * 返回数量，默认为1
	 */
	private Integer top = 1;

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

	public Integer getTop() {
		return top;
	}

	public void setTop(Integer top) {
		this.top = top;
	}

	@Override
	public String toString() {
		return "ImageSingleRecognizeReq [image=" + image + ", foodImageUrl=" + foodImageUrl + ", top=" + top + "]";
	}

}
