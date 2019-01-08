package com.jiankangyouyi.health.ai.api.bean.analysis;

/**
 * TODO:餐别分析结果
 *
 * @author yangsongbo
 * @date 2018年12月25日
 */
public class MealAnalysisResult {
    /**
     * 用户摄入量
     */
    private int userIntake;

    /**
     * 标准摄入上限
     */
    private int standardIntakeUpper;

    /**
     * 标准摄入下限
     */
    private int standardIntakeLower;

    /**
     * 标准摄入上限百分比
     */
    private int standardPercentUpper;

    /**
     * 标准摄入下限百分比
     */
    private int standardPercentLower;

    public MealAnalysisResult() {
        super();
    }

    public MealAnalysisResult(int userIntake, int standardIntakeUpper, int standardIntakeLower,
        int standardPercentUpper, int standardPercentLower) {
        super();
        this.userIntake = userIntake;
        this.standardIntakeUpper = standardIntakeUpper;
        this.standardIntakeLower = standardIntakeLower;
        this.standardPercentUpper = standardPercentUpper;
        this.standardPercentLower = standardPercentLower;
    }

    @Override
    public String toString() {
        return "MealAnalysisResult [userIntake=" + userIntake + ", standardIntakeUpper=" + standardIntakeUpper
            + ", standardIntakeLower=" + standardIntakeLower + ", standardPercentUpper=" + standardPercentUpper
            + ", standardPercentLower=" + standardPercentLower + "]";
    }

    public int getUserIntake() {
        return userIntake;
    }

    public void setUserIntake(int userIntake) {
        this.userIntake = userIntake;
    }

    public int getStandardIntakeUpper() {
        return standardIntakeUpper;
    }

    public void setStandardIntakeUpper(int standardIntakeUpper) {
        this.standardIntakeUpper = standardIntakeUpper;
    }

    public int getStandardIntakeLower() {
        return standardIntakeLower;
    }

    public void setStandardIntakeLower(int standardIntakeLower) {
        this.standardIntakeLower = standardIntakeLower;
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
}
