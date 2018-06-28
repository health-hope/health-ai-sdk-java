package com.jiankangyouyi.health.ai.api;

import java.io.Serializable;

public abstract class HealthAiResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 处理码
	 */
	private String retCode;

	/**
	 * 处理信息
	 */
	private String retInfo;

	/**
	 * 当前时间 yyyy-MM-dd HH:mm:dd
	 */
	private String curTime;

	/**
	 * 请求编号
	 */
	private String sn;

	public String getRetCode() {
		return retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(String retInfo) {
		this.retInfo = retInfo;
	}

	public String getCurTime() {
		return curTime;
	}

	public void setCurTime(String curTime) {
		this.curTime = curTime;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	@Override
	public String toString() {
		return "HealthAiResponse [retCode=" + retCode + ", retInfo=" + retInfo + ", curTime=" + curTime + ", sn=" + sn
				+ "]";
	}

	
}
