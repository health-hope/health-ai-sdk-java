package com.jiankangyouyi.health.ai.api.response.vision;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;
import com.jiankangyouyi.health.ai.api.bean.vision.BrowShapeRecognitionResultBean;

/**
 * 眉型识别
 * 
 * @see /face/face_shape/brow
 * @author yangsongbo
 *
 */
public class BrowShapeRecognitionResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 识别结果
     */
    private BrowShapeRecognitionResultBean recognitionResult;

    public BrowShapeRecognitionResultBean getRecognitionResult() {
        return recognitionResult;
    }

    public void setRecognitionResult(BrowShapeRecognitionResultBean recognitionResult) {
        this.recognitionResult = recognitionResult;
    }

}
