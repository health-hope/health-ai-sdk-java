package com.jiankangyouyi.health.ai.api.bean.analysis;

/**
 * TODO:饮食数据
 *
 * @author yangsongbo
 * @date 2018年12月25日
 */
public class MealDataBean {

    /**
     * 食物ID
     */
    private String foodId;

    /**
     * 饮食数量
     */
    private String count;

    public MealDataBean() {
        super();
    }

    public MealDataBean(String foodId, String count) {
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
        return "MealDataBean [foodId=" + foodId + ", count=" + count + "]";
    }
}
