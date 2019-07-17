package api;

import com.jiankangyouyi.health.ai.api.DefaultHealthAiClient;
import com.jiankangyouyi.health.ai.api.HealthAiClient;
import com.jiankangyouyi.health.ai.api.enums.Version;
import com.jiankangyouyi.health.ai.api.util.JsonUtil;

import java.util.HashMap;
import java.util.Map;

public class Sample {


//    public static void main(String[] args) {
//
//        String appId = "your appId";
//        String apiKey = "your apiKey";
//        String url = "https://api2.jiankangyouyi.com/v2/health/qas/query.do";
//
//        Map<String, Object> reqData = new HashMap<>(1);
//        reqData.put("question", "跑步可以减肥吗");
//
//        HealthAiClient client =
//                new TokenHealthAiClient(appId, apiKey, Version.VERSION_2_0);
//
//        //返回json字符串
//        String result = client.execute(JsonUtil.toJson(reqData), url);
//
//        System.out.println("result : " + result);
//    }


    public static void main(String[] args) {

        String appId = "your appId";
        //私钥
        String privateKey = "your privateKey";
        String url = "https://api2.jiankangyouyi.com/v2/health/qas/query.do";

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("question", "跑步可以减肥吗");

        HealthAiClient client =
                new DefaultHealthAiClient(appId, privateKey, Version.VERSION_2_0);

        //返回json字符串
        String result = client.execute(JsonUtil.toJson(reqData), url);

        System.out.println("result : " + result);
    }

}
