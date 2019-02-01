package com.jiankangyouyi.health.ai.api.response.vision;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;
import com.jiankangyouyi.health.ai.api.bean.vision.FaceKeyPointRecognitionResultBean;

/**
 * 面部关键点识别
 * 
 * @see /v2/face/face_shape/key_point
 * @author yangsongbo
 *
 */
public class FaceKeyPointRecognitionResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 识别结果
     */
    private FaceKeyPointRecognitionResultBean recognitionResult;

    public FaceKeyPointRecognitionResultBean getRecognitionResult() {
        return recognitionResult;
    }

    public void setRecognitionResult(FaceKeyPointRecognitionResultBean recognitionResult) {
        this.recognitionResult = recognitionResult;
    }

}
