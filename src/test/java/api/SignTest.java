package api;

import com.jiankangyouyi.health.ai.api.AuthHelper;
import com.jiankangyouyi.health.ai.api.SignHelper;
import com.jiankangyouyi.health.ai.api.enums.Version;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.UUID;

public class SignTest {

    public static void main(String[] args) {

        String appId = "your appId";
        String privateKey = "your privateKey";

        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);
        String timestamp = sdf.format(new Timestamp(System.currentTimeMillis()));


        String sign = SignHelper.sign(
                new SignHelper.SignFieldBean(
                        appId, UUID.randomUUID().toString(),timestamp, Version.VERSION_2_0.getValue()
                ),
                privateKey);

        System.out.println("签名 ： "+ sign);
    }


}
