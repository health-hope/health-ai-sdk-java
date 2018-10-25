package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.SportVoiceQueryResponse;

import cn.jianzhishidai.core.annotations.JavaBean;

/***
 * 运动音频查询
 * 
 * @see /v2/sports/voice/query.do
 */
@JavaBean
public class SportVoiceQueryRequest extends HealthAiRequest<SportVoiceQueryResponse> {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/sports/voice/query.do";

	/**
	 * 运动音频类型
	 * </p>
	 * 1 跑走运动音频
	 */
	private String sportVoiceType;

	public String getSportVoiceType() {
		return sportVoiceType;
	}

	public void setSportVoiceType(String sportVoiceType) {
		this.sportVoiceType = sportVoiceType;
	}

	@Override
	public String getApiUrl() {
		return API_URL;
	}

	@Override
	public void check() {

	}

}
