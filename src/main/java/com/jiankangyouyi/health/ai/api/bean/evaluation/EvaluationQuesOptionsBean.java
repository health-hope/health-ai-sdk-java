package com.jiankangyouyi.health.ai.api.bean.evaluation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 问题和选项
 * 
 * @since v1.0
 * @author yangsongbo
 *
 */
public class EvaluationQuesOptionsBean {

	/**
	 * 问题编号
	 */
	private String questionCode;

	/**
	 * 问题内容
	 */
	private String questionContent;

	/**
	 * 问题类型
	 * 
	 * @see EvaluationQuestionTypeEnum
	 */
	private String questionType;

	/**
	 * 下一题编号
	 */
	private String nextQuesCode;

	/**
	 * 选项列表
	 */
	private List<EvaluationOptionBean> options;
	
	

	public String getQuestionCode() {
		return questionCode;
	}

	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public String getNextQuesCode() {
		return nextQuesCode;
	}

	public void setNextQuesCode(String nextQuesCode) {
		this.nextQuesCode = nextQuesCode;
	}

	public List<EvaluationOptionBean> getOptions() {
		return options;
	}

	public void setOptions(List<EvaluationOptionBean> options) {
		this.options = options;
	}

	/**
	 * 评测选项Bean
	 * 
	 * @author yangsongbo
	 *
	 */
	public static class EvaluationOptionBean {

		/**
		 * 选项编码
		 * </p>
		 * 选项编码按顺序对应1、2、3、4....
		 */
		private String optionCode;

		/**
		 * 选项内容
		 */
		private String optionContent;

		/**
		 * 下一题编码
		 * </p>
		 * 不为空时，根据编码跳转到下一题，优先级高于问题中的nextQuesCode
		 */
		private String nextQuesCode;
		

		/**
		 * 是否唯一
		 * </p>
		 * true时唯一,即选择此项后不能再选其他项
		 */
		private boolean unique;
		

		public String getOptionCode() {
			return optionCode;
		}

		public void setOptionCode(String optionCode) {
			this.optionCode = optionCode;
		}

		public String getOptionContent() {
			return optionContent;
		}

		public void setOptionContent(String optionContent) {
			this.optionContent = optionContent;
		}

		public String getNextQuesCode() {
			return nextQuesCode;
		}

		public void setNextQuesCode(String nextQuesCode) {
			this.nextQuesCode = nextQuesCode;
		}

		public boolean getUnique() {
			return unique;
		}

		public void setUnique(boolean unique) {
			this.unique = unique;
		}


	    public String toString(){
	        String sep = "; ";
	        StringBuffer sb = new StringBuffer();
	        sb.append("EvaluationOptionBean").append(":");
	        sb.append("[optionCode]").append(" = ").append(getOptionCode()).append(sep);
	        sb.append("[optionContent]").append(" = ").append(getOptionContent()).append(sep);
	        sb.append("[nextQuesCode]").append(" = ").append(getNextQuesCode()).append(sep);
	        sb.append("[unique]").append(" = ").append(getUnique()).append(sep);
	        return sb.toString();
	    }


	    public Map<String,Object> putFieldValueToMap() {
	   		Map<String,Object> map_=new HashMap<String,Object>();
	    	map_.put("optionCode",getOptionCode());
	    	map_.put("optionContent",getOptionContent());
	    	map_.put("nextQuesCode",getNextQuesCode());
	    	map_.put("unique",getUnique());
			return map_;
	    }

	    public void doMapToDtoValue(Map<String, Object> map,boolean isDealNull) {
	    	if(null!=map.get("optionCode")){
	    		this.setOptionCode((String)map.get("optionCode"));
	    	}else{
	    		if(isDealNull && map.containsKey("optionCode"))
	    			this.setOptionCode((String)map.get("optionCode"));
	    	}	
	    	if(null!=map.get("optionContent")){
	    		this.setOptionContent((String)map.get("optionContent"));
	    	}else{
	    		if(isDealNull && map.containsKey("optionContent"))
	    			this.setOptionContent((String)map.get("optionContent"));
	    	}	
	    	if(null!=map.get("nextQuesCode")){
	    		this.setNextQuesCode((String)map.get("nextQuesCode"));
	    	}else{
	    		if(isDealNull && map.containsKey("nextQuesCode"))
	    			this.setNextQuesCode((String)map.get("nextQuesCode"));
	    	}
	    	if(null!=map.get("unique")){
	    		this.setUnique((boolean)map.get("unique"));
	    	}else{
	    		if(isDealNull && map.containsKey("unique"))
	    			this.setUnique((boolean)map.get("unique"));
	    	}	
	    }


	    public static final String field_optionCode = "optionCode";
	    public static final String field_optionContent = "optionContent";
	    public static final String field_nextQuesCode = "nextQuesCode";
	    public static final String field_unique = "unique";

	}
	
	


    public String toString(){
        String sep = "; ";
        StringBuffer sb = new StringBuffer();
        sb.append("EvaluationQuestionBean").append(":");
        sb.append("[questionCode]").append(" = ").append(getQuestionCode()).append(sep);
        sb.append("[questionContent]").append(" = ").append(getQuestionContent()).append(sep);
        sb.append("[questionType]").append(" = ").append(getQuestionType()).append(sep);
        sb.append("[nextQuesCode]").append(" = ").append(getNextQuesCode()).append(sep);
        sb.append("[options]").append(" = ").append(getOptions()).append(sep);
        return sb.toString();
    }


    public Map<String,Object> putFieldValueToMap() {
   		Map<String,Object> map_=new HashMap<String,Object>();
    	map_.put("questionCode",getQuestionCode());
    	map_.put("questionContent",getQuestionContent());
    	map_.put("questionType",getQuestionType());
    	map_.put("nextQuesCode",getNextQuesCode());
    	map_.put("options",getOptions());
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
    	if(null!=map.get("questionContent")){
    		this.setQuestionContent((String)map.get("questionContent"));
    	}else{
    		if(isDealNull && map.containsKey("questionContent"))
    			this.setQuestionContent((String)map.get("questionContent"));
    	}	
    	if(null!=map.get("questionType")){
    		this.setQuestionType((String)map.get("questionType"));
    	}else{
    		if(isDealNull && map.containsKey("questionType"))
    			this.setQuestionType((String)map.get("questionType"));
    	}	
    	if(null!=map.get("nextQuesCode")){
    		this.setNextQuesCode((String)map.get("nextQuesCode"));
    	}else{
    		if(isDealNull && map.containsKey("nextQuesCode"))
    			this.setNextQuesCode((String)map.get("nextQuesCode"));
    	}	
    	if(null!=map.get("options")){
    		this.setOptions((List<EvaluationOptionBean>)map.get("options"));
    	}else{
    		if(isDealNull && map.containsKey("options"))
    			this.setOptions((List<EvaluationOptionBean>)map.get("options"));
    	}	
    }


    public static final String field_questionCode = "questionCode";
    public static final String field_questionContent = "questionContent";
    public static final String field_questionType = "questionType";
    public static final String field_nextQuesCode = "nextQuesCode";
    public static final String field_options = "options";

}
