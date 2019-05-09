package com.jiankangyouyi.health.ai.api.request.analysis;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.bean.analysis.MealDataBean;
import com.jiankangyouyi.health.ai.api.response.analysis.AnalysisMealGeneralResData;

import java.util.List;

/**
 * @ClassName AnalysisFatMealReqData
 * @Description 肥胖人群饮食分析 请求bean
 * @Author wanggang
 * @Date 2019/5/9 15:25
 **/
public class AnalysisFatMealReqData extends HealthAiRequest<AnalysisMealGeneralResData> {

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/analysis/fat/meal.do";

    /**
     * 早餐
     */
    private List<MealDataBean> breakfast;

    /**
     * 午餐
     */
    private List<MealDataBean> lunch;

    /**
     * 晚餐
     */
    private List<MealDataBean> supper;

    /**
     * 性别
     */
    private String gender;

    /**
     * 年龄
     */
    private String age;

    /**
     * 生日
     */
    private String birthday;

    public List<MealDataBean> getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(List<MealDataBean> breakfast) {
        this.breakfast = breakfast;
    }

    public List<MealDataBean> getLunch() {
        return lunch;
    }

    public void setLunch(List<MealDataBean> lunch) {
        this.lunch = lunch;
    }

    public List<MealDataBean> getSupper() {
        return supper;
    }

    public void setSupper(List<MealDataBean> supper) {
        this.supper = supper;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String getApiUrl() {
        return API_URL;
    }

    @Override
    public void check() {
        // TODO Auto-generated method stub

    }

}
