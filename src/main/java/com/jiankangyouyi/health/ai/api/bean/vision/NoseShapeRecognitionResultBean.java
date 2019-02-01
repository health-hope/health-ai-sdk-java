package com.jiankangyouyi.health.ai.api.bean.vision;

import java.util.List;

/**
 * TODO:鼻型识别结果
 *
 * @author yangsongbo
 * @date 2019年2月1日
 */
public class NoseShapeRecognitionResultBean extends RecognitionResultBean {

    /**
     * 鼻部关键点数据
     */
    private List<CoordinateXYBean> nose;

    public List<CoordinateXYBean> getNose() {
        return nose;
    }

    public void setNose(List<CoordinateXYBean> nose) {
        this.nose = nose;
    }

}
