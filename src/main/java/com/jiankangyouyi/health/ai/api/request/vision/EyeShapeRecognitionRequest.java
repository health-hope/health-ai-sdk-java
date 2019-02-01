package com.jiankangyouyi.health.ai.api.request.vision;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.vision.EyeShapeRecognitionResponse;

/**
 * 眼型识别
 * 
 * @see /v2/face/face_shape/eye
 * @author yangsongbo
 *
 */
public class EyeShapeRecognitionRequest extends HealthAiRequest<EyeShapeRecognitionResponse> {

    private static final long serialVersionUID = 1L;

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/face/face_shape/eye";

    /**
     * 图片base64数据或图片URL地址
     */
    private String imageFile;

    /**
     * 图片类型 1 base64 2 URL
     */
    private String imageType;

    @Override
    public String getApiUrl() {
        return API_URL;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    @Override
    public String toString() {
        return "EyeShapeRecognitionRequest [imageFile=" + imageFile + ", imageType=" + imageType + "]";
    }

    @Override
    public void check() {

    }

}
