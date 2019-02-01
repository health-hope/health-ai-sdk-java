package com.jiankangyouyi.health.ai.api.bean.vision;

import java.util.List;

/**
 * TODO:眼型识别结果
 *
 * @author yangsongbo
 * @date 2019年2月1日
 */
public class EyeShapeRecognitionResultBean extends RecognitionResultBean {

    /**
     * 左眼关键点数据
     */
    private List<CoordinateXYBean> leftEye;

    /**
     * 右眼关键点数据
     */
    private List<CoordinateXYBean> rightEye;

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

}
