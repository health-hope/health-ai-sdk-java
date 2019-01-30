package com.jiankangyouyi.health.ai.api.bean.evaluation;

import java.util.List;


/**
 * 评测用户信息
 * 
 * @since v1.0
 * @author dongle
 *
 */
public class EvaluationUserInfoReqBean {

	/**
	 * 用户名称
	 */
    private String userName;

    /**
     * 性别 1 男 2 女
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

	private String userId;

	private String activityLevel;

	/**
	 * 身体状况 慢病情况
	 */
	private List<String> bodyStatus;

	public List<String> getBodyStatus() {
		return bodyStatus;
	}

	public void setBodyStatus(List<String> bodyStatus) {
		this.bodyStatus = bodyStatus;
	}

	public String getActivityLevel() {
		return activityLevel;
	}

	public void setActivityLevel(String activityLevel) {
		this.activityLevel = activityLevel;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

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

}
