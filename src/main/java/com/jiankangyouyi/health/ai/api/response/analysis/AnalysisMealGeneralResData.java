package com.jiankangyouyi.health.ai.api.response.analysis;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;
import com.jiankangyouyi.health.ai.api.bean.analysis.CompositionAnalysisResult;
import com.jiankangyouyi.health.ai.api.bean.analysis.EnergyYieldingNutrientAnalysisResult;
import com.jiankangyouyi.health.ai.api.bean.analysis.MealAnalysisResult;

/**
 * 
 * TODO:饮食分析通用Bean
 *
 * @author yangsongbo
 * @date 2018年12月25日
 */
public class AnalysisMealGeneralResData extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 用户摄入总量
     */
    private int userTotalIntake;

    /**
     * 标准摄入总量
     */
    private int standardTotalIntake;

    /**
     * 早餐分析
     */
    private MealAnalysisResult breakfastAnalysis;

    /**
     * 午餐分析
     */
    private MealAnalysisResult lunchAnalysis;

    /**
     * 晚餐分析
     */
    private MealAnalysisResult supperAnalysis;

    /**
     * 脂肪分析
     */
    private EnergyYieldingNutrientAnalysisResult fatAnalysis;

    /**
     * 蛋白质分析
     */
    private EnergyYieldingNutrientAnalysisResult proteinAnalysis;

    /**
     * 碳水化合物分析
     */
    private EnergyYieldingNutrientAnalysisResult carbohydrateAnalysis;

    /**
     * 营养素分析
     */
    private List<CompositionAnalysisResult> compositionAnalysis;

    public int getUserTotalIntake() {
        return userTotalIntake;
    }

    public void setUserTotalIntake(int userTotalIntake) {
        this.userTotalIntake = userTotalIntake;
    }

    public int getStandardTotalIntake() {
        return standardTotalIntake;
    }

    public void setStandardTotalIntake(int standardTotalIntake) {
        this.standardTotalIntake = standardTotalIntake;
    }

    public MealAnalysisResult getBreakfastAnalysis() {
        return breakfastAnalysis;
    }

    public void setBreakfastAnalysis(MealAnalysisResult breakfastAnalysis) {
        this.breakfastAnalysis = breakfastAnalysis;
    }

    public MealAnalysisResult getLunchAnalysis() {
        return lunchAnalysis;
    }

    public void setLunchAnalysis(MealAnalysisResult lunchAnalysis) {
        this.lunchAnalysis = lunchAnalysis;
    }

    public MealAnalysisResult getSupperAnalysis() {
        return supperAnalysis;
    }

    public void setSupperAnalysis(MealAnalysisResult supperAnalysis) {
        this.supperAnalysis = supperAnalysis;
    }

    public List<CompositionAnalysisResult> getCompositionAnalysis() {
        return compositionAnalysis;
    }

    public void setCompositionAnalysis(List<CompositionAnalysisResult> compositionAnalysis) {
        this.compositionAnalysis = compositionAnalysis;
    }

    public EnergyYieldingNutrientAnalysisResult getFatAnalysis() {
        return fatAnalysis;
    }

    public void setFatAnalysis(EnergyYieldingNutrientAnalysisResult fatAnalysis) {
        this.fatAnalysis = fatAnalysis;
    }

    public EnergyYieldingNutrientAnalysisResult getProteinAnalysis() {
        return proteinAnalysis;
    }

    public void setProteinAnalysis(EnergyYieldingNutrientAnalysisResult proteinAnalysis) {
        this.proteinAnalysis = proteinAnalysis;
    }

    public EnergyYieldingNutrientAnalysisResult getCarbohydrateAnalysis() {
        return carbohydrateAnalysis;
    }

    public void setCarbohydrateAnalysis(EnergyYieldingNutrientAnalysisResult carbohydrateAnalysis) {
        this.carbohydrateAnalysis = carbohydrateAnalysis;
    }

    @Override
    public String toString() {
        return "AnalysisMealGeneralResData [userTotalIntake=" + userTotalIntake + ", standardTotalIntake="
            + standardTotalIntake + ", breakfastAnalysis=" + breakfastAnalysis + ", lunchAnalysis=" + lunchAnalysis
            + ", supperAnalysis=" + supperAnalysis + ", fatAnalysis=" + fatAnalysis + ", proteinAnalysis="
            + proteinAnalysis + ", carbohydrateAnalysis=" + carbohydrateAnalysis + ", compositionAnalysis="
            + compositionAnalysis + "]";
    }

}
