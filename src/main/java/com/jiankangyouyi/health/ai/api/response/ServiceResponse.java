package com.jiankangyouyi.health.ai.api.response;

/**
 * Api Response
 *
 * @author yangsongbo
 */
public class ServiceResponse {

    private String resData;

    private String timestamp;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getResData() {
        return resData;
    }

    public void setResData(String resData) {
        this.resData = resData;
    }

}
