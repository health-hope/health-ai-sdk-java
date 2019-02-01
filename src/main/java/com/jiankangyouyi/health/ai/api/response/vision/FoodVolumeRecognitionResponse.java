package com.jiankangyouyi.health.ai.api.response.vision;

import java.math.BigDecimal;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 食物三维体积识别
 * 
 * @see /v2/food/volume/recognition
 * @author yangsongbo
 *
 */
public class FoodVolumeRecognitionResponse extends HealthAiResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * 食物三维体积识别结果
	 */
	private FoodVolumeRecognitionResult recognitionResult;

	public FoodVolumeRecognitionResult getRecognitionResult() {
		return recognitionResult;
	}

	public void setRecognitionResult(FoodVolumeRecognitionResult recognitionResult) {
		this.recognitionResult = recognitionResult;
	}

	public static class FoodVolumeRecognitionResult {

		/**
		 * 食物名称
		 */
		private String foodName;

		/**
		 * 食物体积：立方厘米
		 */
		private BigDecimal foodVolume;

		/**
		 * 3D模式文件，Base64格式
		 */
		private String objFile;

		/**
		 * 食物质量,单位：克
		 */
		private BigDecimal foodQuality;

		public String getFoodName() {
			return foodName;
		}

		public void setFoodName(String foodName) {
			this.foodName = foodName;
		}

		public BigDecimal getFoodVolume() {
			return foodVolume;
		}

		public void setFoodVolume(BigDecimal foodVolume) {
			this.foodVolume = foodVolume;
		}
		
		public String getObjFile() {
			return objFile;
		}

		public void setObjFile(String objFile) {
			this.objFile = objFile;
		}

		public BigDecimal getFoodQuality() {
			return foodQuality;
		}

		public void setFoodQuality(BigDecimal foodQuality) {
			this.foodQuality = foodQuality;
		}

		@Override
		public String toString() {
			return "FoodVolumeRecognitionResult [foodName=" + foodName + ", foodVolume=" + foodVolume
					+ ", objFile=" + objFile + ", foodQuality=" + foodQuality + "]";
		}

	}

	@Override
	public String toString() {
		return "FoodVolumeRecognitionResponse [recognitionResult=" + recognitionResult + "]";
	}
	
	
}
