package api;

import com.jiankangyouyi.health.ai.api.HealthAiClient;
import com.jiankangyouyi.health.ai.api.TokenHealthAiClient;
import com.jiankangyouyi.health.ai.api.enums.Version;
import com.jiankangyouyi.health.ai.api.util.HttpClientUtil;
import com.jiankangyouyi.health.ai.api.util.JsonUtil;
import com.jiankangyouyi.health.ai.api.util.UUIDUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Api4Test {
    // 测试

    private static String APP_ID = "5b33941b84274a0aa482e105";
    private static String API_KEY = "3824ff925c45490192ed5bc377ae94ca";

    private static String PRIVATE_KEY =
            "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDvGsh7/ollxwhrtRU3m746ERkgXW2gNlol+IcbvI/7APL+2ndMZvxpwliR59X7vMhPM1t33bkWDQLT1VIzmdkz/2ZTw7UN2EGgbTEflu3Bzt6UqQc0mOxJtsm6PMvfzrIhdr8rYDDR749QDhhKsEg2wzbJNBEhp7JCJRzTTqNpIvaTbaEck8FSm8H6QYOmAcupExrMQA7pEUVBgduVT3oMmcT5RnHh8hD8BjjMV9V/xq8tVOF7F++tvBtdoIW9gT+joFKCWUOertiQWENaub+lvKTeRaGeOlRjmZWp55rcx3hp56usGtSM3O8un8aKMbOJ448gka+XzQ/kOXUmPGlLAgMBAAECggEBAMYhKXQlzXC65q1pljVIJu8y7+Ezyf1yTG0ebcZ8D8rsVG7+VNDInex9EKuGsngxTMLkSa0f25j8GxWxtLXxjFxcDEzo5QSd6HOpR4VnqYhphWMmVUQuW84RW0Op0T6Zpl24alzlDk9H9TdfFp39STmntaQwMunybfIFksc+aIZaylP2sPkvjh8D9LyuSKKpmO5RMO8jM2EEo0AenonV7eXEvVQls/zht8ZnPQzGLBwCS+LvmggYjTbkDEELaVZClxjSgw1Ksw8cY3M05JZAZVfK8sZkxAAqzcrXNLZ0YC/wo/aZNw7LGPD78FHe/AFKTZ9rFtUWtmF9egwLN78aQ6ECgYEA/biIBQzsbRGWB6s3dkRjCYeWptc8aiNg0pzn+vmLbV9fmQII7bLS+lUjzZthYsjHBEEYilcrOYfx9ODT/1mzux+8e/kjxCvzOxJWktE2CfaRn2LzL1fXei6hk4It9kXxUCbxMeH0gTWhp6P8zmJcHh9LIyMZ2O8kivXdGjbRQFMCgYEA8UCjwni8esFnYn4qUXwyXap01EXGOhLqFIwiyds+InnLT723AXFFIxPW91lDCZdWXloL83flyP82qXAjfM//4Dvtb7bq2Ee77uCJn9DaGdQC8xJj1HHkkFInQSexFrIKwcEAPEMZ/EgdPrVW7Fmypf4CVd79RrqqoiHNv1eu9CkCgYEA+ZIXcehZc5vV2StI/fOc+5W80dZsHfc42VLwOYZX6Ljk3ywKPk4li4pOEoQh0jqu0Pd7PTErWobnsLmqrsW8rnc0Pzo9PU0CD3wlXnueTUSVz5NUpKAiW5Qc6W0m6tW33eDAZhHeIW7w2WbMWPKVrCeaEDEJzsLFTk80MwHy6PMCgYBO9CCj3G+SnQkAqtmeoU66aLajYdJl3xrMbrBT73R+Q+3NwwDJcBB4Ul3fxU6zLNwPNNkEbRC+nwd8nD6A8nGDKRmjnfFtpsxSeRmRPACkw0XT1wjk1gE/WiOOpzbFfq8WidtR3YP7lH49r4sq/pAA0whgogGxzBVbykRTgpa3QQKBgQCVWLYdXllqLUQhKZZa2ehShroO14fdCANc0eE5L6wl84gCzGX5ePPvk/WKZtaImTZFGNJZ+XwTGEf9cJ0oMTvZ5kdb3DOSWOIueq4uGohsZUeXBMVjeU6uRqBTn46i7gOH3/FS4U6Vcpr4lY/YVsBnJiQ/oST2jWwghHdvd4SMYw==";


    private static String DATA_PATH = "/Users/yangsongbo/workspace2/health-ai-sdk-java/src/test/java/api/data/";


    private static String PATH = Thread.currentThread().getContextClassLoader().getResource("").getPath();

    static {
        PATH = PATH.substring(0, PATH.indexOf("health-ai-sdk-java") + "health-ai-sdk-java".length());
    }


    private static final String JAVA_REQUEST_URL = "https://api.hbox2.jiankangyouyi.com/ego-gw";

    private static final String PYTHON_REQUEST_URL = "https://api2.hbox.jiankangyouyi.com";


    /**
     * 同步扫码登录状态
     */
    @Test
    public void syncQrcodeLoginStatus() throws Exception {

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("qrcodeId", "b17a1184752943b1a84be1ec61b88107");
        reqData.put("deviceId", UUIDUtil.getJavaUUID());


        String url = JAVA_REQUEST_URL + "/v2/smart-space/qrcode/login-status/sync.do";

        HealthAiClient client1 =
                new TokenHealthAiClient(APP_ID, API_KEY, Version.VERSION_2_0);

        try {
            System.out.println("result by token : \n"
                    + JsonUtil.formatJson(client1.execute(JsonUtil.toJson(reqData), url)));
        } catch (Exception e) {
            System.err.println(e);
        }
    }


    /**
     * 智慧健康小屋扫码登录接口。
     */
    @Test
    public void qrcodeLogin() throws Exception {

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("qrcodeId", "b17a1184752943b1a84be1ec61b88107");
        reqData.put("openId", "8a149c7f126f49ceb122ad85600b2217");
        reqData.put("loginStatus", "3");


        String url = JAVA_REQUEST_URL + "/wxapp/smart-space/qrcode/login.do";

        String reqDataJson = JsonUtil.toJson(reqData);
        System.out.println("requst:\n" + JsonUtil.formatJson(reqDataJson));
        String result = HttpClientUtil.post(url, reqDataJson, HttpClientUtil.CONTENT_TYPE_JSON);


        try {
            System.out.println("result : \n"
                    + JsonUtil.formatJson(result));
        } catch (Exception e) {
            System.err.println(e);
        }
    }


    /**
     * 扫码登录成功
     */
    @Test
    public void faceLoginSuccess() throws Exception {

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("openId", "8a149c7f126f49ceb122ad85600b2217");
        reqData.put("deviceId", UUIDUtil.getJavaUUID());


        String url = JAVA_REQUEST_URL + "/v2/smart-space/face/login/success.do";

        HealthAiClient client1 =
                new TokenHealthAiClient(APP_ID, API_KEY, Version.VERSION_2_0);

        try {
            System.out.println("result by token : \n"
                    + JsonUtil.formatJson(client1.execute(JsonUtil.toJson(reqData), url)));
        } catch (Exception e) {
            System.err.println(e);
        }
    }


    /**
     * 获取用户信息
     */
    @Test
    public void getUserInfo() throws Exception {

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("openId", "okHkn41D4VYBP5Jw3ZgfuQUn3zPA");


        String url = JAVA_REQUEST_URL + "/v2/smart-space/user/info.do";

        HealthAiClient client1 =
                new TokenHealthAiClient(APP_ID, API_KEY, Version.VERSION_2_0);

        try {
            System.out.println("result by token : \n"
                    + JsonUtil.formatJson(client1.execute(JsonUtil.toJson(reqData), url)));
        } catch (Exception e) {
            System.err.println(e);
        }
    }


    /**
     * 获取用户信息
     */
    @Test
    public void getUserInfoFromWxapp() throws Exception {

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("openId", "okHkn41D4VYBP5Jw3ZgfuQUn3zPA");


        String url = JAVA_REQUEST_URL + "/wxapp/smart-space/user/info.do";

        String reqDataJson = JsonUtil.toJson(reqData);
        System.out.println("requst:\n" + JsonUtil.formatJson(reqDataJson));
        String result = HttpClientUtil.post(url, reqDataJson, HttpClientUtil.CONTENT_TYPE_JSON);


        try {
            System.out.println("result : \n"
                    + JsonUtil.formatJson(result));
        } catch (Exception e) {
            System.err.println(e);
        }
    }


    /**
     * 获取微信小程序access token
     */
    @Test
    public void getWxappAccessToken() throws Exception {

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("chanType", "smartspace");


        String url = JAVA_REQUEST_URL + "/v2/smart-space/wxapp/access/token.do";

        HealthAiClient client1 =
                new TokenHealthAiClient(APP_ID, API_KEY, Version.VERSION_2_0);

        try {
            System.out.println("result by token : \n"
                    + JsonUtil.formatJson(client1.execute(JsonUtil.toJson(reqData), url)));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
