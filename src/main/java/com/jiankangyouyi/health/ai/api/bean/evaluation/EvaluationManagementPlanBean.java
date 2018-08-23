package com.jiankangyouyi.health.ai.api.bean.evaluation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 评估管理方案
 * 
 * @author yangsongbo
 *
 */
public class EvaluationManagementPlanBean {

	/**
	 * 健康管理建议
	 */
	private String healthAdvice;

	/**
	 * 风险等级 {@link EvaluationRiskLevelEnum}
	 */
	private String riskLevel;

	/**
	 * 管理方案分类
	 */
	private List<PlanClassify> planClassify;

	public String getHealthAdvice() {
		return healthAdvice;
	}

	public void setHealthAdvice(String healthAdvice) {
		this.healthAdvice = healthAdvice;
	}

	public String getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public List<PlanClassify> getPlanClassify() {
		return planClassify;
	}

	public void setPlanClassify(List<PlanClassify> planClassify) {
		this.planClassify = planClassify;
	}

	public static class PlanClassify {

		/**
		 * 方案名称
		 */
		private String planName;

		/**
		 * 方案内容
		 */
		private List<EvaluationTemplateBean> content;
		
		
		

		public String getPlanName() {
			return planName;
		}

		public void setPlanName(String planName) {
			this.planName = planName;
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
	        sb.append("PlanClassify").append(":");
	        sb.append("[planName]").append(" = ").append(getPlanName()).append(sep);
	        sb.append("[content]").append(" = ").append(getContent()).append(sep);
	        return sb.toString();
	    }


	    public Map<String,Object> putFieldValueToMap() {
	   		Map<String,Object> map_=new HashMap<String,Object>();
	    	map_.put("planName",getPlanName());
	    	map_.put("content",getContent());
			return map_;
	    }


	    @SuppressWarnings("unchecked")
	    public void doMapToDtoValue(Map<String, Object> map,boolean isDealNull) {
	    	if(null!=map.get("planName")){
	    		this.setPlanName((String)map.get("planName"));
	    	}else{
	    		if(isDealNull && map.containsKey("planName"))
	    			this.setPlanName((String)map.get("planName"));
	    	}	
	    	if(null!=map.get("content")){
	    		this.setContent((List<EvaluationTemplateBean>)map.get("content"));
	    	}else{
	    		if(isDealNull && map.containsKey("content"))
	    			this.setContent((List<EvaluationTemplateBean>)map.get("content"));
	    	}	
	    }


	    public static final String field_planName = "planName";
	    public static final String field_content = "content";

	}
	


    public String toString(){
        String sep = "; ";
        StringBuffer sb = new StringBuffer();
        sb.append("EvaluationManagementPlanBean").append(":");
        sb.append("[healthAdvice]").append(" = ").append(getHealthAdvice()).append(sep);
        sb.append("[riskLevel]").append(" = ").append(getRiskLevel()).append(sep);
        sb.append("[planClassify]").append(" = ").append(getPlanClassify()).append(sep);
        return sb.toString();
    }


    public Map<String,Object> putFieldValueToMap() {
   		Map<String,Object> map_=new HashMap<String,Object>();
    	map_.put("healthAdvice",getHealthAdvice());
    	map_.put("riskLevel",getRiskLevel());
    	map_.put("planClassify",getPlanClassify());
		return map_;
    }


    @SuppressWarnings("unchecked")
    public void doMapToDtoValue(Map<String, Object> map,boolean isDealNull) {
    	if(null!=map.get("healthAdvice")){
    		this.setHealthAdvice((String)map.get("healthAdvice"));
    	}else{
    		if(isDealNull && map.containsKey("healthAdvice"))
    			this.setHealthAdvice((String)map.get("healthAdvice"));
    	}	
    	if(null!=map.get("riskLevel")){
    		this.setRiskLevel((String)map.get("riskLevel"));
    	}else{
    		if(isDealNull && map.containsKey("riskLevel"))
    			this.setRiskLevel((String)map.get("riskLevel"));
    	}	
    	if(null!=map.get("planClassify")){
    		this.setPlanClassify((List<PlanClassify>)map.get("planClassify"));
    	}else{
    		if(isDealNull && map.containsKey("planClassify"))
    			this.setPlanClassify((List<PlanClassify>)map.get("planClassify"));
    	}	
    }


    public static final String field_healthAdvice = "healthAdvice";
    public static final String field_riskLevel = "riskLevel";
    public static final String field_planClassify = "planClassify";


}
