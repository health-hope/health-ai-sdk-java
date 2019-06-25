package com.jiankangyouyi.health.ai.api.response;

import java.util.HashMap;
import java.util.Map;

/**
 * Api Response
 *
 * @author yangsongbo
 */
public class ServiceResponse {

    private String resData;

    private String sign;

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

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Map<String, String> signFiledMap() {
        Map<String, String> map_ = new HashMap<String, String>();
        map_.put("resData", getResData());
        map_.put("timestamp", getTimestamp());
        map_.put("sign", getSign());
        return map_;
    }
}
