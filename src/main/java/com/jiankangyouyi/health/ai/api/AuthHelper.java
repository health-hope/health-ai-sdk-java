package com.jiankangyouyi.health.ai.api;

import com.jiankangyouyi.health.ai.api.util.HttpClientUtil;
import com.jiankangyouyi.health.ai.api.util.JsonUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 鉴权帮助类
 *
 * @author yangsongbo
 */
public class AuthHelper {


    /**
     * 获取Token
     *
     * @param appId  应用ID
     * @param apiKey API密钥
     */
    public static AuthResponse auth(String appId, String apiKey) {

        String url = "https://api.jiankangyouyi.com/auth/token";

        Map<String, Object> params = new HashMap<>();
        params.put("appId", appId);
        params.put("apiKey", apiKey);

        String res = HttpClientUtil.post(url, JsonUtil.toJson(params), HttpClientUtil.CONTENT_TYPE_JSON);

        if (res == null || "".equals(res.trim())) {
            return null;
        }
        return JsonUtil.fromJson(res, AuthResponse.class);
    }


    public static class AuthResponse {

        /**
         * 返回0表示成功，大于0表示失败
         */
        private Integer resultCode;

        /**
         * 接口处理时间，单位毫秒
         */
        private Long spendTime;

        /**
         * 当前服务器时间戳
         */
        private Long serverTime;

        /**
         * 错误信息，resultCode不为0时返回
         */
        private String message;

        /**
         * 业务数据
         */
        private TokenData data;

        public Integer getResultCode() {
            return resultCode;
        }

        public void setResultCode(Integer resultCode) {
            this.resultCode = resultCode;
        }

        public Long getSpendTime() {
            return spendTime;
        }

        public void setSpendTime(Long spendTime) {
            this.spendTime = spendTime;
        }

        public Long getServerTime() {
            return serverTime;
        }

        public void setServerTime(Long serverTime) {
            this.serverTime = serverTime;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public TokenData getData() {
            return data;
        }

        public void setData(TokenData data) {
            this.data = data;
        }
    }


    public static class TokenData {

        /**
         * 访问令牌
         */
        private String token;

        /**
         * 有效期，单位：秒
         */
        private Long expireTime;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public Long getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
        }

        @Override
        public String toString() {
            return "TokenData{" +
                    "token='" + token + '\'' +
                    ", expireTime=" + expireTime +
                    '}';
        }
    }
}
