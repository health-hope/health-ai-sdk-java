package com.jiankangyouyi.health.ai.api.bean.query;

/**
 * 身体数据
 * 
 * @author yangsongbo
 *
 */
public class BodyDataBean {

	/**
	 * 性别  1 男 2 女
	 */
	private String gender;

	/**
	 * 体重
	 */
	private String weight;

	public BodyDataBean() {
		super();
	}

	public BodyDataBean(String gender, String weight) {
		super();
		this.gender = gender;
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "BodyDataBean [gender=" + gender + ", weight=" + weight + "]";
	}

}
