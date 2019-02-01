package com.jiankangyouyi.health.ai.api.response.vision;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 面相识别
 * 
 * @see /v2/face/face_shape/physiognomy
 * @author yangsongbo
 *
 */
public class PhysiognomyRecognitionResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 面相识别结果
     */
    private PhysiognomyRecognitionResultBean recognitionResult;

    public PhysiognomyRecognitionResultBean getRecognitionResult() {
        return recognitionResult;
    }

    public void setRecognitionResult(PhysiognomyRecognitionResultBean recognitionResult) {
        this.recognitionResult = recognitionResult;
    }

    /**
     * 
     * TODO:面相识别结果
     *
     * @author yangsongbo
     * @date 2019年2月1日
     */
    public static class PhysiognomyRecognitionResultBean {

        /**
         * 图片宽度
         */
        private int imageWidth;

        /**
         * 图片高度
         */
        private int imageHeight;

        /**
         * 面部区域右边界
         */
        private int right;

        /**
         * 面部区域右边界
         */
        private int left;

        /**
         * 面部区域上边界
         */
        private int top;

        /**
         * 面部区域下边界
         */
        private int bottom;

        /**
         * 脸部面相描述
         */
        private PhysiognomyDescribeBean face;

        /**
         * 眼部面相描述
         */
        private PhysiognomyDescribeBean eye;

        /**
         * 鼻部面相描述
         */
        private PhysiognomyDescribeBean nose;

        /**
         * 嘴部面相描述
         */
        private PhysiognomyDescribeBean mouth;

        /**
         * 眉部面相描述
         */
        private PhysiognomyDescribeBean brow;

        public int getImageWidth() {
            return imageWidth;
        }

        public void setImageWidth(int imageWidth) {
            this.imageWidth = imageWidth;
        }

        public int getImageHeight() {
            return imageHeight;
        }

        public void setImageHeight(int imageHeight) {
            this.imageHeight = imageHeight;
        }

        public int getRight() {
            return right;
        }

        public void setRight(int right) {
            this.right = right;
        }

        public int getLeft() {
            return left;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public int getTop() {
            return top;
        }

        public void setTop(int top) {
            this.top = top;
        }

        public int getBottom() {
            return bottom;
        }

        public void setBottom(int bottom) {
            this.bottom = bottom;
        }

        public PhysiognomyDescribeBean getFace() {
            return face;
        }

        public void setFace(PhysiognomyDescribeBean face) {
            this.face = face;
        }

        public PhysiognomyDescribeBean getEye() {
            return eye;
        }

        public void setEye(PhysiognomyDescribeBean eye) {
            this.eye = eye;
        }

        public PhysiognomyDescribeBean getNose() {
            return nose;
        }

        public void setNose(PhysiognomyDescribeBean nose) {
            this.nose = nose;
        }

        public PhysiognomyDescribeBean getMouth() {
            return mouth;
        }

        public void setMouth(PhysiognomyDescribeBean mouth) {
            this.mouth = mouth;
        }

        public PhysiognomyDescribeBean getBrow() {
            return brow;
        }

        public void setBrow(PhysiognomyDescribeBean brow) {
            this.brow = brow;
        }

    }

    /**
     * 
     * TODO:面相关键点描述
     *
     * @author yangsongbo
     * @date 2019年2月1日
     */
    public static class PhysiognomyDescribeBean {

        /**
         * 关键部位形状
         */
        private String shape;

        /**
         * 面相解释
         */
        private List<String> paraphrase;

        public String getShape() {
            return shape;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        public List<String> getParaphrase() {
            return paraphrase;
        }

        public void setParaphrase(List<String> paraphrase) {
            this.paraphrase = paraphrase;
        }

    }

}
