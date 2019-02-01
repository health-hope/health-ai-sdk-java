package com.jiankangyouyi.health.ai.api.bean.vision;

import java.util.List;

/**
 * TODO:嘴型识别结果
 *
 * @author yangsongbo
 * @date 2019年2月1日
 */
public class MouthShapeRecognitionResultBean extends RecognitionResultBean {

    /**
     * 嘴部关键点数据
     */
    private List<CoordinateXYBean> mouth;

    public List<CoordinateXYBean> getMouth() {
        return mouth;
    }

    public void setMouth(List<CoordinateXYBean> mouth) {
        this.mouth = mouth;
    }

}
