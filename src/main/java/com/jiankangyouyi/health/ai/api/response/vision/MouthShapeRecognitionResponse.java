package com.jiankangyouyi.health.ai.api.response.vision;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;
import com.jiankangyouyi.health.ai.api.bean.vision.MouthShapeRecognitionResultBean;

/**
 * 嘴型识别
 * 
 * @see /v2/face/face_shape/mouth
 * @author yangsongbo
 *
 */
public class MouthShapeRecognitionResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 识别结果
     */
    private MouthShapeRecognitionResultBean recognitionResult;

    public MouthShapeRecognitionResultBean getRecognitionResult() {
        return recognitionResult;
    }

    public void setRecognitionResult(MouthShapeRecognitionResultBean recognitionResult) {
        this.recognitionResult = recognitionResult;
    }

}
