package com.jiankangyouyi.health.ai.api.request;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.AnalysisMealResponse;


/**
 * 饮食分析
 * 
 * @see /v2/analysis/meal.do
 * @author yangsongbo
 *
 */
public class AnalysisMealRequest extends HealthAiRequest<AnalysisMealResponse> {

	
	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/analysis/meal.do";
	
	
	/**
	 * 早餐
	 */
	private List<MealData> breakfast;

	/**
	 * 午餐
	 */
	private List<MealData> lunch;

	/**
	 * 晚餐
	 */
	private List<MealData> supper;


	/**
	 * 身体数据
	 */
	private BodyData bodyData;
	
	
	
	@Override
	public String getApiUrl() {
		return API_URL;
	}
	

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}
	

	public List<MealData> getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(List<MealData> breakfast) {
		this.breakfast = breakfast;
	}

	public List<MealData> getLunch() {
		return lunch;
	}

	public void setLunch(List<MealData> lunch) {
		this.lunch = lunch;
	}

	public List<MealData> getSupper() {
		return supper;
	}

	public void setSupper(List<MealData> supper) {
		this.supper = supper;
	}

	public BodyData getBodyData() {
		return bodyData;
	}

	public void setBodyData(BodyData bodyData) {
		this.bodyData = bodyData;
	}

	public static class MealData {

		/**
		 * 食物ID
		 */
		private String foodId;

		/**
		 * 饮食数量
		 */
		private String count;

		public MealData() {
			super();
		}

		public MealData(String foodId, String count) {
			super();
			this.foodId = foodId;
			this.count = count;
		}

		public String getFoodId() {
			return foodId;
		}

		public void setFoodId(String foodId) {
			this.foodId = foodId;
		}

		public String getCount() {
			return count;
		}

		public void setCount(String count) {
			this.count = count;
		}

		@Override
		public String toString() {
			return "MealData [foodId=" + foodId + ", count=" + count + "]";
		}
	}

	public static class BodyData {

		/**
		 * 性别
		 */
		private String gender;

		/**
		 * 生日
		 */
		private String birthday;

		/**
		 * 非健康人群分类
		 */
		private String nonHealthyCrowdClassify;

		/**
		 * 孕产妇人群分类
		 */
		private String pregnancyCrowdClassify;

		public BodyData() {
			super();
		}

		public BodyData(String gender, String birthday, String nonHealthyCrowdClassify, String pregnancyCrowdClassify) {
			super();
			this.gender = gender;
			this.birthday = birthday;
			this.nonHealthyCrowdClassify = nonHealthyCrowdClassify;
			this.pregnancyCrowdClassify = pregnancyCrowdClassify;
		}

		public String getNonHealthyCrowdClassify() {
			return nonHealthyCrowdClassify;
		}

		public void setNonHealthyCrowdClassify(String nonHealthyCrowdClassify) {
			this.nonHealthyCrowdClassify = nonHealthyCrowdClassify;
		}

		public String getPregnancyCrowdClassify() {
			return pregnancyCrowdClassify;
		}

		public void setPregnancyCrowdClassify(String pregnancyCrowdClassify) {
			this.pregnancyCrowdClassify = pregnancyCrowdClassify;
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

		@Override
		public String toString() {
			return "BodyData [gender=" + gender + ", birthday=" + birthday + ", nonHealthyCrowdClassify="
					+ nonHealthyCrowdClassify + ", pregnancyCrowdClassify=" + pregnancyCrowdClassify + "]";
		}

		
	}


}
