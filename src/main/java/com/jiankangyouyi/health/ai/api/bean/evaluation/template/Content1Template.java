package com.jiankangyouyi.health.ai.api.bean.evaluation.template;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 内容模板1 : CONTENT_TEMPLATE_1
 * 
 * 
 * @author yangsongbo
 *
 */
public class Content1Template implements IEvaluationTemplate{
	
	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 内容
	 */
	private List<String> value;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getValue() {
		return value;
	}

	public void setValue(List<String> value) {
		this.value = value;
	}
	


    public String toString(){
        String sep = "; ";
        StringBuffer sb = new StringBuffer();
        sb.append("Content1Template").append(":");
        sb.append("[title]").append(" = ").append(getTitle()).append(sep);
        sb.append("[value]").append(" = ").append(getValue()).append(sep);
        return sb.toString();
    }


    public Map<String,Object> putFieldValueToMap() {
   		Map<String,Object> map_=new HashMap<String,Object>();
    	map_.put("title",getTitle());
    	map_.put("value",getValue());
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
    	if(null!=map.get("value")){
    		this.setValue((List<String>)map.get("value"));
    	}else{
    		if(isDealNull && map.containsKey("value"))
    			this.setValue((List<String>)map.get("value"));
    	}	
    }


    public static final String field_title = "title";
    public static final String field_value = "value";

}
