package com.jiankangyouyi.health.ai.api.bean.evaluation.template;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 内容模板1 : CONTENT_TEMPLATE_2
 * 
 * 
 * @author yangsongbo
 *
 */
public class Content2Template implements IEvaluationTemplate{
	
	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 模板类型
	 */
	private String templateType;
	
	/**
	 * 引用模板
	 */
	private IEvaluationTemplate template;
	
	/**
	 * 说明
	 */
	private List<String> explain;
	
	/**
	 * 备注
	 */
	private List<String> remark;
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTemplateType() {
		return templateType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	public IEvaluationTemplate getTemplate() {
		return template;
	}

	public void setTemplate(IEvaluationTemplate template) {
		this.template = template;
	}

    public List<String> getExplain() {
		return explain;
	}

	public void setExplain(List<String> explain) {
		this.explain = explain;
	}

	public List<String> getRemark() {
		return remark;
	}

	public void setRemark(List<String> remark) {
		this.remark = remark;
	}

	public String toString(){
        String sep = "; ";
        StringBuffer sb = new StringBuffer();
        sb.append("Content2Template").append(":");
        sb.append("[title]").append(" = ").append(getTitle()).append(sep);
        sb.append("[templateType]").append(" = ").append(getTemplateType()).append(sep);
        sb.append("[template]").append(" = ").append(getTemplate()).append(sep);
        sb.append("[explain]").append(" = ").append(getExplain()).append(sep);
        sb.append("[remark]").append(" = ").append(getRemark()).append(sep);
        return sb.toString();
    }


    public Map<String,Object> putFieldValueToMap() {
   		Map<String,Object> map_=new HashMap<String,Object>();
    	map_.put("title",getTitle());
    	map_.put("templateType",getTemplateType());
    	map_.put("template",getTemplate());
    	map_.put("explain",getExplain());
    	map_.put("remark",getRemark());
		return map_;
    }


    @SuppressWarnings("unchecked")
	public void doMapToDtoValue(Map<String, Object> map,boolean isDealNull) {
    	if(null!=map.get("title")){
    		this.setTitle((String)map.get("title"));
    	}else{
    		if(isDealNull && map.containsKey("title"))
    			this.setTitle((String)map.get("title"));
    	}	
    	if(null!=map.get("templateType")){
    		this.setTemplateType((String)map.get("templateType"));
    	}else{
    		if(isDealNull && map.containsKey("templateType"))
    			this.setTemplateType((String)map.get("templateType"));
    	}	
    	if(null!=map.get("template")){
    		this.setTemplate((IEvaluationTemplate)map.get("template"));
    	}else{
    		if(isDealNull && map.containsKey("template"))
    			this.setTemplate((IEvaluationTemplate)map.get("template"));
    	}	
    	if(null!=map.get("explain")){
    		this.setExplain((List<String>)map.get("explain"));
    	}else{
    		if(isDealNull && map.containsKey("explain"))
    			this.setExplain((List<String>)map.get("explain"));
    	}	
    	if(null!=map.get("remark")){
    		this.setRemark((List<String>)map.get("remark"));
    	}else{
    		if(isDealNull && map.containsKey("remark"))
    			this.setRemark((List<String>)map.get("remark"));
    	}	
    }


    public static final String field_title = "title";
    public static final String field_templateType = "templateType";
    public static final String field_template = "template";
    public static final String field_explain = "explain";
    public static final String field_remark = "remark";

}
