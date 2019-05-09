package com.jiankangyouyi.health.ai.api.request.vision;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.vision.NoseShapeRecognitionResponse;

/**
 * 鼻型识别
 *
 * @author yangsongbo
 * @see /v2/face/face_shape/nose
 */
public class NoseShapeRecognitionRequest extends HealthAiRequest<NoseShapeRecognitionResponse> {

    private static final long serialVersionUID = 1L;

    /**
     * 请求链接
     */
    private static final String API_URL = "/v2/face/face_shape/nose";


    /**
     * 图片文件，元素为图片URL或者base64数据
     */
    private String imageFile;

    /**
     * 图片类型,1 默认，Base64 2 URL
     */
    private String imageType;

    @Override
    public String getApiUrl() {
        return API_URL;
    }

    @Override
    public void check() {

    }

    public String getImageFile() {
        return imageFile;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    @Override
    public String toString() {
        return "NoseShapeRecognitionRequest{" +
                "imageFile='" + imageFile + '\'' +
                ", imageType='" + imageType + '\'' +
                '}';
    }
}
