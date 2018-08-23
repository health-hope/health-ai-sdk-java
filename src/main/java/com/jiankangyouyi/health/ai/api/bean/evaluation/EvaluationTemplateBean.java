package com.jiankangyouyi.health.ai.api.bean.evaluation;

import java.util.HashMap;
import java.util.Map;

import com.jiankangyouyi.health.ai.api.bean.evaluation.template.IEvaluationTemplate;

/**
 * 评估结果-评测模板bean
 * 
 * @author yangsongbo
 *
 */
public class EvaluationTemplateBean {

	/**
	 * 模板类型
	 */
	private String templateType;

	/**
	 * 引用模板
	 */
	private IEvaluationTemplate template;
	


	public EvaluationTemplateBean() {
		super();
	}

	public EvaluationTemplateBean(String templateType, IEvaluationTemplate template) {
		super();
		this.templateType = templateType;
		this.template = template;
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



    public String toString(){
        String sep = "; ";
        StringBuffer sb = new StringBuffer();
        sb.append("EvaluationReportContent").append(":");
        sb.append("[templateType]").append(" = ").append(getTemplateType()).append(sep);
        sb.append("[template]").append(" = ").append(getTemplate()).append(sep);
        return sb.toString();
    }


    public Map<String,Object> putFieldValueToMap() {
   		Map<String,Object> map_=new HashMap<String,Object>();
    	map_.put("templateType",getTemplateType());
    	map_.put("template",getTemplate());
		return map_;
    }


    public void doMapToDtoValue(Map<String, Object> map,boolean isDealNull) {
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
    }


    public static final String field_templateType = "templateType";
    public static final String field_template = "template";

   
}
