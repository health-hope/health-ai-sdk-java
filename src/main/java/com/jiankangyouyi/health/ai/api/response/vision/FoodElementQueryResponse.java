package com.jiankangyouyi.health.ai.api.response.vision;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

import java.util.List;

/**
 * 食物识别通用的ResData
 *
 * @since v2.0
 * @author yangsongbo
 */
public class FoodElementQueryResponse extends HealthAiResponse {

    private static final long serialVersionUID = 1L;


    private List<Recognition> recognitionResult;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<Recognition> getRecognitionResult() {
        return recognitionResult;
    }

    public void setRecognitionResult(List<Recognition> recognitionResult) {
        this.recognitionResult = recognitionResult;
    }

    public static class Recognition {

        /**
         * 食物名称
         */
        private String name;

        /**
         * 食物介绍
         */
        private String info;

        public Recognition() {

        }

        @Override
        public String toString() {
            return "recognition{" +
                    "name='" + name + '\'' +
                    ", info='" + info + '\'' +
                    '}';
        }

        public Recognition(String name, String info) {
            this.name = name;
            this.info = info;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }
}
