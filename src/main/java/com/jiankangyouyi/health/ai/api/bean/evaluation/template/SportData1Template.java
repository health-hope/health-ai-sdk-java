package com.jiankangyouyi.health.ai.api.bean.evaluation.template;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 运动数据模板1 : SPORT_DATA_TEMPLATE_1
 * 
 * 
 * @author yangsongbo
 *
 */
public class SportData1Template implements IEvaluationTemplate {

	/**
	 * 分类,如：有氧运动
	 */
	private String classify;

	/**
	 * 图片
	 */
	private String imageUrl;
	
	/**
	 *  内容
	 */
	private List<String> value;

	/**
	 * 数量
	 */
	private String count;

	/**
	 * 单位
	 */
	private String unit;
	
	
	

	public SportData1Template() {
		super();
	}

	public SportData1Template(String classify, String imageUrl, List<String> value, String count, String unit) {
		super();
		this.classify = classify;
		this.imageUrl = imageUrl;
		this.value = value;
		this.count = count;
		this.unit = unit;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<String> getValue() {
		return value;
	}

	public void setValue(List<String> value) {
		this.value = value;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}



    public String toString(){
        String sep = "; ";
        StringBuffer sb = new StringBuffer();
        sb.append("SportData1Template").append(":");
        sb.append("[classify]").append(" = ").append(getClassify()).append(sep);
        sb.append("[imageUrl]").append(" = ").append(getImageUrl()).append(sep);
        sb.append("[value]").append(" = ").append(getValue()).append(sep);
        sb.append("[count]").append(" = ").append(getCount()).append(sep);
        sb.append("[unit]").append(" = ").append(getUnit()).append(sep);
        return sb.toString();
    }


    public Map<String,Object> putFieldValueToMap() {
   		Map<String,Object> map_=new HashMap<String,Object>();
    	map_.put("classify",getClassify());
    	map_.put("imageUrl",getImageUrl());
    	map_.put("value",getValue());
    	map_.put("count",getCount());
    	map_.put("unit",getUnit());
		return map_;
    }


    @SuppressWarnings("unchecked")
    public void doMapToDtoValue(Map<String, Object> map,boolean isDealNull) {
    	if(null!=map.get("classify")){
    		this.setClassify((String)map.get("classify"));
    	}else{
    		if(isDealNull && map.containsKey("classify"))
    			this.setClassify((String)map.get("classify"));
    	}	
    	if(null!=map.get("imageUrl")){
    		this.setImageUrl((String)map.get("imageUrl"));
    	}else{
    		if(isDealNull && map.containsKey("imageUrl"))
    			this.setImageUrl((String)map.get("imageUrl"));
    	}	
    	if(null!=map.get("value")){
    		this.setValue((List<String>)map.get("value"));
    	}else{
    		if(isDealNull && map.containsKey("value"))
    			this.setValue((List<String>)map.get("value"));
    	}	
    	if(null!=map.get("count")){
    		this.setCount((String)map.get("count"));
    	}else{
    		if(isDealNull && map.containsKey("count"))
    			this.setCount((String)map.get("count"));
    	}	
    	if(null!=map.get("unit")){
    		this.setUnit((String)map.get("unit"));
    	}else{
    		if(isDealNull && map.containsKey("unit"))
    			this.setUnit((String)map.get("unit"));
    	}	
    }


    public static final String field_classify = "classify";
    public static final String field_imageUrl = "imageUrl";
    public static final String field_value = "value";
    public static final String field_count = "count";
    public static final String field_unit = "unit";

}
