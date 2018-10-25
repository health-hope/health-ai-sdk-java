package com.jiankangyouyi.health.ai.api.request;

import java.math.BigDecimal;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.FoodRecommendResponse;

import cn.jianzhishidai.core.annotations.JavaBean;

/***
 * 基于食物库的食材推荐
 * 
 * @see /v2/lp/dbs/food/recommendation.do
 */
@JavaBean
public class FoodRecommendRequest extends HealthAiRequest<FoodRecommendResponse> {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/lp/dbs/food/recommendation.do";

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

	@Override
	public String getApiUrl() {
		return API_URL;
	}

	@Override
	public void check() {

	}

}
