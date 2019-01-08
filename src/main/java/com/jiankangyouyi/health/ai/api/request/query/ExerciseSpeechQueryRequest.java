package com.jiankangyouyi.health.ai.api.request.query;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.PageInfo;
import com.jiankangyouyi.health.ai.api.request.query.bean.BodyDataBean;
import com.jiankangyouyi.health.ai.api.request.query.bean.HighlightBean;
import com.jiankangyouyi.health.ai.api.response.query.ExerciseQueryGeneralResponse;

/**
 * 运动语音查询
 *
 * @since v2.0
 * @see /v2/exercise/speech/quey.do
 * @author yangsongbo
 */
public class ExerciseSpeechQueryRequest extends HealthAiRequest<ExerciseQueryGeneralResponse> {


	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/query/speech/exercise/list.do";
	
	/** 
	 * 语音数据
	 * </p> 
	 * 1、原始 PCM 的录音参数必须符合 8k/16k 采样率、16bit 位深、单声道，
	 *    支持的格式有：pcm（不压缩）、wav（不压缩，pcm编码）、amr（压缩格式）、map3
	 * </p>
	 * 2、目前系统支持的语音时长上限为60s，请不要超过这个长度，否则会返回错误。
	 * </p>
     */
	private String speech;
	
	/**
	 * 音频格式
	 */
	private String format;
	
	/**
	 * 采样率
	 */
	private int rate;

	/** 分页 **/
	private PageInfo pageInfo;
	
	/**
	 * 身体数据
	 */
	private BodyDataBean bodyData;
	
	/**
	 * 高亮设置
	 */
	private HighlightBean highlight;

	
	

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public BodyDataBean getBodyData() {
		return bodyData;
	}

	public void setBodyData(BodyDataBean bodyData) {
		this.bodyData = bodyData;
	}

	public String getSpeech() {
		return speech;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
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
