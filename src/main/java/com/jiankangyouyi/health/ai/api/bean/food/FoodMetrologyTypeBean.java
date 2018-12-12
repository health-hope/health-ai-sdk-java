package com.jiankangyouyi.health.ai.api.bean.food;

import java.util.List;

/**
 * 度量衡类别信息
 * 
 * @author yangsongbo
 *
 */
public class FoodMetrologyTypeBean {

	/**
	 * 分类：主食、米饭等
	 */
	private String classify;

	/**
	 * 度量衡信息列表
	 */
	private List<FoodMetrologyInfoBean> metrologyInfoList;

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public List<FoodMetrologyInfoBean> getMetrologyInfoList() {
		return metrologyInfoList;
	}

	public void setMetrologyInfoList(List<FoodMetrologyInfoBean> metrologyInfoList) {
		this.metrologyInfoList = metrologyInfoList;
	}

	@Override
	public String toString() {
		return "FoodMetrologyTypeBean [classify=" + classify + ", metrologyInfoList=" + metrologyInfoList + "]";
	}


}
