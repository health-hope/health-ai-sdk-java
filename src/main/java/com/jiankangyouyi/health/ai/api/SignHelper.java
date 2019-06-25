package com.jiankangyouyi.health.ai.api;

import com.jiankangyouyi.health.ai.api.util.RSAUtil;

import java.util.*;

/**
 * 加签帮助类
 *
 * @author yangsongbo
 */
public class SignHelper {


    /**
     * 加签
     *
     * @param signField  加签的属性Bean
     * @param privateKey 私钥，去掉BEGIN开头和END结尾，去掉换行
     * @return 签名
     */
    public static String sign(SignFieldBean signField, String privateKey) {
        String signString = createSignString(signField.signFiledMap());
        return RSAUtil.signWithSHA256(signString, privateKey, "UTF-8");
    }


    private static String createSignString(Map<String, String> params) {
        if (params != null && !params.isEmpty()) {
            StringBuilder prestr = new StringBuilder();
            List<String> keys = new ArrayList<>(params.keySet());

            Collections.sort(keys);

            for (int i = 0; i < keys.size(); i++) {
                String key = keys.get(i);
                String value = params.get(key);

                if (value == null || value.toString().length() == 0) {
                    continue;
                }
                if (i != 0) {
                    prestr.append("&");
                }
                prestr.append(key).append("=");
                prestr.append(value);
            }
            return prestr.toString();
        }
        return "";
    }

    /**
     * 加签Bean，定义了需要加签的属性
     *
     * @author yangsongbo
     */
    public static class SignFieldBean {

        /**
         * 应用ID
         */
        private String appId;

        /**
         * 随机字符串，建议使用UUID
         */
        private String nonceStr;

        /**
         * 请求时间， yyyy-MM-dd HH:mm:ss
         */
        private String timestamp;

        /**
         * 版本号,固定为2.0
         */
        private String version;


        public SignFieldBean(String appId, String nonceStr, String timestamp, String version) {
            super();
            this.appId = appId;
            this.nonceStr = nonceStr;
            this.timestamp = timestamp;
            this.version = version;
        }


        @Override
        public String toString() {
            return "SignFieldBean [appId=" + appId + ", nonceStr=" + nonceStr
                    + ", timestamp=" + timestamp + ", version=" + version + "]";
        }

        public Map<String, String> signFiledMap() {
            Map<String, String> map = new HashMap<>(4);
            map.put("appId", this.appId);
            map.put("nonceStr", this.nonceStr);
            map.put("timestamp", this.timestamp);
            map.put("version", this.version);
            return map;
        }
    }
}
