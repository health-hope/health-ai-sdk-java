package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.ImageEmotionRecognizeResponse;

/**
 * 表情识别请求接口
 * 
 * @author yangsongbo
 *
 */
public class ImageEmotionRecognizeRequest extends HealthAiRequest<ImageEmotionRecognizeResponse>{

	
	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/image/emotion/recognition.do";
	
	/**
	 * 图片的base64编码，优先支持image参数
	 */
	private String image;
	
	
	/**
	 * 图片的URL
	 */
	private String emotionImageUrl;

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

	public String getEmotionImageUrl() {
		return emotionImageUrl;
	}

	public void setEmotionImageUrl(String emotionImageUrl) {
		this.emotionImageUrl = emotionImageUrl;
	}

	@Override
	public String toString() {
		return "ImageEmotionRecognizeRequest [image=" + image + ", emotionImageUrl=" + emotionImageUrl + "]";
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}

}
