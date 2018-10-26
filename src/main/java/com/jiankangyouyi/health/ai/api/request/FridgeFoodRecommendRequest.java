package com.jiankangyouyi.health.ai.api.request;

import java.math.BigDecimal;
import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.FridgeFoodRecommendResponse;

/***
 * 基于冰箱食材的推荐
 * 
 * @see /v2/lp/fridge/food/recommendation.do
 */
public class FridgeFoodRecommendRequest extends HealthAiRequest<FridgeFoodRecommendResponse> {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/lp/fridge/food/recommendation.do";

	/**
	 * 性别
	 * </p>
	 * 1 男 2 女
	 */
	private String gender;

	/**
	 * 体重 单位 kg
	 */
	private BigDecimal weight;

	/**
	 * 身高 单位 cm
	 */
	private int height;

	/**
	 * 年龄 单位 岁
	 */
	private int age;
	
	/**
	 * 备选的冰箱食材列表
	 */
	private List<String> foodList;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public List<String> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<String> foodList) {
		this.foodList = foodList;
	}

	@Override
	public String getApiUrl() {
		return API_URL;
	}

	@Override
	public void check() {

	}

}
