package com.jiankangyouyi.health.ai.api;

import java.io.Serializable;

import org.springframework.util.Assert;

/**
 * 用来定义分页请求信息
 * 
 * @author YangSongbo
 */
public class PageInfo implements Serializable {


	private static final long serialVersionUID = 1L;

	
	private int pageNum = 1;
	
	private int pageSize = 10;
	
	
	public PageInfo() {

	}


	public PageInfo(int pageNum, int pageSize) {
		this.pageNum = pageNum;
		this.pageSize = pageSize;
	}

	public PageInfo(String pageNum, String pageSize) {
		Assert.hasText(pageNum, "This pageNum must have text; it must not be null, empty, or blank");
		Assert.hasText(pageSize, "This pageSize must have text; it must not be null, empty, or blank");
		this.pageNum = Integer.valueOf(pageNum);
		this.pageSize = Integer.valueOf(pageSize);
		
	}


	public int getPageNum() {
		return pageNum;
	}


	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	@Override
	public String toString() {
		return "PageInfo [pageNum=" + pageNum + ", pageSize=" + pageSize + "]";
	}
	
	

}
