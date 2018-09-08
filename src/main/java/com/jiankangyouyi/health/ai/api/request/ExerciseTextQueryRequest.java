package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.PageInfo;
import com.jiankangyouyi.health.ai.api.bean.query.BodyDataBean;
import com.jiankangyouyi.health.ai.api.bean.query.HighlightBean;
import com.jiankangyouyi.health.ai.api.response.ExerciseQueryGeneralResponse;

/**
 * 运动文本查询
 *
 * @since v2.0
 * @see /v2/exercise/text/quey.do
 * @author yangsongbo
 */
public class ExerciseTextQueryRequest extends HealthAiRequest<ExerciseQueryGeneralResponse> {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/query/text/exercise/list.do";

	/** 查询文本 **/
	private String text;

	/**
	 * 数量
	 */
	private String count;

	/**
	 * 身体数据
	 */
	private BodyDataBean bodyData;

	/** 分页 **/
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

	public BodyDataBean getBodyData() {
		return bodyData;
	}

	public void setBodyData(BodyDataBean bodyData) {
		this.bodyData = bodyData;
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
		// TODO Auto-generated method stub

	}
}
