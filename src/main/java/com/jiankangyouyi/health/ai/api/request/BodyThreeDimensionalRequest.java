package com.jiankangyouyi.health.ai.api.request;

import java.math.BigDecimal;
import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.BodyThreeDimensionalResponse;

/**
 * 人体三维重建识别
 * 
 * @see /v2/three/dimensional/feedback
 * @author yangsongbo
 *
 */
public class BodyThreeDimensionalRequest extends HealthAiRequest<BodyThreeDimensionalResponse> {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/three/dimensional/feedback";

	/**
	 * 人体照片信息列表
	 * </p>
	 * 每个元素为一个图片的base64信息, 第一张图片为人物的正面照信息，第二张为人物的侧面照信息
	 */
	private List<String> imageList;

	/**
	 * 身高
	 */
	private BigDecimal height;

	/**
	 * 性别 1 男 0 女
	 */
	private Integer gender;

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

	public BigDecimal getHeight() {
		return height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "BobyThreeDimensionalRequest [imageList=" + imageList + ", height=" + height + ", gender=" + gender
				+ "]";
	}

}
