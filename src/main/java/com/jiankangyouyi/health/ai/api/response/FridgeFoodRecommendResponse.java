package com.jiankangyouyi.health.ai.api.response;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;
import com.jiankangyouyi.health.ai.api.bean.food.RecommendFoodBean;

/***
 * 基于食物库的食材推荐
 * 
 * @see /v2/lp/dbs/food/recommendation.do
 */
public class FridgeFoodRecommendResponse extends HealthAiResponse{
	
	private static final long serialVersionUID = 1L;

	
	/**
	 * 食材列表：16种食材推荐列表
	 */
	private List<RecommendFoodBean> foodList;


	public List<RecommendFoodBean> getFoodList() {
		return foodList;
	}


	public void setFoodList(List<RecommendFoodBean> foodList) {
		this.foodList = foodList;
	}


	
	@Override
	public String toString() {
		return "FridgeFoodRecommendResponse [foodList=" + foodList + "]";
	}
	
	
	
}
