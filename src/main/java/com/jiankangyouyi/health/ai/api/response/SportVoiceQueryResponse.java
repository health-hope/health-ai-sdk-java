package com.jiankangyouyi.health.ai.api.response;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/***
 * 运动视频查询
 * 
 */
public class SportVoiceQueryResponse extends HealthAiResponse{
	
	private static final long serialVersionUID = 1L;

	/**
	 * 讲解音频URL
	 */
	private String commentUrl;
	
	/**
	 * 背景音乐音频URL
	 */
	private String backgroundUrl;
	
	
	public String getCommentUrl() {
		return commentUrl;
	}
	public void setCommentUrl(String commentUrl) {
		this.commentUrl = commentUrl;
	}
	public String getBackgroundUrl() {
		return backgroundUrl;
	}
	public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}
   
}
