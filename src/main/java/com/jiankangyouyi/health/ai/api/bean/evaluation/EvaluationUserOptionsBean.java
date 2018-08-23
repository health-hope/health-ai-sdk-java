package com.jiankangyouyi.health.ai.api.bean.evaluation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 用户的评测选项
 * 
 * @since v1.0
 * @author yangsongbo
 *
 */
public class EvaluationUserOptionsBean {

	/**
	 * 问题编号
	 */
	private String questionCode;

	/**
	 * 选项编号
	 */
	private List<String> optionCodes;
	

	public EvaluationUserOptionsBean() {
		super();
	}

	public EvaluationUserOptionsBean(String questionCode, List<String> optionCodes) {
		super();
		this.questionCode = questionCode;
		this.optionCodes = optionCodes;
	}

	public String getQuestionCode() {
		return questionCode;
	}

	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}

	public List<String> getOptionCodes() {
		return optionCodes;
	}

	public void setOptionCodes(List<String> optionCodes) {
		this.optionCodes = optionCodes;
	}

	


    public String toString(){
        String sep = "; ";
        StringBuffer sb = new StringBuffer();
        sb.append("EvaluationUserOptionsBean").append(":");
        sb.append("[questionCode]").append(" = ").append(getQuestionCode()).append(sep);
        sb.append("[optionCodes]").append(" = ").append(getOptionCodes()).append(sep);
        return sb.toString();
    }


    public Map<String,Object> putFieldValueToMap() {
   		Map<String,Object> map_=new HashMap<String,Object>();
    	map_.put("questionCode",getQuestionCode());
    	map_.put("optionCodes",getOptionCodes());
		return map_;
    }


    @SuppressWarnings("unchecked")
    public void doMapToDtoValue(Map<String, Object> map,boolean isDealNull) {
    	if(null!=map.get("questionCode")){
    		this.setQuestionCode((String)map.get("questionCode"));
    	}else{
    		if(isDealNull && map.containsKey("questionCode"))
    			this.setQuestionCode((String)map.get("questionCode"));
    	}	
    	if(null!=map.get("optionCodes")){
    		this.setOptionCodes((List<String>)map.get("optionCodes"));
    	}else{
    		if(isDealNull && map.containsKey("optionCodes"))
    			this.setOptionCodes((List<String>)map.get("optionCodes"));
    	}	
    }


    public static final String field_questionCode = "questionCode";
    public static final String field_optionCodes = "optionCodes";

}
