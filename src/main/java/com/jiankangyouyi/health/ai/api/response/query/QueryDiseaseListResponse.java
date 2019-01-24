package com.jiankangyouyi.health.ai.api.response.query;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 
 * TODO:疾病症状查询
 *
 * @see /v2/query/disease/list.do
 * @author yangsongbo
 * @date 2019年1月16日
 */
public class QueryDiseaseListResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 疾病症状列表
     */
    private List<DiseaseInfoBean> dataList;

    public List<DiseaseInfoBean> getDataList() {
        return dataList;
    }

    public void setDataList(List<DiseaseInfoBean> dataList) {
        this.dataList = dataList;
    }

    /**
     * 
     * TODO:疾病症状信息
     *
     * @author yangsongbo
     * @date 2019年1月16日
     */
    public static class DiseaseInfoBean {
        /**
         * 主键
         */
        private String id;

        /**
         * 高亮内容
         */
        private List<String> highlightText;

        /**
         * 疾病名称
         */
        private String diseaseName;

        /**
         * 疾病别名
         */
        private List<String> diseaseAlias;

        /**
         * 疾病类别
         */
        private List<String> diseaseCategories;

        /**
         * 疾病概述
         */
        private String diseaseSummary;

        /**
         * 病因
         */
        private String diseaseCase;

        /**
         * 临床表现
         */
        private String clinicalFeature;

        /**
         * 诊断
         */
        private String diagnosis;

        /**
         * 治疗
         */
        private String treatment;

        /**
         * 相关药品
         */
        private List<String> drug;

        /**
         * 相关检查
         */
        private List<String> inspect;

        /**
         * 相关操作
         */
        private List<String> relevantOperation;

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

        public String getDiseaseName() {
            return diseaseName;
        }

        public void setDiseaseName(String diseaseName) {
            this.diseaseName = diseaseName;
        }

        public List<String> getDiseaseAlias() {
            return diseaseAlias;
        }

        public void setDiseaseAlias(List<String> diseaseAlias) {
            this.diseaseAlias = diseaseAlias;
        }

        public List<String> getDiseaseCategories() {
            return diseaseCategories;
        }

        public void setDiseaseCategories(List<String> diseaseCategories) {
            this.diseaseCategories = diseaseCategories;
        }

        public String getDiseaseSummary() {
            return diseaseSummary;
        }

        public void setDiseaseSummary(String diseaseSummary) {
            this.diseaseSummary = diseaseSummary;
        }

        public String getDiseaseCase() {
            return diseaseCase;
        }

        public void setDiseaseCase(String diseaseCase) {
            this.diseaseCase = diseaseCase;
        }

        public String getClinicalFeature() {
            return clinicalFeature;
        }

        public void setClinicalFeature(String clinicalFeature) {
            this.clinicalFeature = clinicalFeature;
        }

        public String getDiagnosis() {
            return diagnosis;
        }

        public void setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
        }

        public String getTreatment() {
            return treatment;
        }

        public void setTreatment(String treatment) {
            this.treatment = treatment;
        }

        public List<String> getDrug() {
            return drug;
        }

        public void setDrug(List<String> drug) {
            this.drug = drug;
        }

        public List<String> getInspect() {
            return inspect;
        }

        public void setInspect(List<String> inspect) {
            this.inspect = inspect;
        }

        public List<String> getRelevantOperation() {
            return relevantOperation;
        }

        public void setRelevantOperation(List<String> relevantOperation) {
            this.relevantOperation = relevantOperation;
        }

        @Override
        public String toString() {
            return "DiseaseInfoBean [id=" + id + ", highlightText=" + highlightText + ", diseaseName=" + diseaseName
                + ", diseaseAlias=" + diseaseAlias + ", diseaseCategories=" + diseaseCategories + ", diseaseSummary="
                + diseaseSummary + ", diseaseCase=" + diseaseCase + ", clinicalFeature=" + clinicalFeature
                + ", diagnosis=" + diagnosis + ", treatment=" + treatment + ", drug=" + drug + ", inspect=" + inspect
                + ", relevantOperation=" + relevantOperation + "]";
        }

    }

    @Override
    public String toString() {
        return "QueryDiseaseListResData [dataList=" + dataList + "]";
    }

}
