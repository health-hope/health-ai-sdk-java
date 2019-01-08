package com.jiankangyouyi.health.ai.api.response.record;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 
 * TODO:生活方式记录
 *
 * @author yangsongbo
 * @date 2019年1月8日
 */
public class RecordLifestyleResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 记录类型 1 生活记录
     */
    private String type;

    /**
     * 成功标识 1 正确识别 0 未识别
     */
    private String success;

    /**
     * 记录项列表
     * </p>
     * 具体记录项，未识别就是空
     */
    private List<RecordLifestyleItemBean> recordItems;

    /**
     * 
     * TODO:记录项
     *
     * @author yangsongbo
     * @date 2019年1月8日
     */
    public static class RecordLifestyleItemBean {

        /**
         * 特征词
         */
        private String recordFeature;

        /**
         * 槽位值
         */
        private String slotValue;

        /**
         * 实体名称：食物名称或运动名称，未知意图会返回解析出来的名词。
         */
        private String itemName;

        /**
         * 槽位值的单位
         */
        private String slotUnit;

        /**
         * 记录时间，格式"yyyy-MM-dd HH:mm:dd"
         */
        private String recordTime;

        /**
         * 记录项
         */
        private String recordItem;

        public String getRecordFeature() {
            return recordFeature;
        }

        public void setRecordFeature(String recordFeature) {
            this.recordFeature = recordFeature;
        }

        public String getSlotValue() {
            return slotValue;
        }

        public void setSlotValue(String slotValue) {
            this.slotValue = slotValue;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public String getSlotUnit() {
            return slotUnit;
        }

        public void setSlotUnit(String slotUnit) {
            this.slotUnit = slotUnit;
        }

        public String getRecordTime() {
            return recordTime;
        }

        public void setRecordTime(String recordTime) {
            this.recordTime = recordTime;
        }

        public String getRecordItem() {
            return recordItem;
        }

        public void setRecordItem(String recordItem) {
            this.recordItem = recordItem;
        }

        @Override
        public String toString() {
            return "RecordLifestyleItemBean [recordFeature=" + recordFeature + ", slotValue=" + slotValue
                + ", itemName=" + itemName + ", slotUnit=" + slotUnit + ", recordTime=" + recordTime + ", recordItem="
                + recordItem + "]";
        }

    }
}
