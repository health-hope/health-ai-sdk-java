package com.jiankangyouyi.health.ai.api.response;

import java.math.BigDecimal;
import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 表情识别返回接口Bean
 * 
 * @author yangsongbo
 *
 */
public class ImageEmotionRecognizeResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 识别结果
     */
    private List<RecognizeEmotion> recognitionEmotionList;

    public List<RecognizeEmotion> getRecognitionEmotionList() {
        return recognitionEmotionList;
    }

    public void setRecognitionEmotionList(List<RecognizeEmotion> recognitionEmotionList) {
        this.recognitionEmotionList = recognitionEmotionList;
    }

    @Override
    public String toString() {
        return "ImageEmotionRecognizeResponse [recognitionEmotionList=" + recognitionEmotionList + "]";
    }

    /**
     * 识别出的表情
     * 
     * @author yangsongbo
     *
     */
    public static class RecognizeEmotion {

        /**
         * 表情 :
         * </p>
         * disgust ： 厌恶
         * </p>
         * fear ： 恐惧
         * </p>
         * happy ： 高兴
         * </p>
         * sad ： 难过
         * </p>
         * surprise ： 惊喜
         * </p>
         * neutral ：正常
         * </p>
         */
        private String emotionName;

        /**
         * 置信度
         */
        private BigDecimal confidence;

        /**
         * 目标框左上角坐标点x相对图片宽长度百分比
         */
        private BigDecimal xmin;

        /**
         * 目标框右下角坐标点x相对图片宽长度百分比
         */
        private BigDecimal xmax;

        /**
         * 目标框左上角坐标点y相对图片高长度百分比
         */
        private BigDecimal ymin;

        /**
         * 目标框右下角坐标点y相对图片高长度百分比
         */
        private BigDecimal ymax;

        public String getEmotionName() {
            return emotionName;
        }

        public void setEmotionName(String emotionName) {
            this.emotionName = emotionName;
        }

        public BigDecimal getConfidence() {
            return confidence;
        }

        public void setConfidence(BigDecimal confidence) {
            this.confidence = confidence;
        }

        public BigDecimal getXmin() {
            return xmin;
        }

        public void setXmin(BigDecimal xmin) {
            this.xmin = xmin;
        }

        public BigDecimal getXmax() {
            return xmax;
        }

        public void setXmax(BigDecimal xmax) {
            this.xmax = xmax;
        }

        public BigDecimal getYmin() {
            return ymin;
        }

        public void setYmin(BigDecimal ymin) {
            this.ymin = ymin;
        }

        public BigDecimal getYmax() {
            return ymax;
        }

        public void setYmax(BigDecimal ymax) {
            this.ymax = ymax;
        }

    }

}
