package com.jiankangyouyi.health.ai.api;

import com.jiankangyouyi.health.ai.api.enums.Version;
import com.jiankangyouyi.health.ai.api.exception.AuthException;
import com.jiankangyouyi.health.ai.api.request.ServiceRequest;
import com.jiankangyouyi.health.ai.api.util.HttpClientUtil;
import com.jiankangyouyi.health.ai.api.util.JsonUtil;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * 使用token访问API
 *
 * @author yangsongbo
 */
public class TokenHealthAiClient extends AbstractHealthAiClient implements HealthAiClient {

    /**
     * API Key
     */
    private String apiKey;

    /**
     * token有效期
     */
    private Calendar expire;

    private String token;


    public TokenHealthAiClient(String appId, String apiKey, Version version) {
        super.appId = appId;
        this.apiKey = apiKey;
        super.version = version.getValue();
    }


    @Override
    protected String execute(ServiceRequest request, String url) {

        if (needAuth()) {
            createToken();
        }

        String reqMessage = JsonUtil.toJson(request);
        //set last request json
        super.setLastRequestJson(reqMessage);

        Map<String, String> header = new HashMap<>(1);
        header.put("token", this.token);

        return HttpClientUtil.post(url,
                reqMessage, HttpClientUtil.CONTENT_TYPE_JSON, header);
    }


    private synchronized void createToken() {

        if (!needAuth()) {
            return;
        }

        AuthHelper.AuthResponse res = AuthHelper.auth(this.appId, this.apiKey);

        if (res == null) {
            throw new AuthException("获取token为空");
        }

        if (res.getResultCode() == null || "0".equals(res.getResultCode())) {
            throw new AuthException("获取token返回错误，" +
                    "resultCode[" + res.getResultCode() + "],message[" + res.getMessage() + "]");
        }

        if (res.getData() == null || res.getData().getToken() == null
                || "".equals(res.getData().getToken().trim())) {
            throw new AuthException("AuthResponse 中的data为空，或token为空：" + res.getData());
        }

        this.token = res.getData().getToken();

        Long expireTime = res.getData().getExpireTime();

        Calendar c = Calendar.getInstance();
        c.add(Calendar.SECOND, expireTime == null ? 86400 : expireTime.intValue());

        this.expire = c;
    }


    private boolean needAuth() {

        boolean tokenBlank = (this.token == null || "".equals(token.trim()));
        Calendar c = Calendar.getInstance();
        c.add(Calendar.HOUR_OF_DAY, 1);

        return tokenBlank || c.after(this.expire);
    }

}
