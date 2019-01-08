package com.jiankangyouyi.health.ai.api.request.query.bean;

/**
 * 高亮属性Bean
 * @author yangsongbo
 *
 */
public class HighlightBean {
	
	/**
	 * 高亮起始标签
	 */
	private String highlightSimplePre;
	
	/**
	 * 高亮终止标签
	 */
	private String highlightSimplePost;
	
	
	public HighlightBean(){
		
	}
	
	public HighlightBean(String highlightSimplePre,String highlightSimplePost){
		this.highlightSimplePre = highlightSimplePre;
		this.highlightSimplePost = highlightSimplePost;
	}

	public String getHighlightSimplePre() {
		return highlightSimplePre;
	}

	public void setHighlightSimplePre(String highlightSimplePre) {
		this.highlightSimplePre = highlightSimplePre;
	}

	public String getHighlightSimplePost() {
		return highlightSimplePost;
	}

	public void setHighlightSimplePost(String highlightSimplePost) {
		this.highlightSimplePost = highlightSimplePost;
	}
	
	
	
}
