package com.jiankangyouyi.health.ai.api.bean.food;

/**
 * 推荐的食物信息
 * @author yangsongbo
 *
 */
public class RecommendFoodBean {
	/**
	 * 食物ID
	 */
	private String foodId;
	
	/**
	 * 食物名
	 */
	private String foodName;
	
	/**
	 * 具体数值
	 */
	private Integer content;
	
	/**
	 * 单位
	 */
	private String unit;
	
	/**
	 * 更换状态标志
	 */
	private Integer changeStatus;
	
	

	public RecommendFoodBean() {
		super();
	}

	public RecommendFoodBean(String foodId, String foodName, Integer content, String unit, Integer changeStatus) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.content = content;
		this.unit = unit;
		this.changeStatus = changeStatus;
	}

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

	public Integer getContent() {
		return content;
	}

	public void setContent(Integer content) {
		this.content = content;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getChangeStatus() {
		return changeStatus;
	}

	public void setChangeStatus(Integer changeStatus) {
		this.changeStatus = changeStatus;
	}

	@Override
	public String toString() {
		return "RecommendFoodBean [foodId=" + foodId + ", foodName=" + foodName + ", content=" + content + ", unit="
				+ unit + ", changeStatus=" + changeStatus + "]";
	}
	
	
	
}
