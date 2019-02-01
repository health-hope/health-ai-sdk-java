package api;

import com.jiankangyouyi.health.ai.api.DefaultHealthAiClient;
import com.jiankangyouyi.health.ai.api.DefaultHealthAiClient.Version;
import com.jiankangyouyi.health.ai.api.HealthAiClient;
import com.jiankangyouyi.health.ai.api.request.vision.*;
import com.jiankangyouyi.health.ai.api.response.vision.FoodElementQueryResponse;
import com.jiankangyouyi.health.ai.api.util.JsonUtil;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Api2Test {
    // 测试

    private static String APPID = "5b33941b84274a0aa482e105";
    private static String PRIVATE_KEY =
            "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDvGsh7/ollxwhrtRU3m746ERkgXW2gNlol+IcbvI/7APL+2ndMZvxpwliR59X7vMhPM1t33bkWDQLT1VIzmdkz/2ZTw7UN2EGgbTEflu3Bzt6UqQc0mOxJtsm6PMvfzrIhdr8rYDDR749QDhhKsEg2wzbJNBEhp7JCJRzTTqNpIvaTbaEck8FSm8H6QYOmAcupExrMQA7pEUVBgduVT3oMmcT5RnHh8hD8BjjMV9V/xq8tVOF7F++tvBtdoIW9gT+joFKCWUOertiQWENaub+lvKTeRaGeOlRjmZWp55rcx3hp56usGtSM3O8un8aKMbOJ448gka+XzQ/kOXUmPGlLAgMBAAECggEBAMYhKXQlzXC65q1pljVIJu8y7+Ezyf1yTG0ebcZ8D8rsVG7+VNDInex9EKuGsngxTMLkSa0f25j8GxWxtLXxjFxcDEzo5QSd6HOpR4VnqYhphWMmVUQuW84RW0Op0T6Zpl24alzlDk9H9TdfFp39STmntaQwMunybfIFksc+aIZaylP2sPkvjh8D9LyuSKKpmO5RMO8jM2EEo0AenonV7eXEvVQls/zht8ZnPQzGLBwCS+LvmggYjTbkDEELaVZClxjSgw1Ksw8cY3M05JZAZVfK8sZkxAAqzcrXNLZ0YC/wo/aZNw7LGPD78FHe/AFKTZ9rFtUWtmF9egwLN78aQ6ECgYEA/biIBQzsbRGWB6s3dkRjCYeWptc8aiNg0pzn+vmLbV9fmQII7bLS+lUjzZthYsjHBEEYilcrOYfx9ODT/1mzux+8e/kjxCvzOxJWktE2CfaRn2LzL1fXei6hk4It9kXxUCbxMeH0gTWhp6P8zmJcHh9LIyMZ2O8kivXdGjbRQFMCgYEA8UCjwni8esFnYn4qUXwyXap01EXGOhLqFIwiyds+InnLT723AXFFIxPW91lDCZdWXloL83flyP82qXAjfM//4Dvtb7bq2Ee77uCJn9DaGdQC8xJj1HHkkFInQSexFrIKwcEAPEMZ/EgdPrVW7Fmypf4CVd79RrqqoiHNv1eu9CkCgYEA+ZIXcehZc5vV2StI/fOc+5W80dZsHfc42VLwOYZX6Ljk3ywKPk4li4pOEoQh0jqu0Pd7PTErWobnsLmqrsW8rnc0Pzo9PU0CD3wlXnueTUSVz5NUpKAiW5Qc6W0m6tW33eDAZhHeIW7w2WbMWPKVrCeaEDEJzsLFTk80MwHy6PMCgYBO9CCj3G+SnQkAqtmeoU66aLajYdJl3xrMbrBT73R+Q+3NwwDJcBB4Ul3fxU6zLNwPNNkEbRC+nwd8nD6A8nGDKRmjnfFtpsxSeRmRPACkw0XT1wjk1gE/WiOOpzbFfq8WidtR3YP7lH49r4sq/pAA0whgogGxzBVbykRTgpa3QQKBgQCVWLYdXllqLUQhKZZa2ehShroO14fdCANc0eE5L6wl84gCzGX5ePPvk/WKZtaImTZFGNJZ+XwTGEf9cJ0oMTvZ5kdb3DOSWOIueq4uGohsZUeXBMVjeU6uRqBTn46i7gOH3/FS4U6Vcpr4lY/YVsBnJiQ/oST2jWwghHdvd4SMYw==";

    // 生产
    // private static String APPID = "5b07af2f1d41c863dcd7388d";
    // private static String PRIVATE_KEY =
    //         "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCp9lo5wFz+35hb/YhjnD8Ua3BS7DU3sawZS2AsnjSMOK5YZOeg9difG7TRD0mBX0A3mnQ3QpDCQB58LcpKc+WzHO/VAeSMlmnFEZuDBfSn+Ctv7QpazWvClOSAiLf0pw4EWxHKkp8X9B7Qi+B+MW3u4XScTNeakJQjRpG1EyCAMZIJIUTtcSBHut6p6lZ40o87dX+x6G06C7X65UbiC6UGagKPs4/vY5ur5KFFyTpK3VaH4w2sySU9HIImiS33G5hSh+xrkM46YtVv96frWcqeHvEExuVfwoBUM8Yu+/jttpprc/7wWR/c/oSTNownHG1hewTz+nJ+9rVfH0nIx2FvAgMBAAECggEAY+WgcoFWJ5hUfP0vxRx5Fw9vHc4oGWwcs2FSTedPC3vlPZ9RZZIamKo4RQivM5NAs23dEP3XB9WYFXT0iX5FbFl9vb03EEr4MBSBSymc+30qSscQZv6GcAADrmitducZngXJFz/GstWRpxIQCRwUeWualqOzte10pKc9zShI2g9S+psmHeM4pvftmPl25MP01NwtNfW8/5aQi6uWvxrXyzAgUoGEJI3vPIhH0wcVDL69Xgyyb4m6ivW+DaRvWGWiWvXyhP5CrQBnPHRrhSXwZ+6PcGAN9Q5i5R/ui9wo+MGHdwa32ebjIKUxkNyNfBZjiM/PSeycY3o17GNdKrCEgQKBgQDfJlFcPMdaMAwQbvhDU4bcpL6xxhmkmxGqBY6IoqvGsZWNTrq89Uu1+hcZb4NBMwQ/jBHahhc2wFt7r0h4bQKju8qnvHGswQMtlaTq5CVU2Pb3Yamz9G/PAJeWN/bZoZZkA2tF1dMFkeLQIowIfkfbgizBOetmM/8U9yVdTs8PVwKBgQDC+5m6DjqBLFxrVVKglQi/4AZhw85x7E+yup1i43AXf8oeyVVlrZJsI1Fo0Yx44bLZOYfTbAzwotHfXY51p05sXtvNke15jOsw/evA87xsvvFFMd8NO0jAMKkVJLnOL0rngKmdSwVMYUbcpb1LFdm6w17nvGzmOXwOhlOAB0AnqQKBgEUhas0nax7uiZ5Bspmw87PBOe57D5CmFafVht2ff5XTiCA5xrIpT+Y1bxiLKl91fZhuPU20gtaMawr7N3lPVCUDVXn3cEPzm5dwp6G5QjNx77idweQlEspPRabc+ZVccOnVAVOmNXShSGHwge9Tp9FCF7lYxytnalvFYQbyFkWLAoGAJ1cqai7KwRtZPlLFzB6l2Ej0IK+oLLY4UmBytuwaxrMC7flDYLOHsofhuhtlk1I+irOf4xmO9tJzM/UldDmgih8NjEmgN4EmRwlEkvbakrpn5cUtMvc+M4Dd7KUvVBmYrGL6VgE3/XQ3HvfV3Jt5BcS7llgfRMhebnPNzywnVpkCgYEAgjZSHwzyD36qK5mq/DzA7EmtSwYckjvZ9F/1E6UVBbJ7kI6/PMW7uMV+rBS9JjkwCK6j7rlFeXnMd+qvOnX/qEYyT4sTc+JctOWr5MGtRevc6xVxOsEq3HRqRdb3ibnxWHVvBmY7FZuqXCEKa6q8MhByiAFuj93cLF1c/cltqU4=";

    private static String DATA_PATH = "/Users/yangsongbo/workspace2/health-ai-sdk-java/src/test/java/api/data/";


    /**
     * 骨质疏松食物识别
     *
     * @throws IOException
     */
    @Test
    public void queryAdviceOsteoporosis() throws IOException {

        HealthAiClient client =
                new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");
        String image = FileUtils.readFileToString(new File("C:\\Users\\17600\\Desktop\\1111.txt"), "UTF-8");

        FoodImageQueryOsteoporosisRequest request = new FoodImageQueryOsteoporosisRequest();
        request.setImage(image);

        FoodElementQueryResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));

    }

    /**
     * 脑卒中食物识别
     *
     * @throws IOException
     */
    @Test
    public void queryAdviceStroke() throws IOException {

        HealthAiClient client =
                new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");
        String image = FileUtils.readFileToString(new File("C:\\Users\\17600\\Desktop\\1111.txt"), "UTF-8");

        FoodImageQueryStrokeRequest request = new FoodImageQueryStrokeRequest();
        request.setImage(image);

        FoodElementQueryResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));

    }

    /**
     * 痛风食物识别
     *
     * @throws IOException
     */
    @Test
    public void queryAdviceGout() throws IOException {

        HealthAiClient client =
                new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");
        String image = FileUtils.readFileToString(new File("C:\\Users\\17600\\Desktop\\1111.txt"), "UTF-8");

        FoodImageQueryGoutRequest request = new FoodImageQueryGoutRequest();
        request.setImage(image);

        FoodElementQueryResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));

    }

    /**
     * 糖尿病食物识别
     *
     * @throws IOException
     */
    @Test
    public void queryAdviceDiabetes() throws IOException {

        HealthAiClient client =
                new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");
        String image = FileUtils.readFileToString(new File("C:\\Users\\17600\\Desktop\\1111.txt"), "UTF-8");

        FoodImageQueryDiabetesRequest request = new FoodImageQueryDiabetesRequest();
        request.setImage(image);

        FoodElementQueryResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));

    }

    /**
     * 高血压食物识别
     *
     * @throws IOException
     */
    @Test
    public void queryAdviceHypertension() throws IOException {

        HealthAiClient client =
                new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");
        String image = FileUtils.readFileToString(new File("C:\\Users\\17600\\Desktop\\1111.txt"), "UTF-8");

        FoodImageQueryHypertensionRequest request = new FoodImageQueryHypertensionRequest();
        request.setImage(image);

        FoodElementQueryResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));

    }

    /**
     * 冠心病食物识别
     *
     * @throws IOException
     */
    @Test
    public void queryAdviceCoronary() throws IOException {

        HealthAiClient client =
                new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");
        String image = FileUtils.readFileToString(new File("C:\\Users\\17600\\Desktop\\1111.txt"), "UTF-8");

        FoodImageQueryCoronaryRequest request = new FoodImageQueryCoronaryRequest();
        request.setImage(image);

        FoodElementQueryResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));

    }

    /**
     * 孕妇食物识别
     *
     * @throws IOException
     */
    @Test
    public void queryAdvicePregnantWoman() throws IOException {

        HealthAiClient client =
                new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");
        String image = FileUtils.readFileToString(new File("C:\\Users\\17600\\Desktop\\1111.txt"), "UTF-8");

        FoodImageQueryPregnantWomanRequest request = new FoodImageQueryPregnantWomanRequest();
        request.setImage(image);

        FoodElementQueryResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));

    }

    /**
     * 高血脂食物识别
     *
     * @throws IOException
     */
    @Test
    public void queryAdviceHighBloodFat() throws IOException {

        HealthAiClient client =
                new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");
        String image = FileUtils.readFileToString(new File("C:\\Users\\17600\\Desktop\\1111.txt"), "UTF-8");
        FoodImageQueryHighBloodFatRequest request = new FoodImageQueryHighBloodFatRequest();
        request.setImage(image);
        FoodElementQueryResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));

    }


}
