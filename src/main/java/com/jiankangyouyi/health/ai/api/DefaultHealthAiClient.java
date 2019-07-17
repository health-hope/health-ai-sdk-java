package com.jiankangyouyi.health.ai.api;

import com.jiankangyouyi.health.ai.api.enums.Version;
import com.jiankangyouyi.health.ai.api.request.ServiceRequest;
import com.jiankangyouyi.health.ai.api.util.HttpClientUtil;
import com.jiankangyouyi.health.ai.api.util.JsonUtil;

/**
 * 使用RSA对称加密访问API
 *
 * @author yangsongbo
 */
public class DefaultHealthAiClient extends AbstractHealthAiClient implements HealthAiClient {

    private String privateKey;


    public DefaultHealthAiClient(String appId, String privateKey, Version version) {
        super.appId = appId;
        this.privateKey = privateKey;
        super.version = version.getValue();
    }


    @Override
    protected String execute(ServiceRequest request, String url) {

        String sign = SignHelper.sign(new SignHelper.SignFieldBean(
                appId, request.getNonceStr(), request.getTimestamp(), version), privateKey);
        request.setSign(sign);

        String reqMessage = JsonUtil.toJson(request);
        return HttpClientUtil.post(url, reqMessage, HttpClientUtil.CONTENT_TYPE_JSON);
    }

}
