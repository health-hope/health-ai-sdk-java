package com.jiankangyouyi.health.ai.api.bean.analysis;

import java.math.BigDecimal;

/**
 * TODO:食物成分分析结果
 *
 * @author yangsongbo
 * @date 2018年12月25日
 */
public class CompositionAnalysisResult {

    /**
     * 食物成分名称
     */
    private String name;

    /**
     * 用户摄入量
     */
    private BigDecimal userIntake;

    /**
     * 标准摄入量上限
     */
    private BigDecimal standardIntakeUpper;

    /**
     * 标准摄入量下限
     */
    private BigDecimal standardIntakeLower;

    /**
     * 单位 ： 克、毫克、微克
     */
    private String unit;

    public CompositionAnalysisResult() {
        super();
    }

    public CompositionAnalysisResult(String name, BigDecimal userIntake, BigDecimal standardIntakeUpper,
        BigDecimal standardIntakeLower, String unit) {
        super();
        this.name = name;
        this.userIntake = userIntake;
        this.standardIntakeUpper = standardIntakeUpper;
        this.standardIntakeLower = standardIntakeLower;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUserIntake() {
        return userIntake;
    }

    public void setUserIntake(BigDecimal userIntake) {
        this.userIntake = userIntake;
    }

    public BigDecimal getStandardIntakeUpper() {
        return standardIntakeUpper;
    }

    public void setStandardIntakeUpper(BigDecimal standardIntakeUpper) {
        this.standardIntakeUpper = standardIntakeUpper;
    }

    public BigDecimal getStandardIntakeLower() {
        return standardIntakeLower;
    }

    public void setStandardIntakeLower(BigDecimal standardIntakeLower) {
        this.standardIntakeLower = standardIntakeLower;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "CompositionAnalysisResult [name=" + name + ", userIntake=" + userIntake + ", standardIntakeUpper="
            + standardIntakeUpper + ", standardIntakeLower=" + standardIntakeLower + ", unit=" + unit + "]";
    }
}
