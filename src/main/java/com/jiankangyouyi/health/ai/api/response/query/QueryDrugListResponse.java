package com.jiankangyouyi.health.ai.api.response.query;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 
 * TODO:药品查询
 *
 * @see /v2/query/drug/list.do
 * @author yangsongbo
 * @date 2019年1月10日
 */
public class QueryDrugListResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 药品列表
     */
    private List<DrugInfoBean> dataList;

    public List<DrugInfoBean> getDataList() {
        return dataList;
    }

    public void setDataList(List<DrugInfoBean> dataList) {
        this.dataList = dataList;
    }

    /**
     * 
     * TODO:药品信息
     *
     * @author yangsongbo
     * @date 2019年1月10日
     */
    public static class DrugInfoBean {
        /**
         * 主键
         */
        private String id;

        /**
         * 高亮内容
         */
        private List<String> highlightText;

        /**
         * 药品通用名称
         */
        private String commonName;

        /**
         * 药品商品名称
         */
        private String tradeName;

        /**
         * 生产厂商
         */
        private String manufacturer;

        /**
         * 主要成分
         */
        private String mainIngredient;

        /**
         * 适应症
         */
        private String indication;

        /**
         * 用法用量
         */
        private String dosage;

        /**
         * 不良反应
         */
        private String sideEffect;

        /**
         * 禁忌
         */
        private String taboo;

        /**
         * 注意事项
         */
        private String warning;

        /**
         * 药物相互作用
         */
        private String interaction;

        /**
         * 储藏
         */
        private String storage;

        /**
         * 有效期
         */
        private String period;

        /**
         * 剂型
         */
        private String dosageForm;

        /**
         * 规格
         */
        private String packages;

        /**
         * 批准日期
         */
        private String approvalDate;

        /**
         * 批准文号
         */
        private String approvalCode;

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

        public String getCommonName() {
            return commonName;
        }

        public void setCommonName(String commonName) {
            this.commonName = commonName;
        }

        public String getTradeName() {
            return tradeName;
        }

        public void setTradeName(String tradeName) {
            this.tradeName = tradeName;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getMainIngredient() {
            return mainIngredient;
        }

        public void setMainIngredient(String mainIngredient) {
            this.mainIngredient = mainIngredient;
        }

        public String getIndication() {
            return indication;
        }

        public void setIndication(String indication) {
            this.indication = indication;
        }

        public String getDosage() {
            return dosage;
        }

        public void setDosage(String dosage) {
            this.dosage = dosage;
        }

        public String getSideEffect() {
            return sideEffect;
        }

        public void setSideEffect(String sideEffect) {
            this.sideEffect = sideEffect;
        }

        public String getTaboo() {
            return taboo;
        }

        public void setTaboo(String taboo) {
            this.taboo = taboo;
        }

        public String getWarning() {
            return warning;
        }

        public void setWarning(String warning) {
            this.warning = warning;
        }

        public String getInteraction() {
            return interaction;
        }

        public void setInteraction(String interaction) {
            this.interaction = interaction;
        }

        public String getStorage() {
            return storage;
        }

        public void setStorage(String storage) {
            this.storage = storage;
        }

        public String getPeriod() {
            return period;
        }

        public void setPeriod(String period) {
            this.period = period;
        }

        public String getDosageForm() {
            return dosageForm;
        }

        public void setDosageForm(String dosageForm) {
            this.dosageForm = dosageForm;
        }

        public String getPackages() {
            return packages;
        }

        public void setPackages(String packages) {
            this.packages = packages;
        }

        public String getApprovalDate() {
            return approvalDate;
        }

        public void setApprovalDate(String approvalDate) {
            this.approvalDate = approvalDate;
        }

        public String getApprovalCode() {
            return approvalCode;
        }

        public void setApprovalCode(String approvalCode) {
            this.approvalCode = approvalCode;
        }

        @Override
        public String toString() {
            return "DrugInfoBean [id=" + id + ", highlightText=" + highlightText + ", commonName=" + commonName
                + ", tradeName=" + tradeName + ", manufacturer=" + manufacturer + ", mainIngredient=" + mainIngredient
                + ", indication=" + indication + ", dosage=" + dosage + ", sideEffect=" + sideEffect + ", taboo="
                + taboo + ", warning=" + warning + ", interaction=" + interaction + ", storage=" + storage + ", period="
                + period + ", dosageForm=" + dosageForm + ", packages=" + packages + ", approvalDate=" + approvalDate
                + ", approvalCode=" + approvalCode + "]";
        }

    }

    @Override
    public String toString() {
        return "QueryDrugListResData [dataList=" + dataList + "]";
    }

}
