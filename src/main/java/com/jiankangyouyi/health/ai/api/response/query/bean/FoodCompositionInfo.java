package com.jiankangyouyi.health.ai.api.response.query.bean;

import java.math.BigDecimal;

/**
 * TODO:食物成分信息
 *
 * @author yangsongbo
 * @date 2018年12月11日
 */
public class FoodCompositionInfo {

    /**
     * 属性名称
     */
    private String name;

    /**
     * 属性值
     */
    private BigDecimal value;

    /**
     * 单位
     */
    private String unit;

    public FoodCompositionInfo() {
        super();
    }

    public FoodCompositionInfo(String name, BigDecimal value, String unit) {
        super();
        this.name = name;
        this.value = value;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "FoodCompositionInfo [name=" + name + ", value=" + value + ", unit=" + unit + "]";
    }

}
