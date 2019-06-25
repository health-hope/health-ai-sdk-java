package api;

import com.jiankangyouyi.health.ai.api.DefaultHealthAiClient;
import com.jiankangyouyi.health.ai.api.HealthAiClient;
import com.jiankangyouyi.health.ai.api.TokenHealthAiClient;
import com.jiankangyouyi.health.ai.api.enums.Version;
import com.jiankangyouyi.health.ai.api.util.JsonUtil;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class Api3Test {
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


    private static final String JAVA_REQUEST_URL = "https://api.jiankangyouyi.com/ego-gw";

    private static final String PYTHON_REQUEST_URL = "https://api2.jiankangyouyi.com";


    /**
     * 健康问答
     *
     * @throws IOException
     */
    @Test
    public void qas() throws Exception {

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("question", "跑步可以减肥吗");

        String url = PYTHON_REQUEST_URL + "/v2/health/qas/query.do";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 一图一物食物识别Test : Base64
     *
     * @throws IOException
     */
    @Test
    public void imageFoodSingleRecognizeBase64Test() throws Exception {

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", image);

        String serverUrl = PYTHON_REQUEST_URL + "/v2/food/nutrient/recognition.do";
        execute(JsonUtil.toJson(reqData), serverUrl);
    }

    /**
     * 一图一物食物识别Test : URL
     */
    @Test
    public void imageFoodSingleRecognizeURLTest() throws Exception {

        String foodImageUrl =
                "https://files.public.jianzhishidai.cn/images/2/3f2e9663a6de4ba8afad88b4a5ed10c3.jpg";

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("foodImageUrl", foodImageUrl);


        String url = PYTHON_REQUEST_URL + "/v2/food/nutrient/recognition.do";
        execute(JsonUtil.toJson(reqData), url);

    }


    /**
     * 糖尿病食物识别
     */
    @Test
    public void queryDiabetesFoodByImageBase64() throws Exception {

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");


        Map<String, Object> reqData = new HashMap<>(3);
        reqData.put("image", image);
        reqData.put("foodImageUrl", null);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/diabetes";
        execute(JsonUtil.toJson(reqData), url);

    }


    /**
     * 糖尿病食物识别
     */
    @Test
    public void queryDiabetesFoodByImageURL() throws Exception {

        String foodImageUrl =
                "https://files.public.jianzhishidai.cn/images/2/3f2e9663a6de4ba8afad88b4a5ed10c3.jpg";


        Map<String, Object> reqData = new HashMap<>(3);
        reqData.put("image", null);
        reqData.put("foodImageUrl", foodImageUrl);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/diabetes";
        execute(JsonUtil.toJson(reqData), url);

    }


    /**
     * 高血压食物识别
     */
    @Test
    public void queryHypertensionFoodByImageURL() throws Exception {

        String foodImageUrl =
                "https://files.public.jianzhishidai.cn/images/2/3f2e9663a6de4ba8afad88b4a5ed10c3.jpg";


        Map<String, Object> reqData = new HashMap<>(3);
        reqData.put("image", null);
        reqData.put("foodImageUrl", foodImageUrl);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/hypertension";
        execute(JsonUtil.toJson(reqData), url);

    }


    /**
     * 高血压食物识别
     */
    @Test
    public void queryHypertensionFoodByImageBase64() throws Exception {

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        Map<String, Object> reqData = new HashMap<>(3);
        reqData.put("image", image);
        reqData.put("foodImageUrl", null);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/hypertension";
        execute(JsonUtil.toJson(reqData), url);

    }


    /**
     * 痛风食物识别
     */
    @Test
    public void queryGoutFoodByImageBase64() throws Exception {

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        Map<String, Object> reqData = new HashMap<>(3);
        reqData.put("image", image);
        reqData.put("foodImageUrl", null);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/gout";
        execute(JsonUtil.toJson(reqData), url);
    }

    /**
     * 痛风食物识别
     */
    @Test
    public void queryGoutFoodByImageURL() throws Exception {

        String foodImageUrl =
                "https://files.public.jianzhishidai.cn/images/2/3f2e9663a6de4ba8afad88b4a5ed10c3.jpg";


        Map<String, Object> reqData = new HashMap<>(3);
        reqData.put("image", null);
        reqData.put("foodImageUrl", foodImageUrl);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/gout";
        execute(JsonUtil.toJson(reqData), url);

    }


    /**
     * 冠心病食物识别
     */
    @Test
    public void queryCoronaryHeartDiseaseFoodByImageBase64() throws Exception {

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", image);
        reqData.put("foodImageUrl", null);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/coronary_heart_disease";
        execute(JsonUtil.toJson(reqData), url);
    }

    /**
     * 冠心病食物识别
     */
    @Test
    public void queryCoronaryHeartDiseaseFoodByImageURL() throws Exception {

        String foodImageUrl =
                "https://files.public.jianzhishidai.cn/images/2/3f2e9663a6de4ba8afad88b4a5ed10c3.jpg";

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", null);
        reqData.put("foodImageUrl", foodImageUrl);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/coronary_heart_disease";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 高血脂食物识别
     */
    @Test
    public void queryHyperlipidemiaImageBase64() throws Exception {

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", image);
        reqData.put("foodImageUrl", null);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/hyperlipidemia";
        execute(JsonUtil.toJson(reqData), url);
    }

    /**
     * 高血脂食物识别
     */
    @Test
    public void queryHyperlipidemiaImageURL() throws Exception {

        String foodImageUrl =
                "https://files.public.jianzhishidai.cn/images/2/3f2e9663a6de4ba8afad88b4a5ed10c3.jpg";

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", null);
        reqData.put("foodImageUrl", foodImageUrl);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/hyperlipidemia";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 孕妇人群食物识别
     */
    @Test
    public void queryPregnantWomanImageBase64() throws Exception {

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", image);
        reqData.put("foodImageUrl", null);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/pregnant_woman";
        execute(JsonUtil.toJson(reqData), url);
    }

    /**
     * 孕妇人群食物识别
     */
    @Test
    public void queryPregnantWomanImageURL() throws Exception {

        String foodImageUrl =
                "https://files.public.jianzhishidai.cn/images/2/3f2e9663a6de4ba8afad88b4a5ed10c3.jpg";

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", null);
        reqData.put("foodImageUrl", foodImageUrl);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/pregnant_woman";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 骨质疏松人群食物识别
     */
    @Test
    public void queryOsteoporosisImageBase64() throws Exception {

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", image);
        reqData.put("foodImageUrl", null);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/osteoporosis";
        execute(JsonUtil.toJson(reqData), url);
    }

    /**
     * 骨质疏松人群食物识别
     */
    @Test
    public void queryOsteoporosisImageURL() throws Exception {

        String foodImageUrl =
                "https://files.public.jianzhishidai.cn/images/2/3f2e9663a6de4ba8afad88b4a5ed10c3.jpg";

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", null);
        reqData.put("foodImageUrl", foodImageUrl);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/osteoporosis";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 脑卒中人群食物识别
     */
    @Test
    public void queryStrokeImageBase64() throws Exception {

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", image);
        reqData.put("foodImageUrl", null);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/stroke";
        execute(JsonUtil.toJson(reqData), url);
    }

    /**
     * 脑卒中人群食物识别
     */
    @Test
    public void queryStrokeImageURL() throws Exception {

        String foodImageUrl =
                "https://files.public.jianzhishidai.cn/images/2/3f2e9663a6de4ba8afad88b4a5ed10c3.jpg";

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", null);
        reqData.put("foodImageUrl", foodImageUrl);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/stroke";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 肥胖人群食物识别
     */
    @Test
    public void queryFatImageBase64() throws Exception {

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", image);
        reqData.put("foodImageUrl", null);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/fat";
        execute(JsonUtil.toJson(reqData), url);
    }

    /**
     * 肥胖人群食物识别
     */
    @Test
    public void queryFatImageURL() throws Exception {

        String foodImageUrl =
                "https://files.public.jianzhishidai.cn/images/2/3f2e9663a6de4ba8afad88b4a5ed10c3.jpg";

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", null);
        reqData.put("foodImageUrl", foodImageUrl);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/fat";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 脂肪肝人群食物识别
     */
    @Test
    public void queryFattyLiverImageBase64() throws Exception {

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", image);
        reqData.put("foodImageUrl", null);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/fatty-liver";
        execute(JsonUtil.toJson(reqData), url);
    }

    /**
     * 脂肪肝人群食物识别
     */
    @Test
    public void queryFattyLiverImageURL() throws Exception {

        String foodImageUrl =
                "https://files.public.jianzhishidai.cn/images/2/3f2e9663a6de4ba8afad88b4a5ed10c3.jpg";

        Map<String, Object> reqData = new HashMap<>(3);
        reqData.put("image", null);
        reqData.put("foodImageUrl", foodImageUrl);
        reqData.put("top", 3);

        String url = PYTHON_REQUEST_URL + "/v2/food/element/fatty-liver";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 能不能吃综合测试
     */
    @Test
    public void quayCanEat() throws Exception {

        Map<String, Object> highlight = new HashMap<>(2);
        highlight.put("highlightSimplePre", "<highlight>");
        highlight.put("highlightSimplePost", "</highlight>");

        Map<String, Object> pageInfo = new HashMap<>(2);
        pageInfo.put("pageNum", 1);
        pageInfo.put("pageSize", 2);

        Map<String, Object> reqDataText = new HashMap<>(3);
        reqDataText.put("text", "苹果");
        reqDataText.put("highlight", highlight);
        reqDataText.put("pageInfo", pageInfo);

        String speechPath = PATH + "/src/test/java/api/data/16k-23850.amr";
        String base64 = Base64.getEncoder().encodeToString(FileUtils.readFileToByteArray(new File(speechPath)));

        Map<String, Object> reqDataSpeech = new HashMap<>(3);
        reqDataSpeech.put("speech", base64);
        reqDataSpeech.put("rate", 16000);
        reqDataSpeech.put("format", "amr");
        reqDataSpeech.put("highlight", highlight);
        reqDataSpeech.put("pageInfo", pageInfo);

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");


        Map<String, Object> reqDataImage = new HashMap<>(1);
        reqDataImage.put("image", image);
        reqDataImage.put("foodImageUrl", null);
        reqDataImage.put("top", 3);


        System.out.println("糖尿病能不能吃文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/diabetes/text/label/list.do");


        System.out.println("糖尿病能不能吃语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/diabetes/speech/label/list.do");


        System.out.println("糖尿病能不能吃图像查询");
        execute(JsonUtil.toJson(reqDataImage),
                PYTHON_REQUEST_URL + "/v2/food/advice/diabetes");


        System.out.println("高血压能不能吃文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/hypertension/text/label/list.do");


        System.out.println("高血压能不能吃语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/hypertension/speech/label/list.do");


        System.out.println("高血压能不能吃图像查询");
        execute(JsonUtil.toJson(reqDataImage),
                PYTHON_REQUEST_URL + "/v2/food/advice/hypertension");


        System.out.println("痛风能不能吃文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/gout/text/label/list.do");

        System.out.println("痛风能不能吃语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/gout/speech/label/list.do");

        System.out.println("痛风能不能吃图像查询");
        execute(JsonUtil.toJson(reqDataImage),
                PYTHON_REQUEST_URL + "/v2/food/advice/gout");


        System.out.println("冠心病能不能吃文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/coronary/text/label/list.do");

        System.out.println("冠心病能不能吃语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/coronary/speech/label/list.do");

        System.out.println("冠心病能不能吃图像查询");
        execute(JsonUtil.toJson(reqDataImage),
                PYTHON_REQUEST_URL + "/v2/food/advice/coronary_heart_disease");


        System.out.println("高血脂能不能吃文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/blood-fat/text/label/list.do");

        System.out.println("高血脂能不能吃语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/blood-fat/speech/label/list.do");

        System.out.println("高血脂能不能吃图像查询");
        execute(JsonUtil.toJson(reqDataImage),
                PYTHON_REQUEST_URL + "/v2/food/advice/hyperlipidemia");


        System.out.println("孕妇能不能吃文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/expectant/text/label/list.do");

        System.out.println("孕妇能不能吃语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/expectant/speech/label/list.do");

        System.out.println("孕妇能不能吃图像查询");
        execute(JsonUtil.toJson(reqDataImage),
                PYTHON_REQUEST_URL + "/v2/food/advice/pregnant_woman");


        System.out.println("骨质疏松能不能吃文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/osteoporosis/text/label/list.do");

        System.out.println("骨质疏松能不能吃语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/osteoporosis/speech/label/list.do");

        System.out.println("骨质疏松能不能吃图像查询");
        execute(JsonUtil.toJson(reqDataImage),
                PYTHON_REQUEST_URL + "/v2/food/advice/osteoporosis");

        System.out.println("脑卒中能不能吃文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/stroke/text/label/list.do");

        System.out.println("脑卒中能不能吃语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/stroke/speech/label/list.do");

        System.out.println("脑卒中能不能吃图像查询");
        execute(JsonUtil.toJson(reqDataImage),
                PYTHON_REQUEST_URL + "/v2/food/advice/stroke");


        System.out.println("肥胖能不能吃文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/fatty-liver/text/label/list.do");

        System.out.println("肥胖能不能吃语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/fat/speech/label/list.do");

        System.out.println("肥胖能不能吃图像查询");
        execute(JsonUtil.toJson(reqDataImage),
                PYTHON_REQUEST_URL + "/v2/food/advice/fat");


        System.out.println("脂肪肝能不能吃文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/fatty-liver/text/label/list.do");

        System.out.println("脂肪肝能不能吃语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/fatty-liver/speech/label/list.do");

        System.out.println("脂肪肝能不能吃图像查询");
        execute(JsonUtil.toJson(reqDataImage),
                PYTHON_REQUEST_URL + "/v2/food/advice/fatty-liver");

    }


    /**
     * 表情识别
     *
     * @throws Exception
     */
    @Test
    public void recognitionEmotion() throws Exception {

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "emotion_recognize_base64_image.txt"), "UTF-8");

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", image);

        String url = PYTHON_REQUEST_URL + "/v2/image/emotion/recognition.do";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 人体三维体积重建
     *
     * @throws Exception
     */
    @Test
    public void threeDimensionalFeedback() throws Exception {


        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("imageList", Arrays.asList(
                "http://files.jiankangyouyi.com/84b8e8b8dcb911e8ba6100e18ceaed59",
                "http://files.jiankangyouyi.com/9323760cdcb911e8910700e18ceaed59"));

        reqData.put("imageType", "1");
        reqData.put("height", 180);
        reqData.put("gender", 1);

        String url = PYTHON_REQUEST_URL + "/v2/three/dimensional/feedback";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 食物三维体积识别
     */
    @Test
    public void foodVolumeRecognition() throws Exception {


        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("imageList", Arrays.asList(
                "http://files.jiankangyouyi.com/28be3e76b1af11e89a2400e18ceaed59",
                "http://files.jiankangyouyi.com/3279962cb1af11e89d5100e18ceaed59"));

        reqData.put("imageType", "1");

        String url = PYTHON_REQUEST_URL + "/v2/food/volume/recognition";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 食物查询
     */
    @Test
    public void queryFood() throws Exception {

        Map<String, Object> highlight = new HashMap<>(2);
        highlight.put("highlightSimplePre", "<highlight>");
        highlight.put("highlightSimplePost", "</highlight>");

        Map<String, Object> pageInfo = new HashMap<>(2);
        pageInfo.put("pageNum", 1);
        pageInfo.put("pageSize", 2);

        Map<String, Object> reqDataText = new HashMap<>(1);
        reqDataText.put("text", "苹果");
        reqDataText.put("count", 200);
        reqDataText.put("gender", 2);
        reqDataText.put("age", 31);
        reqDataText.put("birthday", "1988-11-26");
        reqDataText.put("highlight", highlight);
        reqDataText.put("pageInfo", pageInfo);
        reqDataText.put("stage", "1");


        String speechPath = PATH + "/src/test/java/api/data/16k-23850.amr";
        String base64 = Base64.getEncoder().encodeToString(FileUtils.readFileToByteArray(new File(speechPath)));

        Map<String, Object> reqDataSpeech = new HashMap<>(3);
        reqDataSpeech.put("speech", base64);
        reqDataSpeech.put("rate", 16000);
        reqDataSpeech.put("format", "amr");
        reqDataSpeech.put("gender", 2);
        reqDataSpeech.put("age", 31);
        reqDataSpeech.put("birthday", "1988-11-26");
        reqDataSpeech.put("highlight", highlight);
        reqDataSpeech.put("pageInfo", pageInfo);
        reqDataSpeech.put("stage", "1");


        System.out.println("健康人群食物文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/healthy/text/food/list.do");


        System.out.println("健康人群食物语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/healthy/speech/food/list.do");


        System.out.println("亚健康人群食物文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/sub-healthy/text/food/list.do");


        System.out.println("亚健康人群食物语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/sub-healthy/speech/food/list.do");


        System.out.println("糖尿病人群食物文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/diabetes/text/food/list.do");


        System.out.println("糖尿病人群食物语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/diabetes/speech/food/list.do");

        System.out.println("高血压人群食物文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/hypertension/text/food/list.do");

        System.out.println("高血压人群食物语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/hypertension/speech/food/list.do");

        System.out.println("高血脂人群食物文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/hyperlipidemia/text/food/list.do");

        System.out.println("高血脂人群食物语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/hyperlipidemia/speech/food/list.do");

        System.out.println("痛风人群食物文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/gout/text/food/list.do");

        System.out.println("痛风人群食物语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/gout/text/speech/list.do");

        System.out.println("冠心病人群饮食文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/coronary-heart-disease/text/food/list.do");

        System.out.println("冠心病人群饮食语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/coronary-heart-disease/speech/food/list.do");


        System.out.println("骨质疏松人群食物文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/osteoporosis/text/food/list.do");

        System.out.println("骨质疏松人群食物语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/osteoporosis/speech/food/list.do");


        System.out.println("脂肪肝人群食物文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/fatty-liver/text/food/list.do");

        System.out.println("脂肪肝人群饮食语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/fatty-liver/speech/food/list.do");


        System.out.println("脑卒中人群食物文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/stroke/text/food/list.do");

        System.out.println("脑卒中人群饮食语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/stroke/speech/food/list.do");


        System.out.println("肥胖人群饮食文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/fat/text/food/list.do");

        System.out.println("肥胖人群饮食语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/fat/speech/food/list.do");


        System.out.println("孕产妇人群食物文本查询");
        execute(JsonUtil.toJson(reqDataText),
                JAVA_REQUEST_URL + "/v2/query/maternal/text/food/list.do");

        System.out.println("孕产妇人群食物语音查询");
        execute(JsonUtil.toJson(reqDataSpeech),
                JAVA_REQUEST_URL + "/v2/query/maternal/speech/food/list.do");


    }


    /**
     * 运动查询
     */
    @Test
    public void queryTextExercise() throws Exception {

        Map<String, Object> bodyData = new HashMap<>();
        bodyData.put("gender", "1");
        bodyData.put("weight", 60);


        Map<String, Object> highlight = new HashMap<>(2);
        highlight.put("highlightSimplePre", "<highlight>");
        highlight.put("highlightSimplePost", "</highlight>");

        Map<String, Object> pageInfo = new HashMap<>(2);
        pageInfo.put("pageNum", 1);
        pageInfo.put("pageSize", 2);

        Map<String, Object> reqData = new HashMap<>(1);

        reqData.put("text", "游泳");
        reqData.put("count", 30);
        reqData.put("bodyData", bodyData);
        reqData.put("highlight", highlight);
        reqData.put("pageInfo", pageInfo);


        String url = JAVA_REQUEST_URL + "/v2/query/text/exercise/list.do";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 疾病症状查询
     */
    @Test
    public void queryDisease() throws Exception {

        Map<String, Object> highlight = new HashMap<>(2);
        highlight.put("highlightSimplePre", "<highlight>");
        highlight.put("highlightSimplePost", "</highlight>");

        Map<String, Object> pageInfo = new HashMap<>(2);
        pageInfo.put("pageNum", 1);
        pageInfo.put("pageSize", 2);

        Map<String, Object> reqData = new HashMap<>(1);

        reqData.put("text", "红癣");
        reqData.put("highlight", highlight);
        reqData.put("pageInfo", pageInfo);


        String url = JAVA_REQUEST_URL + "/v2/query/disease/list.do";
        execute(JsonUtil.toJson(reqData), url);
    }

    /**
     * 食品添加剂查询
     */
    @Test
    public void queryFoodAdditive() throws Exception {

        Map<String, Object> highlight = new HashMap<>(2);
        highlight.put("highlightSimplePre", "<highlight>");
        highlight.put("highlightSimplePost", "</highlight>");

        Map<String, Object> pageInfo = new HashMap<>(2);
        pageInfo.put("pageNum", 1);
        pageInfo.put("pageSize", 2);

        Map<String, Object> reqData = new HashMap<>(1);

        reqData.put("text", "酯");
        reqData.put("highlight", highlight);
        reqData.put("pageInfo", pageInfo);


        String url = JAVA_REQUEST_URL + "/v2/query/food_additive/list.do";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 药品查询
     */
    @Test
    public void queryDrug() throws Exception {

        Map<String, Object> highlight = new HashMap<>(2);
        highlight.put("highlightSimplePre", "<highlight>");
        highlight.put("highlightSimplePost", "</highlight>");

        Map<String, Object> pageInfo = new HashMap<>(2);
        pageInfo.put("pageNum", 1);
        pageInfo.put("pageSize", 2);

        Map<String, Object> reqData = new HashMap<>(1);

        reqData.put("text", "溶液");
        reqData.put("highlight", highlight);
        reqData.put("pageInfo", pageInfo);


        String url = JAVA_REQUEST_URL + "/v2/query/drug/list.do";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 药粥查询
     */
    @Test
    public void queryMedicatedGruel() throws Exception {

        Map<String, Object> highlight = new HashMap<>(2);
        highlight.put("highlightSimplePre", "<highlight>");
        highlight.put("highlightSimplePost", "</highlight>");

        Map<String, Object> pageInfo = new HashMap<>(2);
        pageInfo.put("pageNum", 1);
        pageInfo.put("pageSize", 2);

        Map<String, Object> reqData = new HashMap<>(1);

        reqData.put("text", "酸枣");
        reqData.put("highlight", highlight);
        reqData.put("pageInfo", pageInfo);


        String url = JAVA_REQUEST_URL + "/v2/query/medicated_gruel/list.do";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 饮食记录
     */
    @Test
    public void recordFood() throws Exception {

        Map<String, Object> reqData = new HashMap<>(1);

        reqData.put("text", "我上午吃了一个包子，一杯豆浆");

        String url = JAVA_REQUEST_URL + "/v2/semantic/record/food/analysis.do";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 运动记录文本解析
     */
    @Test
    public void recordExercise() throws Exception {

        Map<String, Object> reqData = new HashMap<>(1);

        reqData.put("text", "我刚才跑了30分钟");
        reqData.put("gender", "1");
        reqData.put("weight", 60);


        String url = JAVA_REQUEST_URL + "/v2/semantic/record/exercise/analysis.do";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 生活方式记录
     */
    @Test
    public void recordLifestyle() throws Exception {

        Map<String, Object> reqData = new HashMap<>(1);

        reqData.put("message", "我昨天午休了3个小时");

        String url = PYTHON_REQUEST_URL + "/v2/ai/lifestyle/record/query";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 产后记录
     */
    @Test
    public void recordPostpartum() throws Exception {

        Map<String, Object> reqData = new HashMap<>(1);

        reqData.put("message", "刚刚测了宝宝的体重是5公斤");
        reqData.put("messageType", "1");


        String url = PYTHON_REQUEST_URL + "/v2/ai/lifestyle/record/query";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 用药记录
     */
    @Test
    public void recordMedication() throws Exception {

        Map<String, Object> reqData = new HashMap<>(1);

        reqData.put("message", "今天上午九点我喝了2包清热感冒颗粒");
        reqData.put("messageType", "1");


        String url = PYTHON_REQUEST_URL + "/v2/ai/lifestyle/record/query";
        execute(JsonUtil.toJson(reqData), url);
    }

    /**
     * 理化指标记录
     */
    @Test
    public void recordPhysical() throws Exception {

        Map<String, Object> reqData = new HashMap<>(1);

        reqData.put("message", "测宝宝脑袋周长12厘米");
        reqData.put("messageType", "1");


        String url = PYTHON_REQUEST_URL + "/v2/ai/lifestyle/record/query";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 智能导诊
     */
    @Test
    public void diagnose() throws Exception {

        Map<String, Object> pageInfo = new HashMap<>(2);
        pageInfo.put("pageNum", 1);
        pageInfo.put("pageSize", 2);


        Map<String, Object> reqData = new HashMap<>(1);

        reqData.put("sessionId", null);
        reqData.put("gender", "1");
        reqData.put("age", "31");
        reqData.put("userId", "1891127112698931");
        reqData.put("address", "张家界");
        reqData.put("pageInfo", pageInfo);


        String url = JAVA_REQUEST_URL + "/v2/guide/diagnose/init.do";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 人体关键点识别
     */
    @Test
    public void humanBodyKeyPoint() throws Exception {

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("image", image);


        String url = PYTHON_REQUEST_URL + "/v2/human_body/key_point";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 随访
     */
    @Test
    public void qaFollow() throws Exception {


        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("userId", "189131441142");
        reqData.put("lastReply", null);


        String url = PYTHON_REQUEST_URL + "/v2/qa/follow/up/query";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 面部识别
     */
    @Test
    public void faceShape() throws Exception {

        String image =
                FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("imageFile", image);
        reqData.put("imageType", "1");


        String url = PYTHON_REQUEST_URL + "/v2/face/face_shape/key_point";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 对话式减脂测评
     */
    @Test
    public void evaluationFollowUp() throws Exception {


        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("phoneId", "314141414");
        reqData.put("lastReply", "1");
        reqData.put("evaluationCode", "TNBPC");


        String url = PYTHON_REQUEST_URL + "/v2/evaluation/follow/up/query";
        execute(JsonUtil.toJson(reqData), url);
    }


    /**
     * 对话式糖尿病饮食推荐
     */
    @Test
    public void recommend() throws Exception {

        Map<String, Object> reqData = new HashMap<>(1);
        reqData.put("phoneId", "314141414");
        reqData.put("lastReply", "1");
        reqData.put("dietRecommendCode", "XZYCPC");


        String url = PYTHON_REQUEST_URL + "/v2/multi/diet/recommend/query";
        execute(JsonUtil.toJson(reqData), url);
    }

    private void execute(String reqDataJson, String url) {

        HealthAiClient client1 =
                new TokenHealthAiClient(APP_ID, API_KEY, Version.VERSION_2_0);

        System.out.println("result by token : \n" + JsonUtil.formatJson(JsonUtil.toJson(client1.execute(reqDataJson, url))));

        HealthAiClient client2 =
                new DefaultHealthAiClient(APP_ID, PRIVATE_KEY, Version.VERSION_2_0);

        System.out.println("result by RSA : \n" + JsonUtil.formatJson(JsonUtil.toJson(client2.execute(reqDataJson, url))));

    }


    public static void main(String[] args) throws Exception {

        ///Users/yangsongbo/gitlab/health-ai-sdk-java/src/test/java/api/data/16k-23850.amr
//        String base64 = FileUtils.readFileToString(new File("/Users/yangsongbo/Downloads/bbbbbb.txt"));
//
//        byte[] bs = Base64.getDecoder().decode(base64);
//
//        FileUtils.writeByteArrayToFile(new File("/Users/yangsongbo/Downloads/bbbbbb.jpg"), bs);

        System.out.println(PATH.substring(0, PATH.indexOf("health-ai-sdk-java") + "health-ai-sdk-java".length()));
    }
}
