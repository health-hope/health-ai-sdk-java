package com.jiankangyouyi.health.ai.api.response.vision;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;
import com.jiankangyouyi.health.ai.api.bean.vision.NoseShapeRecognitionResultBean;

/**
 * 鼻型识别
 * 
 * @see /v2/face/face_shape/nose
 * @author yangsongbo
 *
 */
public class NoseShapeRecognitionResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 识别结果
     */
    private NoseShapeRecognitionResultBean recognitionResult;

    public NoseShapeRecognitionResultBean getRecognitionResult() {
        return recognitionResult;
    }

    public void setRecognitionResult(NoseShapeRecognitionResultBean recognitionResult) {
        this.recognitionResult = recognitionResult;
    }

}
