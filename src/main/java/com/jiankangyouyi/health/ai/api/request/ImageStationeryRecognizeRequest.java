package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.ImageStationeryRecognizeResponse;

/**
 * 文具识别请求接口Bean
 * 
 * @author yangsongbo
 *
 */
public class ImageStationeryRecognizeRequest extends HealthAiRequest<ImageStationeryRecognizeResponse>{

	
	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/image/stationery/recognition.do";


	/**
	 * 图片的base64编码，优先支持image参数
	 */
	private String image;
	
	
	/**
	 * 图片的URL
	 */
	private String officeImageUrl;

	
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

	public String getOfficeImageUrl() {
		return officeImageUrl;
	}

	public void setOfficeImageUrl(String officeImageUrl) {
		this.officeImageUrl = officeImageUrl;
	}

	@Override
	public String toString() {
		return "ImageMultiRecognitionReq [image=" + image + ", officeImageUrl=" + officeImageUrl + "]";
	}


	
	
	
}
