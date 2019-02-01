package com.jiankangyouyi.health.ai.api.response.vision;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;
import com.jiankangyouyi.health.ai.api.bean.vision.FaceShapeRecognitionResultBean;

/**
 * 脸型识别
 * 
 * @see /v2/face/face_shape/face
 * @author yangsongbo
 *
 */
public class FaceShapeRecognitionResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 识别结果
     */
    private FaceShapeRecognitionResultBean recognitionResult;

    public FaceShapeRecognitionResultBean getRecognitionResult() {
        return recognitionResult;
    }

    public void setRecognitionResult(FaceShapeRecognitionResultBean recognitionResult) {
        this.recognitionResult = recognitionResult;
    }

}
