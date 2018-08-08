package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.SearchFoodDetailResponse;

/**
 * 查询食物详情
 * 
 * @author yangsongbo
 *
 */
public class SearchFoodDetailRequest extends HealthAiRequest<SearchFoodDetailResponse> {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/food/detail.do";

	/**
	 * 食物Id
	 */
	private String foodId;

	public String getFoodId() {
		return foodId;
	}

	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}

	@Override
	public String getApiUrl() {
		return API_URL;
	}
	
	

	@Override
	public String toString() {
		return "SearchFoodDetailRequest [foodId=" + foodId + "]";
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub

	}

}
