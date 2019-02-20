package com.jiankangyouyi.health.ai.api.response.vision;

import java.util.Arrays;
import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 人体关键点识别
 * 
 * @see /v2/human_body/key_point
 * @author yangsongbo
 *
 */
public class HumanBodyKeyPointRecognitionResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 识别结果
     */
    private HumanBodyKeyPointRecognitionResultBean recognitionResult;

    public HumanBodyKeyPointRecognitionResultBean getRecognitionResult() {
        return recognitionResult;
    }

    public void setRecognitionResult(HumanBodyKeyPointRecognitionResultBean recognitionResult) {
        this.recognitionResult = recognitionResult;
    }

    @Override
    public String toString() {
        return "HumanBodyKeyPointRecognitionResponse [recognitionResult=" + recognitionResult + "]";
    }

    /**
     * 
     * TODO:识别结果
     *
     * @author yangsongbo
     * @date 2019年2月3日
     */
    public static class HumanBodyKeyPointRecognitionResultBean {

        /**
         * 是否包含人体 0 不包含 1 包含
         * 
         */
        private Integer isHumanBody;

        /**
         * 图片宽度
         */
        private int imageWidth;

        /**
         * 图片高度
         */
        private int imageHeight;

        /**
         * 结果列表
         */
        private List<HumanBodyKeyPointCoordinateBean> humanBodyList;

        /**
         * 包含关键点的图片
         */
        private String imageData;

        public Integer getIsHumanBody() {
            return isHumanBody;
        }

        public void setIsHumanBody(Integer isHumanBody) {
            this.isHumanBody = isHumanBody;
        }

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

        public List<HumanBodyKeyPointCoordinateBean> getHumanBodyList() {
            return humanBodyList;
        }

        public void setHumanBodyList(List<HumanBodyKeyPointCoordinateBean> humanBodyList) {
            this.humanBodyList = humanBodyList;
        }

        public String getImageData() {
            return imageData;
        }

        public void setImageData(String imageData) {
            this.imageData = imageData;
        }

        @Override
        public String toString() {
            return "HumanBodyKeyPointRecognitionResultBean [isHumanBody=" + isHumanBody + ", imageWidth=" + imageWidth
                + ", imageHeight=" + imageHeight + ", humanBodyList=" + humanBodyList + ", imageData=" + imageData
                + "]";
        }

    }

    /**
     * 
     * TODO:关键点坐标
     *
     * @author yangsongbo
     * @date 2019年2月3日
     */
    public static class HumanBodyKeyPointCoordinateBean {

        /**
         * 鼻子, [x,y]
         */
        private Float[] nose;

        /**
         * 脖子 [x,y]
         */
        private Float[] neck;

        /**
         * 左眼 [x,y]
         */
        private Float[] leftEye;

        /**
         * 右眼 [x,y]
         */
        private Float[] rightEye;

        /**
         * 左耳 [x,y]
         */
        private Float[] leftEar;

        /**
         * 右耳 [x,y]
         */
        private Float[] rightEar;

        /**
         * 左肩 [x,y]
         */
        private Float[] leftShoulder;

        /**
         * 右肩 [x,y]
         */
        private Float[] rightShoulder;

        /**
         * 左肘 [x,y]
         */
        private Float[] leftElbow;

        /**
         * 右肘 [x,y]
         */
        private Float[] rightElbow;

        /**
         * 左腕 [x,y]
         */
        private Float[] leftWrist;

        /**
         * 右腕 [x,y]
         */
        private Float[] rightWrist;

        /**
         * 左髋 [x,y]
         */
        private Float[] leftHip;

        /**
         * 右髋 [x,y]
         */
        private Float[] rightHhip;

        /**
         * 左膝 [x,y]
         */
        private Float[] leftKnee;

        /**
         * 右膝 [x,y]
         */
        private Float[] rightKnee;

        /**
         * 左踝 [x,y]
         */
        private Float[] leftAnkle;

        /**
         * 右踝 [x,y]
         */
        private Float[] rightAnkle;

        /**
         * 边界框 [x1,y1,x2,y2]
         */
        private Float[] boundingBox;

        public Float[] getNose() {
            return nose;
        }

        public void setNose(Float[] nose) {
            this.nose = nose;
        }

        public Float[] getNeck() {
            return neck;
        }

        public void setNeck(Float[] neck) {
            this.neck = neck;
        }

        public Float[] getLeftEye() {
            return leftEye;
        }

        public void setLeftEye(Float[] leftEye) {
            this.leftEye = leftEye;
        }

        public Float[] getRightEye() {
            return rightEye;
        }

        public void setRightEye(Float[] rightEye) {
            this.rightEye = rightEye;
        }

        public Float[] getLeftEar() {
            return leftEar;
        }

        public void setLeftEar(Float[] leftEar) {
            this.leftEar = leftEar;
        }

        public Float[] getRightEar() {
            return rightEar;
        }

        public void setRightEar(Float[] rightEar) {
            this.rightEar = rightEar;
        }

        public Float[] getLeftShoulder() {
            return leftShoulder;
        }

        public void setLeftShoulder(Float[] leftShoulder) {
            this.leftShoulder = leftShoulder;
        }

        public Float[] getRightShoulder() {
            return rightShoulder;
        }

        public void setRightShoulder(Float[] rightShoulder) {
            this.rightShoulder = rightShoulder;
        }

        public Float[] getLeftElbow() {
            return leftElbow;
        }

        public void setLeftElbow(Float[] leftElbow) {
            this.leftElbow = leftElbow;
        }

        public Float[] getRightElbow() {
            return rightElbow;
        }

        public void setRightElbow(Float[] rightElbow) {
            this.rightElbow = rightElbow;
        }

        public Float[] getLeftWrist() {
            return leftWrist;
        }

        public void setLeftWrist(Float[] leftWrist) {
            this.leftWrist = leftWrist;
        }

        public Float[] getRightWrist() {
            return rightWrist;
        }

        public void setRightWrist(Float[] rightWrist) {
            this.rightWrist = rightWrist;
        }

        public Float[] getLeftHip() {
            return leftHip;
        }

        public void setLeftHip(Float[] leftHip) {
            this.leftHip = leftHip;
        }

        public Float[] getRightHhip() {
            return rightHhip;
        }

        public void setRightHhip(Float[] rightHhip) {
            this.rightHhip = rightHhip;
        }

        public Float[] getLeftKnee() {
            return leftKnee;
        }

        public void setLeftKnee(Float[] leftKnee) {
            this.leftKnee = leftKnee;
        }

        public Float[] getRightKnee() {
            return rightKnee;
        }

        public void setRightKnee(Float[] rightKnee) {
            this.rightKnee = rightKnee;
        }

        public Float[] getLeftAnkle() {
            return leftAnkle;
        }

        public void setLeftAnkle(Float[] leftAnkle) {
            this.leftAnkle = leftAnkle;
        }

        public Float[] getRightAnkle() {
            return rightAnkle;
        }

        public void setRightAnkle(Float[] rightAnkle) {
            this.rightAnkle = rightAnkle;
        }

        public Float[] getBoundingBox() {
            return boundingBox;
        }

        public void setBoundingBox(Float[] boundingBox) {
            this.boundingBox = boundingBox;
        }

        @Override
        public String toString() {
            return "HumanBodyKeyPointCoordinateBean [nose=" + Arrays.toString(nose) + ", neck=" + Arrays.toString(neck)
                + ", leftEye=" + Arrays.toString(leftEye) + ", rightEye=" + Arrays.toString(rightEye) + ", leftEar="
                + Arrays.toString(leftEar) + ", rightEar=" + Arrays.toString(rightEar) + ", leftShoulder="
                + Arrays.toString(leftShoulder) + ", rightShoulder=" + Arrays.toString(rightShoulder) + ", leftElbow="
                + Arrays.toString(leftElbow) + ", rightElbow=" + Arrays.toString(rightElbow) + ", leftWrist="
                + Arrays.toString(leftWrist) + ", rightWrist=" + Arrays.toString(rightWrist) + ", leftHip="
                + Arrays.toString(leftHip) + ", rightHhip=" + Arrays.toString(rightHhip) + ", leftKnee="
                + Arrays.toString(leftKnee) + ", rightKnee=" + Arrays.toString(rightKnee) + ", leftAnkle="
                + Arrays.toString(leftAnkle) + ", rightAnkle=" + Arrays.toString(rightAnkle) + ", boundingBox="
                + Arrays.toString(boundingBox) + "]";
        }

    }

}
