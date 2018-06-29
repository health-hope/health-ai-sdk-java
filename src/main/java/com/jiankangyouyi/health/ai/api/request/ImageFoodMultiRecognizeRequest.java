package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.ImageFoodMultiRecognizeResponse;

/**
 * 一图多物食物识别请求接口Bean
 * 
 * @author yangsongbo
 *
 */
public class ImageFoodMultiRecognizeRequest extends HealthAiRequest<ImageFoodMultiRecognizeResponse>{

	

	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/food/multi/recognition.do";
	

	/**
	 * 图片的base64编码，优先支持image参数
	 */
	private String image;
	
	
	/**
	 * 图片的URL
	 */
	private String foodImageUrl;


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


	@Override
	public String toString() {
		return "ImageMultiRecognitionReq [image=" + image + ", foodImageUrl=" + foodImageUrl + "]";
	}


	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
