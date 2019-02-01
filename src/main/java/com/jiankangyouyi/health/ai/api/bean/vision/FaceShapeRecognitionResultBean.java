package com.jiankangyouyi.health.ai.api.bean.vision;

import java.util.List;

/**
 * TODO:脸型识别结果
 *
 * @author yangsongbo
 * @date 2019年2月1日
 */
public class FaceShapeRecognitionResultBean extends RecognitionResultBean {

    /**
     * 脸部关键点数据
     */
    private List<CoordinateXYBean> face;

    public List<CoordinateXYBean> getFace() {
        return face;
    }

    public void setFace(List<CoordinateXYBean> face) {
        this.face = face;
    }

}
