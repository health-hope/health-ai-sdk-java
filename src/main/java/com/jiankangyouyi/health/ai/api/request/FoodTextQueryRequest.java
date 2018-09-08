package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.PageInfo;
import com.jiankangyouyi.health.ai.api.bean.query.HighlightBean;
import com.jiankangyouyi.health.ai.api.response.FoodQueryGeneralResponse;

/**
 * 食物文本查询
 *
 * @since v2.0
 * @see /v2/food/text/quey.do
 * @author yangsongbo
 */
public class FoodTextQueryRequest extends HealthAiRequest<FoodQueryGeneralResponse> {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/query/text/food/list.do";

	/**
	 * 查询文本
	 */
	private String text;

	/**
	 * 数量
	 */
	private String count;

	/**
	 * 分页
	 */
	private PageInfo pageInfo;

	/**
	 * 高亮设置
	 */
	private HighlightBean highlight;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public HighlightBean getHighlight() {
		return highlight;
	}

	public void setHighlight(HighlightBean highlight) {
		this.highlight = highlight;
	}

	@Override
	public String getApiUrl() {
		return API_URL;
	}

	@Override
	public void check() {

	}
}
