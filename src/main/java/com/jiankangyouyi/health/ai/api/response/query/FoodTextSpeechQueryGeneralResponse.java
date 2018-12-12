package com.jiankangyouyi.health.ai.api.response.query;

import java.math.BigDecimal;
import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;
import com.jiankangyouyi.health.ai.api.bean.food.FoodExtensionUnitBean;
import com.jiankangyouyi.health.ai.api.bean.food.FoodMetrologyTypeBean;
import com.jiankangyouyi.health.ai.api.response.query.bean.FoodCompositionInfo;

/**
 * 食物文本、语音查询通用的ResData
 *
 * @since v2.0
 * @author yangsongbo
 */
public class FoodTextSpeechQueryGeneralResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 食物列表
     */
    private List<FoodQueryDetailBean> foodList;

    /**
     * 度量衡列表
     */
    private List<FoodMetrologyTypeBean> metrologyList;

    public List<FoodQueryDetailBean> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<FoodQueryDetailBean> foodList) {
        this.foodList = foodList;
    }

    public List<FoodMetrologyTypeBean> getMetrologyList() {
        return metrologyList;
    }

    public void setMetrologyList(List<FoodMetrologyTypeBean> metrologyList) {
        this.metrologyList = metrologyList;
    }

    /**
     * 
     * TODO:食物查询结果
     *
     * @author yangsongbo
     * @date 2018年12月10日
     */
    public static class FoodQueryDetailBean {

        /**
         * 食物基本信息
         */
        private FoodBasicInfoBean basicInfo;

        /**
         * 食物成分列表
         */
        private List<FoodCompositionInfo> compositionInfo;

        public FoodBasicInfoBean getBasicInfo() {
            return basicInfo;
        }

        public void setBasicInfo(FoodBasicInfoBean basicInfo) {
            this.basicInfo = basicInfo;
        }

        public List<FoodCompositionInfo> getCompositionInfo() {
            return compositionInfo;
        }

        public void setCompositionInfo(List<FoodCompositionInfo> compositionInfo) {
            this.compositionInfo = compositionInfo;
        }

        @Override
        public String toString() {
            return "FoodQueryDetailBean [basicInfo=" + basicInfo + ", compositionInfo=" + compositionInfo + "]";
        }

    }

    /**
     * 
     * TODO:食物基本信息
     *
     * @author yangsongbo
     * @date 2018年12月10日
     */
    public static class FoodBasicInfoBean {

        /**
         * 食物ID
         */
        private String foodId;

        /**
         * 食物数量
         */
        private BigDecimal count;

        /**
         * 食物名称
         */
        private String foodName;

        /**
         * 关联名称
         */
        private List<String> relationNames;

        /**
         * 高亮内容
         */
        private List<String> highlightText;

        /**
         * 食物图片
         */
        private String imageUrl;

        /**
         * 食物单位
         */
        private String unit;

        /**
         * 扩展单位
         */
        private List<FoodExtensionUnitBean> extensionUnits;

        /**
         * 食物描述
         */
        private String describe;

        public String getFoodId() {
            return foodId;
        }

        public void setFoodId(String foodId) {
            this.foodId = foodId;
        }

        public BigDecimal getCount() {
            return count;
        }

        public void setCount(BigDecimal count) {
            this.count = count;
        }

        public String getFoodName() {
            return foodName;
        }

        public void setFoodName(String foodName) {
            this.foodName = foodName;
        }

        public List<String> getRelationNames() {
            return relationNames;
        }

        public void setRelationNames(List<String> relationNames) {
            this.relationNames = relationNames;
        }

        public List<String> getHighlightText() {
            return highlightText;
        }

        public void setHighlightText(List<String> highlightText) {
            this.highlightText = highlightText;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public List<FoodExtensionUnitBean> getExtensionUnits() {
            return extensionUnits;
        }

        public void setExtensionUnits(List<FoodExtensionUnitBean> extensionUnits) {
            this.extensionUnits = extensionUnits;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;
        }

        @Override
        public String toString() {
            return "FoodBasicInfoBean [foodId=" + foodId + ", count=" + count + ", foodName=" + foodName
                + ", relationNames=" + relationNames + ", highlightText=" + highlightText + ", imageUrl=" + imageUrl
                + ", unit=" + unit + ", extensionUnits=" + extensionUnits + ", describe=" + describe + "]";
        }

    }

}
