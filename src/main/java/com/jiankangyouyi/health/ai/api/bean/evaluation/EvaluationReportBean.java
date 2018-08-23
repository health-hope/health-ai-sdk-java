package com.jiankangyouyi.health.ai.api.bean.evaluation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 评估结果-评测报告
 * 
 * @author yangsongbo
 *
 */
public class EvaluationReportBean {

	/**
	 * 评测得分
	 */
	private int score;
	
	/**
	 * 评估报告内容
	 */
	private List<EvaluationTemplateBean> content;


	
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<EvaluationTemplateBean> getContent() {
		return content;
	}

	public void setContent(List<EvaluationTemplateBean> content) {
		this.content = content;
	}



    public String toString(){
        String sep = "; ";
        StringBuffer sb = new StringBuffer();
        sb.append("EvaluationReportBean").append(":");
        sb.append("[score]").append(" = ").append(getScore()).append(sep);
        sb.append("[content]").append(" = ").append(getContent()).append(sep);
        return sb.toString();
    }


    public Map<String,Object> putFieldValueToMap() {
   		Map<String,Object> map_=new HashMap<String,Object>();
    	map_.put("score",getScore());
    	map_.put("content",getContent());
		return map_;
    }


    @SuppressWarnings("unchecked")
    public void doMapToDtoValue(Map<String, Object> map,boolean isDealNull) {
    	if(null!=map.get("score")){
    		this.setScore((int)map.get("score"));
    	}else{
    		if(isDealNull && map.containsKey("score"))
    			this.setScore((int)map.get("score"));
    	}	
    	if(null!=map.get("content")){
    		this.setContent((List<EvaluationTemplateBean>)map.get("content"));
    	}else{
    		if(isDealNull && map.containsKey("content"))
    			this.setContent((List<EvaluationTemplateBean>)map.get("content"));
    	}	
    }


    public static final String field_score = "score";
    public static final String field_content = "content";

}
