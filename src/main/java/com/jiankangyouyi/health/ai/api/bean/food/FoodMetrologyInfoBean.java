package com.jiankangyouyi.health.ai.api.bean.food;

/**
 * 度量衡信息
 * 
 * @author yangsongbo
 *
 */
public class FoodMetrologyInfoBean {

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

	@Override
	public String toString() {
		return "FoodMetrologyInfoBean [imageUrl=" + imageUrl + ", describe=" + describe + "]";
	}
	
	
	
	

}
