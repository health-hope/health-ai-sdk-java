package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.DialogRecordResponse;

/**
 * 语音记录请求接口
 * 
 * @author yangsongbo
 *
 */
public class DialogRecordRequest extends HealthAiRequest<DialogRecordResponse> {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/dialog/record.do";

	/**
	 * 图片的base64编码，优先支持image参数
	 */
	private String text;

	@Override
	public String getApiUrl() {
		return API_URL;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "DialogRecordRequest [text=" + text + "]";
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}

}
