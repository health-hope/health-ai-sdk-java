package com.jiankangyouyi.health.ai.api.response.vision;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;
import com.jiankangyouyi.health.ai.api.bean.vision.EyeShapeRecognitionResultBean;

/**
 * 眼型识别
 * 
 * @see /v2/face/face_shape/eye
 * @author yangsongbo
 *
 */
public class EyeShapeRecognitionResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 识别结果
     */
    private EyeShapeRecognitionResultBean recognitionResult;

    public EyeShapeRecognitionResultBean getRecognitionResult() {
        return recognitionResult;
    }

    public void setRecognitionResult(EyeShapeRecognitionResultBean recognitionResult) {
        this.recognitionResult = recognitionResult;
    }

}
