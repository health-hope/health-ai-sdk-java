package com.jiankangyouyi.health.ai.api.request.analysis;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.bean.analysis.MealDataBean;
import com.jiankangyouyi.health.ai.api.response.analysis.AnalysisMealGeneralResData;

/**
 * 孕产妇人群饮食分析
 * 
 * @see /v2/analysis/maternal/meal.do
 * @author yangsongbo
 *
 */
public class AnalysisMaternalMealReqData extends HealthAiRequest<AnalysisMealGeneralResData> {

    private static final long serialVersionUID = 1L;

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/analysis/maternal/meal.do";

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
     * 阶段 1 <孕早期(孕第1周到13周末期间)> 2 <孕中期(孕14周到孕27周末期间)> 3 <孕晚期(孕28周后)> 4 <哺乳期>
     */
    private String stage;

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

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
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
