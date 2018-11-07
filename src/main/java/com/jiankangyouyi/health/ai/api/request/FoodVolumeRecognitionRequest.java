package com.jiankangyouyi.health.ai.api.request;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.FoodVolumeRecognitionResponse;


/**
 * 食物三维体积识别
 * 
 * @see /v2/food/volume/recognition
 * @author yangsongbo
 *
 */
public class FoodVolumeRecognitionRequest extends HealthAiRequest<FoodVolumeRecognitionResponse> {

	
	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/food/volume/recognition";
	
	
	/**
	 * 图片List
	 */
	private List<String> imageList;
	
	/**
	 * 图片类型
	 * </p>
	 * 1 默认，表示输入的图片信息为图片的url
	 * 2 表示输入的图片为base64信息
	 */
	private Integer imageType = 1;
	
	
	@Override
	public String getApiUrl() {
		return API_URL;
	}
	

	@Override
	public void check() {
		
	}


	public List<String> getImageList() {
		return imageList;
	}


	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}


	public Integer getImageType() {
		return imageType;
	}


	public void setImageType(Integer imageType) {
		this.imageType = imageType;
	}


	@Override
	public String toString() {
		return "FoodVolumeRecognitionRequest [imageList=" + imageList + ", imageType=" + imageType + "]";
	}
	
}
