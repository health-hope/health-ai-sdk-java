package com.jiankangyouyi.health.ai.api.response.query;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

import java.util.List;

/**
 * 标签文本、语音查询通用的ResData
 *
 * @since v2.0
 * @author yangsongbo
 */
public class LabelTextSpeechQueryGeneralResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;


    private List<LabelQueryDetailBean> labelFoodList;

    public List<LabelQueryDetailBean> getLabelFoodList() {
        return labelFoodList;
    }

    public void setLabelFoodList(List<LabelQueryDetailBean> labelFoodList) {
        this.labelFoodList = labelFoodList;
    }

    public static class LabelQueryDetailBean {

        /**
         * 食物基本信息
         */
        private FoodBasicInfoBean basicInfo;

        /**
         * 人群
         */
        private String crowd;

        /**
         * 标签
         */
        private String label;

        @Override
        public String toString() {
            return "LabelQueryDetailBean{" +
                    "basicInfo=" + basicInfo +
                    ", crowd='" + crowd + '\'' +
                    ", label='" + label + '\'' +
                    '}';
        }

        public FoodBasicInfoBean getBasicInfo() {
            return basicInfo;
        }

        public void setBasicInfo(FoodBasicInfoBean basicInfo) {
            this.basicInfo = basicInfo;
        }

        public String getCrowd() {
            return crowd;
        }

        public void setCrowd(String crowd) {
            this.crowd = crowd;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public LabelQueryDetailBean(FoodBasicInfoBean basicInfo, String crowd, String label) {
            this.basicInfo = basicInfo;
            this.crowd = crowd;
            this.label = label;
        }

        public LabelQueryDetailBean() {
        }
    }

    public static class FoodBasicInfoBean {

        /**
         * 食物ID
         */
        private String foodId;

        /**
         * 食物名称
         */
        private String foodName;

        /**
         * 高亮内容
         */
        private List<String> highlightText;

        @Override
        public String toString() {
            return "FoodBasicInfoBean{" +
                    "foodId='" + foodId + '\'' +
                    ", foodName='" + foodName + '\'' +
                    ", highlightText=" + highlightText +
                    '}';
        }

        public String getFoodId() {
            return foodId;
        }

        public void setFoodId(String foodId) {
            this.foodId = foodId;
        }

        public String getFoodName() {
            return foodName;
        }

        public void setFoodName(String foodName) {
            this.foodName = foodName;
        }

        public List<String> getHighlightText() {
            return highlightText;
        }

        public void setHighlightText(List<String> highlightText) {
            this.highlightText = highlightText;
        }

        public FoodBasicInfoBean() {
        }
    }
}
