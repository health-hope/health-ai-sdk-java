package com.jiankangyouyi.health.ai.api.bean.vision;

import java.util.List;

/**
 * TODO:眉型识别结果
 *
 * @author yangsongbo
 * @date 2019年2月1日
 */
public class BrowShapeRecognitionResultBean extends RecognitionResultBean {

    /**
     * 左眉关键点数据
     */
    private List<CoordinateXYBean> leftBrow;

    /**
     * 右眉关键点数据
     */
    private List<CoordinateXYBean> rightBrow;

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

}
