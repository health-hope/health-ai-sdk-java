package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.PageInfo;
import com.jiankangyouyi.health.ai.api.response.SearchFoodListResponse;

/**
 * 查询食物列表
 * 
 * @author yangsongbo
 *
 */
public class SearchFoodListRequest extends HealthAiRequest<SearchFoodListResponse> {

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/food/list.do";

	
	/**
	 * 食物名称
	 */
	private String foodName;
	
	/**
	 * 分页信息
	 */
	private PageInfo pageInfo;
	

	@Override
	public String getApiUrl() {
		return API_URL;
	}
	

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}
	
	@Override
	public String toString() {
		return "SearchFoodListRequest [foodName=" + foodName + ", pageInfo=" + pageInfo + "]";
	}


	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}

}
