package com.jiankangyouyi.health.ai.api.bean.evaluation;

/**
 * 评测用户信息
 *
 * @author dongle
 * @since v1.0
 */
public class EvaluationUserBriefInfoReqBean {

    /**
     * 性别 1 男 2 女
     */
    private String gender;

    /**
     * 年龄
     */
    private String age;

    /**
     * 身高（cm），存储Decimal
     */
    private String height;

    /**
     * 体重（kg），存储Decimal
     */
    private String weight;

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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }


}
