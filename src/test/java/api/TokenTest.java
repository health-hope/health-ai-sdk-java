package api;

import com.jiankangyouyi.health.ai.api.AuthHelper;
import com.jiankangyouyi.health.ai.api.util.JsonUtil;

public class TokenTest {

    public static void main(String[] args) {

        String appId = "your appId";
        String apiKey = "your apiKey";

        AuthHelper.AuthResponse authResponse = AuthHelper.auth(appId,apiKey);

        if(authResponse !=null && authResponse.getData() !=null){
            System.out.println("访问令牌 : " + authResponse.getData().getToken());
            System.out.println("有效期(秒） : " + authResponse.getData().getExpireTime());
        }

        System.out.println("authResponse : " + JsonUtil.toJson(authResponse));
    }


}
