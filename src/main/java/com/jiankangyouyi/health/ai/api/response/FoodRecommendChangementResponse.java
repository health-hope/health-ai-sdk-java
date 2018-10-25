package com.jiankangyouyi.health.ai.api.response;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;
import com.jiankangyouyi.health.ai.api.bean.food.RecommendFoodBean;

/***
 * 食材替换
 * 
 * @see /v2/lp/changement/food/recommendation.do
 */
public class FoodRecommendChangementResponse extends HealthAiResponse{
	
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
		return "FoodRecommendChangementResponse [foodList=" + foodList + "]";
	}
	
	
	
}
