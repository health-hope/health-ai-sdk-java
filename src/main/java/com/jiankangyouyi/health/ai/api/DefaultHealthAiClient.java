package com.jiankangyouyi.health.ai.api;

import com.jiankangyouyi.health.ai.api.enums.Version;
import com.jiankangyouyi.health.ai.api.request.ServiceRequest;
import com.jiankangyouyi.health.ai.api.util.HttpClientUtil;
import com.jiankangyouyi.health.ai.api.util.JsonUtil;
import com.jiankangyouyi.health.ai.api.util.UUIDUtil;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * 使用RSA对称加密访问API
 *
 * @author yangsongbo
 */
public class DefaultHealthAiClient implements HealthAiClient {

    private String appId;
    private String privateKey;
    private String version;

    private DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);

    public DefaultHealthAiClient(String appId, String privateKey, Version version) {
        this.appId = appId;
        this.privateKey = privateKey;
        this.version = version.getValue();
    }


    @Override
    public String execute(String reqDataJson, String url) {

        String nonceStr = UUIDUtil.getJavaUUID();
        String timestamp = sdf.format(new Timestamp(System.currentTimeMillis()));

        ServiceRequest req = new ServiceRequest(appId, nonceStr,
                version, timestamp, reqDataJson);

        String sign = SignHelper.sign(new SignHelper.SignFieldBean(appId, nonceStr, timestamp, version), privateKey);

        req.setSign(sign);
        req.setReqData(reqDataJson);
        String reqMessage = JsonUtil.toJson(req);
        return HttpClientUtil.post(url, reqMessage, HttpClientUtil.CONTENT_TYPE_JSON);
    }


}
