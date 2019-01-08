package com.jiankangyouyi.health.ai.api.bean.analysis;

/**
 * TODO:三大产能营养素分析项
 *
 * @author yangsongbo
 * @date 2018年12月25日
 */
public class EnergyYieldingNutrientAnalysisResult {

    /**
     * 标准摄入百分比上限
     */
    private int standardPercentUpper;

    /**
     * 标准摄入百分比下限
     */
    private int standardPercentLower;

    /**
     * 用户摄入百分比
     */
    private int userPercent;

    public EnergyYieldingNutrientAnalysisResult() {
        super();
    }

    public EnergyYieldingNutrientAnalysisResult(int standardPercentUpper, int standardPercentLower, int userPercent) {
        super();
        this.standardPercentUpper = standardPercentUpper;
        this.standardPercentLower = standardPercentLower;
        this.userPercent = userPercent;
    }

    public int getStandardPercentUpper() {
        return standardPercentUpper;
    }

    public void setStandardPercentUpper(int standardPercentUpper) {
        this.standardPercentUpper = standardPercentUpper;
    }

    public int getStandardPercentLower() {
        return standardPercentLower;
    }

    public void setStandardPercentLower(int standardPercentLower) {
        this.standardPercentLower = standardPercentLower;
    }

    public int getUserPercent() {
        return userPercent;
    }

    public void setUserPercent(int userPercent) {
        this.userPercent = userPercent;
    }

    @Override
    public String toString() {
        return "EnergyYieldingNutrientAnalysisResult [standardPercentUpper=" + standardPercentUpper
            + ", standardPercentLower=" + standardPercentLower + ", userPercent=" + userPercent + "]";
    }

}
