package com.jiankangyouyi.health.ai.api.response.query;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 
 * TODO:食品添加剂查询
 *
 * @see /v2/query/food_additive/list.do
 * @author yangsongbo
 * @date 2019年1月10日
 */
public class QueryFoodAdditiveListResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 食品添加剂列表
     */
    private List<FoodAdditiveInfoBean> dataList;

    public List<FoodAdditiveInfoBean> getDataList() {
        return dataList;
    }

    public void setDataList(List<FoodAdditiveInfoBean> dataList) {
        this.dataList = dataList;
    }

    /**
     * 
     * TODO:食品添加剂信息
     *
     * @author yangsongbo
     * @date 2019年1月8日
     */
    public static class FoodAdditiveInfoBean {
        /**
         * 主键
         */
        private String id;

        /**
         * 高亮内容
         */
        private List<String> highlightText;

        /**
         * 食品添加剂名称
         */
        private String name;

        /**
         * 食品添加剂英文名
         */
        private String nameEn;

        /**
         * 功能
         */
        private String functions;

        /**
         * 最大使用量
         */
        private String maxUse;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<String> getHighlightText() {
            return highlightText;
        }

        public void setHighlightText(List<String> highlightText) {
            this.highlightText = highlightText;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNameEn() {
            return nameEn;
        }

        public void setNameEn(String nameEn) {
            this.nameEn = nameEn;
        }

        public String getFunctions() {
            return functions;
        }

        public void setFunctions(String functions) {
            this.functions = functions;
        }

        public String getMaxUse() {
            return maxUse;
        }

        public void setMaxUse(String maxUse) {
            this.maxUse = maxUse;
        }

        @Override
        public String toString() {
            return "FoodAdditiveInfoBean [id=" + id + ", highlightText=" + highlightText + ", name=" + name
                + ", nameEn=" + nameEn + ", functions=" + functions + ", maxUse=" + maxUse + "]";
        }

    }

    @Override
    public String toString() {
        return "QueryFoodAdditiveListResData [dataList=" + dataList + "]";
    }

}
