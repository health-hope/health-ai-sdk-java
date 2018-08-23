package com.jiankangyouyi.health.ai.api.bean.evaluation;

import java.util.HashMap;
import java.util.Map;


/**
 * 评测用户信息
 * 
 * @since v1.0
 * @author yangsongbo
 *
 */
public class EvaluationUserInfoBean {

	/**
	 * 用户名称
	 */
    private String userName;

    /**
     * 性别 1 男 2 女
     * @see GenderEnum
     */
    private String gender;
    
    /**
     * 出生日期,yyyy-MM-dd
     * 
     */
    private String birthday;

    /**
     * 身高（cm），存储Decimal
     */
    private String height;

    /**
     * 体重（kg），存储Decimal
     */
    private String weight;


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}



    public String toString(){
        String sep = "; ";
        StringBuffer sb = new StringBuffer();
        sb.append("EvaluationUserInfoBean").append(":");
        sb.append("[userName]").append(" = ").append(getUserName()).append(sep);
        sb.append("[gender]").append(" = ").append(getGender()).append(sep);
        sb.append("[birthday]").append(" = ").append(getBirthday()).append(sep);
        sb.append("[height]").append(" = ").append(getHeight()).append(sep);
        sb.append("[weight]").append(" = ").append(getWeight()).append(sep);
        return sb.toString();
    }


    public Map<String,Object> putFieldValueToMap() {
   		Map<String,Object> map_=new HashMap<String,Object>();
    	map_.put("userName",getUserName());
    	map_.put("gender",getGender());
    	map_.put("birthday",getBirthday());
    	map_.put("height",getHeight());
    	map_.put("weight",getWeight());
		return map_;
    }


    public void doMapToDtoValue(Map<String, Object> map,boolean isDealNull) {
    	if(null!=map.get("userName")){
    		this.setUserName((String)map.get("userName"));
    	}else{
    		if(isDealNull && map.containsKey("userName"))
    			this.setUserName((String)map.get("userName"));
    	}	
    	if(null!=map.get("gender")){
    		this.setGender((String)map.get("gender"));
    	}else{
    		if(isDealNull && map.containsKey("gender"))
    			this.setGender((String)map.get("gender"));
    	}	
    	if(null!=map.get("birthday")){
    		this.setBirthday((String)map.get("birthday"));
    	}else{
    		if(isDealNull && map.containsKey("birthday"))
    			this.setBirthday((String)map.get("birthday"));
    	}	
    	
    	if(null!=map.get("height")){
    		this.setHeight((String)map.get("height"));
    	}else{
    		if(isDealNull && map.containsKey("height"))
    			this.setHeight((String)map.get("height"));
    	}	
    	if(null!=map.get("weight")){
    		this.setWeight((String)map.get("weight"));
    	}else{
    		if(isDealNull && map.containsKey("weight"))
    			this.setWeight((String)map.get("weight"));
    	}	
    	
    }


    public static final String field_userName = "userName";
    public static final String field_gender = "gender";
    public static final String field_birthday = "birthday";
    public static final String field_height = "height";
    public static final String field_weight = "weight";

}
