package com.jiankangyouyi.health.ai.api.response;

import java.math.BigDecimal;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 一图多物识别返回接口Bean
 * 
 * @author yangsongbo
 *
 */
public class ImageStationeryRecognizeResponse extends HealthAiResponse{
	
	
	private static final long serialVersionUID = 1L;

	/**
	 * 名称
	 */
	private String itemName;
	
	/**
	 * 置信度   0<= confidence <=1
	 */
	private BigDecimal confidence;
	

	
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigDecimal getConfidence() {
		return confidence;
	}

	public void setConfidence(BigDecimal confidence) {
		this.confidence = confidence;
	}

	@Override
	public String toString() {
		return "ImageStationeryRecognizeResponse [itemName=" + itemName + ", confidence=" + confidence + "]";
	}

	
}
