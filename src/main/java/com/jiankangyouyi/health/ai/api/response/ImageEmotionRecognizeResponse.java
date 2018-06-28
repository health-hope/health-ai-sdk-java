package com.jiankangyouyi.health.ai.api.response;

import java.math.BigDecimal;
import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 表情识别返回接口Bean
 * 
 * @author yangsongbo
 *
 */
public class ImageEmotionRecognizeResponse extends HealthAiResponse {

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 识别结果
	 */
	private List<RecognizeEmotion> recognitionEmotionList;

	
	

	public List<RecognizeEmotion> getRecognitionEmotionList() {
		return recognitionEmotionList;
	}




	public void setRecognitionEmotionList(List<RecognizeEmotion> recognitionEmotionList) {
		this.recognitionEmotionList = recognitionEmotionList;
	}
	
	


	@Override
	public String toString() {
		return "ImageEmotionRecognizeResponse [recognitionEmotionList=" + recognitionEmotionList + "]";
	}


	/**
	 * 识别出的表情
	 * 
	 * @author yangsongbo
	 *
	 */
	public static class RecognizeEmotion {
	
		/**
		 * 表情 : </p> 
		 * disgust ： 厌恶 </p> 
		 * fear ： 恐惧 </p> 
		 * happy ： 高兴 </p> 
		 * sad ： 难过 </p> 
		 * surprise ： 惊喜 </p> 
		 * neutral ：正常 </p> 
		 */
		private String emotionName;
		
		/**
		 * 置信度
		 */
		private BigDecimal confidence;
		
		/**
		 * 识别人物距离左边距离百分比
		 */
		private BigDecimal leftCoordinate;
		
		/**
		 * 识别人物距离上边界百分比
		 */
		private BigDecimal topCoordinate;

		public String getEmotionName() {
			return emotionName;
		}

		public void setEmotionName(String emotionName) {
			this.emotionName = emotionName;
		}

		public BigDecimal getConfidence() {
			return confidence;
		}

		public void setConfidence(BigDecimal confidence) {
			this.confidence = confidence;
		}

		public BigDecimal getLeftCoordinate() {
			return leftCoordinate;
		}

		public void setLeftCoordinate(BigDecimal leftCoordinate) {
			this.leftCoordinate = leftCoordinate;
		}

		public BigDecimal getTopCoordinate() {
			return topCoordinate;
		}

		public void setTopCoordinate(BigDecimal topCoordinate) {
			this.topCoordinate = topCoordinate;
		}

		@Override
		public String toString() {
			return "RecognizeEmotion [emotionName=" + emotionName + ", confidence=" + confidence + ", leftCoordinate="
					+ leftCoordinate + ", topCoordinate=" + topCoordinate + "]";
		}

	}


}
