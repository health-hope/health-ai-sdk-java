package com.jiankangyouyi.health.ai.api.response;

import java.math.BigDecimal;
import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 运动查询通用的response
 *
 * @since v2.0
 * @see /v2/exercise/text/quey.do，/v2/exercise/speech/quey.do
 * @author yangsongbo
 */
public class ExerciseQueryGeneralResponse extends HealthAiResponse {

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 运动列表
	 */
	private List<ExerciseQueryBean> exerciseList;

	
	

	public List<ExerciseQueryBean> getExerciseList() {
		return exerciseList;
	}




	public void setExerciseList(List<ExerciseQueryBean> exerciseList) {
		this.exerciseList = exerciseList;
	}




	public static class ExerciseQueryBean {

		/**
		 * 运动ID
		 */
		private String exerciseId;
		
		/**
		 * 数量，单位分钟
		 */
		private BigDecimal count;
		
		/**
		 * 运动名称
		 */
		private String exerciseName;
		
		/**
		 * 高亮内容
		 */
		private String highlightText;
		
		/**
		 * 运动种类
		 */
		private String exerciseKind;
		
		/**
		 * 运动图片
		 */
		private String imageUrl;
		
		/**
		 * 运动单位
		 */
		private String unit;
		
		/**
		 * 运动描述
		 */
		private String describe;
		
		/**
		 * 热量:大卡
		 */
		private int kilocalorie;

		public String getExerciseId() {
			return exerciseId;
		}

		public void setExerciseId(String exerciseId) {
			this.exerciseId = exerciseId;
		}

		public BigDecimal getCount() {
			return count;
		}

		public void setCount(BigDecimal count) {
			this.count = count;
		}

		public String getExerciseName() {
			return exerciseName;
		}

		public void setExerciseName(String exerciseName) {
			this.exerciseName = exerciseName;
		}

		public String getHighlightText() {
			return highlightText;
		}

		public void setHighlightText(String highlightText) {
			this.highlightText = highlightText;
		}

		public String getExerciseKind() {
			return exerciseKind;
		}

		public void setExerciseKind(String exerciseKind) {
			this.exerciseKind = exerciseKind;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getUnit() {
			return unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public String getDescribe() {
			return describe;
		}

		public void setDescribe(String describe) {
			this.describe = describe;
		}
		
		public int getKilocalorie() {
			return kilocalorie;
		}

		public void setKilocalorie(int kilocalorie) {
			this.kilocalorie = kilocalorie;
		}

		@Override
		public String toString() {
			return "ExerciseQueryBean [exerciseId=" + exerciseId + ", count=" + count + ", exerciseName=" + exerciseName
					+ ", highlightText=" + highlightText + ", exerciseKind=" + exerciseKind + ", imageUrl=" + imageUrl
					+ ", unit=" + unit + ", describe=" + describe + ", kilocalorie=" + kilocalorie + "]";
		}
		
		
		
		
	}

}
