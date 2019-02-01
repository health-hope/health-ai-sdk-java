package com.jiankangyouyi.health.ai.api.bean.vision;

import java.util.List;

/**
 * TODO:面部关键点识别结果
 *
 * @author yangsongbo
 * @date 2019年2月1日
 */
public class FaceKeyPointRecognitionResultBean {

    /**
     * 图片宽度
     */
    private int imageWidth;

    /**
     * 图片高度
     */
    private int imageHeight;

    /**
     * 左眼关键点数据
     */
    private List<CoordinateXYBean> leftEye;

    /**
     * 右眼关键点数据
     */
    private List<CoordinateXYBean> rightEye;

    /**
     * 左眉关键点数据
     */
    private List<CoordinateXYBean> leftBrow;

    /**
     * 右眉关键点数据
     */
    private List<CoordinateXYBean> rightBrow;

    /**
     * 嘴部关键点数据
     */
    private List<CoordinateXYBean> mouth;

    /**
     * 鼻部关键点数据
     */
    private List<CoordinateXYBean> nose;

    /**
     * 脸部关键点数据
     */
    private List<CoordinateXYBean> face;

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

    public List<CoordinateXYBean> getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(List<CoordinateXYBean> leftEye) {
        this.leftEye = leftEye;
    }

    public List<CoordinateXYBean> getRightEye() {
        return rightEye;
    }

    public void setRightEye(List<CoordinateXYBean> rightEye) {
        this.rightEye = rightEye;
    }

    public List<CoordinateXYBean> getLeftBrow() {
        return leftBrow;
    }

    public void setLeftBrow(List<CoordinateXYBean> leftBrow) {
        this.leftBrow = leftBrow;
    }

    public List<CoordinateXYBean> getRightBrow() {
        return rightBrow;
    }

    public void setRightBrow(List<CoordinateXYBean> rightBrow) {
        this.rightBrow = rightBrow;
    }

    public List<CoordinateXYBean> getMouth() {
        return mouth;
    }

    public void setMouth(List<CoordinateXYBean> mouth) {
        this.mouth = mouth;
    }

    public List<CoordinateXYBean> getNose() {
        return nose;
    }

    public void setNose(List<CoordinateXYBean> nose) {
        this.nose = nose;
    }

    public List<CoordinateXYBean> getFace() {
        return face;
    }

    public void setFace(List<CoordinateXYBean> face) {
        this.face = face;
    }

}
