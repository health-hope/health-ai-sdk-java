package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.FoodCountEstimateResponse;

/**
 * 食物质量/体积估算
 *
 * @since v2.0
 * @see /v2/food/count/estimate.do
 * @author yangsongbo
 */
public class FoodCountEstimateRequest extends HealthAiRequest<FoodCountEstimateResponse>  {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/query/food/count/estimate.do";

	
	/**
	 * 食物ID
	 */
	private String foodId;
	
	

	public String getFoodId() {
		return foodId;
	}

	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}

	
	@Override
	public void check() {		
	}

	@Override
	public String getApiUrl() {
		return API_URL;
	}
}
