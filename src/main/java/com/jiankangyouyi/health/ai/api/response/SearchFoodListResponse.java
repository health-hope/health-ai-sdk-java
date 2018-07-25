package com.jiankangyouyi.health.ai.api.response;

import java.math.BigDecimal;
import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 查询食物列表
 * 
 * @author yangsongbo
 *
 */
public class SearchFoodListResponse extends HealthAiResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * 食物列表
	 */
	private List<SearchFoodBean> foodList;

	public List<SearchFoodBean> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<SearchFoodBean> foodList) {
		this.foodList = foodList;
	}

	public static class SearchFoodBean {

		/**
		 * 食物Id
		 */
		private String foodId;

		/**
		 * 食物名称
		 */
		private String foodName;

		/**
		 * 食物图片
		 */
		private String foodImageUrl;

		/**
		 * 热量（kcal）
		 */
		private int heat;

		/**
		 * 蛋白质（g）
		 */
		private BigDecimal protein;

		/**
		 * 脂肪（g）
		 */
		private BigDecimal fat;

		/**
		 * 碳水化合物（g）
		 */
		private BigDecimal carbohydrate;

		public String getFoodId() {
			return foodId;
		}

		public void setFoodId(String foodId) {
			this.foodId = foodId;
		}

		public String getFoodName() {
			return foodName;
		}

		public void setFoodName(String foodName) {
			this.foodName = foodName;
		}

		public String getFoodImageUrl() {
			return foodImageUrl;
		}

		public void setFoodImageUrl(String foodImageUrl) {
			this.foodImageUrl = foodImageUrl;
		}

		public int getHeat() {
			return heat;
		}

		public void setHeat(int heat) {
			this.heat = heat;
		}

		public BigDecimal getProtein() {
			return protein;
		}

		public void setProtein(BigDecimal protein) {
			this.protein = protein;
		}

		public BigDecimal getFat() {
			return fat;
		}

		public void setFat(BigDecimal fat) {
			this.fat = fat;
		}

		public BigDecimal getCarbohydrate() {
			return carbohydrate;
		}

		public void setCarbohydrate(BigDecimal carbohydrate) {
			this.carbohydrate = carbohydrate;
		}

		@Override
		public String toString() {
			return "SearchFoodBean [foodId=" + foodId + ", foodName=" + foodName + ", foodImageUrl=" + foodImageUrl
					+ ", heat=" + heat + ", protein=" + protein + ", fat=" + fat + ", carbohydrate=" + carbohydrate
					+ "]";
		}

	}

}
