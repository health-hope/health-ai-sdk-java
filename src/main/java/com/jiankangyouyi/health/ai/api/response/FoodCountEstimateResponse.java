package com.jiankangyouyi.health.ai.api.response;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 食物质量/体积估算ResData
 *
 * @since v2.0
 * @see /v2/food/count/estimate.do
 * @author yangsongbo
 */
public class FoodCountEstimateResponse extends HealthAiResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * 估算列表
	 */
	private List<FoodCountEstimateClassifyBean> estimateClassifyList;

	/**
	 * 估算信息
	 */
	private FoodCountEstimateBean estimate;

	public List<FoodCountEstimateClassifyBean> getEstimateClassifyList() {
		return estimateClassifyList;
	}

	public void setEstimateClassifyList(List<FoodCountEstimateClassifyBean> estimateClassifyList) {
		this.estimateClassifyList = estimateClassifyList;
	}

	public FoodCountEstimateBean getEstimate() {
		return estimate;
	}

	public void setEstimate(FoodCountEstimateBean estimate) {
		this.estimate = estimate;
	}

	public static class FoodCountEstimateClassifyBean {

		/**
		 * 食物分类
		 */
		private String classify;

		/**
		 * 估算列表
		 */
		private List<FoodCountEstimateBean> estimateList;

		public String getClassify() {
			return classify;
		}

		public void setClassify(String classify) {
			this.classify = classify;
		}

		public List<FoodCountEstimateBean> getEstimateList() {
			return estimateList;
		}

		public void setEstimateList(List<FoodCountEstimateBean> estimateList) {
			this.estimateList = estimateList;
		}

	}

	public static class FoodCountEstimateBean {

		/**
		 * 图片
		 */
		private String imageUrl;

		/**
		 * 描述
		 */
		private String describe;

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getDescribe() {
			return describe;
		}

		public void setDescribe(String describe) {
			this.describe = describe;
		}

	}

}
