package com.jiankangyouyi.health.ai.api.response.query;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 
 * TODO:药粥查询
 *
 * @see /v2/query/medicated_gruel/list.do
 * @author yangsongbo
 * @date 2019年1月8日
 */
public class QueryMedicatedGruelListResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 药粥列表
     */
    private List<MedicatedGrueInfoBean> dataList;

    public List<MedicatedGrueInfoBean> getDataList() {
        return dataList;
    }

    public void setDataList(List<MedicatedGrueInfoBean> dataList) {
        this.dataList = dataList;
    }

    /**
     * 
     * TODO:药粥信息
     *
     * @author yangsongbo
     * @date 2019年1月8日
     */
    public static class MedicatedGrueInfoBean {
        /**
         * 主键
         */
        private String id;

        /**
         * 高亮内容
         */
        private List<String> highlightText;

        /**
         * 药粥名称
         */
        private String name;

        /**
         * 主治
         */
        private String attending;

        /**
         * 来源
         */
        private String source;

        /**
         * 配料
         */
        private String ingredients;

        /**
         * 制作方法
         */
        private String productionMethods;

        /**
         * 功效
         */
        private String efficacy;

        /**
         * 适应证
         */
        private String indications;

        /**
         * 食法
         */
        private String eatMethod;

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

        public String getAttending() {
            return attending;
        }

        public void setAttending(String attending) {
            this.attending = attending;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getIngredients() {
            return ingredients;
        }

        public void setIngredients(String ingredients) {
            this.ingredients = ingredients;
        }

        public String getProductionMethods() {
            return productionMethods;
        }

        public void setProductionMethods(String productionMethods) {
            this.productionMethods = productionMethods;
        }

        public String getEfficacy() {
            return efficacy;
        }

        public void setEfficacy(String efficacy) {
            this.efficacy = efficacy;
        }

        public String getIndications() {
            return indications;
        }

        public void setIndications(String indications) {
            this.indications = indications;
        }

        public String getEatMethod() {
            return eatMethod;
        }

        public void setEatMethod(String eatMethod) {
            this.eatMethod = eatMethod;
        }

        @Override
        public String toString() {
            return "MedicatedGrueInfoBean [id=" + id + ", highlightText=" + highlightText + ", name=" + name
                + ", attending=" + attending + ", source=" + source + ", ingredients=" + ingredients
                + ", productionMethods=" + productionMethods + ", efficacy=" + efficacy + ", indications=" + indications
                + ", eatMethod=" + eatMethod + "]";
        }

    }

    @Override
    public String toString() {
        return "QueryMedicatedGruelListResData [dataList=" + dataList + "]";
    }

}
