package api;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import com.jiankangyouyi.health.ai.api.DefaultHealthAiClient;
import com.jiankangyouyi.health.ai.api.DefaultHealthAiClient.Version;
import com.jiankangyouyi.health.ai.api.HealthAiClient;
import com.jiankangyouyi.health.ai.api.PageInfo;
import com.jiankangyouyi.health.ai.api.bean.analysis.MealDataBean;
import com.jiankangyouyi.health.ai.api.bean.evaluation.EvaluationUserInfoBean;
import com.jiankangyouyi.health.ai.api.bean.evaluation.EvaluationUserOptionsBean;
import com.jiankangyouyi.health.ai.api.bean.food.RecommendFoodBean;
import com.jiankangyouyi.health.ai.api.request.BodyThreeDimensionalRequest;
import com.jiankangyouyi.health.ai.api.request.FoodRecommendChangementRequest;
import com.jiankangyouyi.health.ai.api.request.FoodRecommendRequest;
import com.jiankangyouyi.health.ai.api.request.FoodVolumeRecognitionRequest;
import com.jiankangyouyi.health.ai.api.request.ImageEmotionRecognizeRequest;
import com.jiankangyouyi.health.ai.api.request.ImageFoodSingleRecognizeRequest;
import com.jiankangyouyi.health.ai.api.request.analysis.AnalysisDiabetesMealReqData;
import com.jiankangyouyi.health.ai.api.request.analysis.AnalysisHealthyMealReqData;
import com.jiankangyouyi.health.ai.api.request.analysis.AnalysisHyperlipidemiaMealReqData;
import com.jiankangyouyi.health.ai.api.request.analysis.AnalysisHypertensionMealReqData;
import com.jiankangyouyi.health.ai.api.request.analysis.AnalysisMaternalMealReqData;
import com.jiankangyouyi.health.ai.api.request.analysis.AnalysisSubHealthyMealReqData;
import com.jiankangyouyi.health.ai.api.request.evaluation.EvaluationBriefLoadRequest;
import com.jiankangyouyi.health.ai.api.request.evaluation.EvaluationContentLoadRequest;
import com.jiankangyouyi.health.ai.api.request.evaluation.EvaluationDataSaveRequest;
import com.jiankangyouyi.health.ai.api.request.evaluation.EvaluationResultLoadRequest;
import com.jiankangyouyi.health.ai.api.request.qas.QasQueryAnswerRequest;
import com.jiankangyouyi.health.ai.api.request.query.ExerciseSpeechQueryRequest;
import com.jiankangyouyi.health.ai.api.request.query.ExerciseTextQueryRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodImageQueryDiabetesRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodImageQueryHealthyRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodImageQueryHyperlipidemiaRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodImageQueryHypertensionRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodImageQueryMaternalRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodImageQuerySubHealthyRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodSpeechQueryDiabetesRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodSpeechQueryHealthyRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodSpeechQueryHyperlipidemiaRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodSpeechQueryHypertensionRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodSpeechQueryMaternalRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodSpeechQuerySubHealthyRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodTextQueryDiabetesRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodTextQueryHealthyRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodTextQueryHyperlipidemiaRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodTextQueryHypertensionRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodTextQueryMaternalRequest;
import com.jiankangyouyi.health.ai.api.request.query.FoodTextQuerySubHealthyRequest;
import com.jiankangyouyi.health.ai.api.request.query.bean.BodyDataBean;
import com.jiankangyouyi.health.ai.api.request.query.bean.HighlightBean;
import com.jiankangyouyi.health.ai.api.request.record.RecordLifestyleRequest;
import com.jiankangyouyi.health.ai.api.response.BodyThreeDimensionalResponse;
import com.jiankangyouyi.health.ai.api.response.FoodRecommendChangementResponse;
import com.jiankangyouyi.health.ai.api.response.FoodRecommendResponse;
import com.jiankangyouyi.health.ai.api.response.FoodVolumeRecognitionResponse;
import com.jiankangyouyi.health.ai.api.response.ImageEmotionRecognizeResponse;
import com.jiankangyouyi.health.ai.api.response.ImageFoodSingleRecognizeResponse;
import com.jiankangyouyi.health.ai.api.response.analysis.AnalysisMealGeneralResData;
import com.jiankangyouyi.health.ai.api.response.evaluation.EvaluationBriefLoadResponse;
import com.jiankangyouyi.health.ai.api.response.evaluation.EvaluationContentLoadResponse;
import com.jiankangyouyi.health.ai.api.response.evaluation.EvaluationDataSaveResponse;
import com.jiankangyouyi.health.ai.api.response.evaluation.EvaluationResultLoadResponse;
import com.jiankangyouyi.health.ai.api.response.qas.QasQueryAnswerResponse;
import com.jiankangyouyi.health.ai.api.response.query.ExerciseQueryGeneralResponse;
import com.jiankangyouyi.health.ai.api.response.query.FoodImageQueryGeneralResponse;
import com.jiankangyouyi.health.ai.api.response.query.FoodTextSpeechQueryGeneralResponse;
import com.jiankangyouyi.health.ai.api.response.record.RecordLifestyleResponse;
import com.jiankangyouyi.health.ai.api.util.Base64Util;
import com.jiankangyouyi.health.ai.api.util.HttpClientUtil;
import com.jiankangyouyi.health.ai.api.util.JsonUtil;

public class ApiTest {
    // 测试
    private static String APPID = "5b33941b84274a0aa482e105";
    private static String PRIVATE_KEY =
        "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDvGsh7/ollxwhrtRU3m746ERkgXW2gNlol+IcbvI/7APL+2ndMZvxpwliR59X7vMhPM1t33bkWDQLT1VIzmdkz/2ZTw7UN2EGgbTEflu3Bzt6UqQc0mOxJtsm6PMvfzrIhdr8rYDDR749QDhhKsEg2wzbJNBEhp7JCJRzTTqNpIvaTbaEck8FSm8H6QYOmAcupExrMQA7pEUVBgduVT3oMmcT5RnHh8hD8BjjMV9V/xq8tVOF7F++tvBtdoIW9gT+joFKCWUOertiQWENaub+lvKTeRaGeOlRjmZWp55rcx3hp56usGtSM3O8un8aKMbOJ448gka+XzQ/kOXUmPGlLAgMBAAECggEBAMYhKXQlzXC65q1pljVIJu8y7+Ezyf1yTG0ebcZ8D8rsVG7+VNDInex9EKuGsngxTMLkSa0f25j8GxWxtLXxjFxcDEzo5QSd6HOpR4VnqYhphWMmVUQuW84RW0Op0T6Zpl24alzlDk9H9TdfFp39STmntaQwMunybfIFksc+aIZaylP2sPkvjh8D9LyuSKKpmO5RMO8jM2EEo0AenonV7eXEvVQls/zht8ZnPQzGLBwCS+LvmggYjTbkDEELaVZClxjSgw1Ksw8cY3M05JZAZVfK8sZkxAAqzcrXNLZ0YC/wo/aZNw7LGPD78FHe/AFKTZ9rFtUWtmF9egwLN78aQ6ECgYEA/biIBQzsbRGWB6s3dkRjCYeWptc8aiNg0pzn+vmLbV9fmQII7bLS+lUjzZthYsjHBEEYilcrOYfx9ODT/1mzux+8e/kjxCvzOxJWktE2CfaRn2LzL1fXei6hk4It9kXxUCbxMeH0gTWhp6P8zmJcHh9LIyMZ2O8kivXdGjbRQFMCgYEA8UCjwni8esFnYn4qUXwyXap01EXGOhLqFIwiyds+InnLT723AXFFIxPW91lDCZdWXloL83flyP82qXAjfM//4Dvtb7bq2Ee77uCJn9DaGdQC8xJj1HHkkFInQSexFrIKwcEAPEMZ/EgdPrVW7Fmypf4CVd79RrqqoiHNv1eu9CkCgYEA+ZIXcehZc5vV2StI/fOc+5W80dZsHfc42VLwOYZX6Ljk3ywKPk4li4pOEoQh0jqu0Pd7PTErWobnsLmqrsW8rnc0Pzo9PU0CD3wlXnueTUSVz5NUpKAiW5Qc6W0m6tW33eDAZhHeIW7w2WbMWPKVrCeaEDEJzsLFTk80MwHy6PMCgYBO9CCj3G+SnQkAqtmeoU66aLajYdJl3xrMbrBT73R+Q+3NwwDJcBB4Ul3fxU6zLNwPNNkEbRC+nwd8nD6A8nGDKRmjnfFtpsxSeRmRPACkw0XT1wjk1gE/WiOOpzbFfq8WidtR3YP7lH49r4sq/pAA0whgogGxzBVbykRTgpa3QQKBgQCVWLYdXllqLUQhKZZa2ehShroO14fdCANc0eE5L6wl84gCzGX5ePPvk/WKZtaImTZFGNJZ+XwTGEf9cJ0oMTvZ5kdb3DOSWOIueq4uGohsZUeXBMVjeU6uRqBTn46i7gOH3/FS4U6Vcpr4lY/YVsBnJiQ/oST2jWwghHdvd4SMYw==";

    // 生产
    // private static String APPID = "5b07af2f1d41c863dcd7388d";
    // private static String PRIVATE_KEY =
    // "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCp9lo5wFz+35hb/YhjnD8Ua3BS7DU3sawZS2AsnjSMOK5YZOeg9difG7TRD0mBX0A3mnQ3QpDCQB58LcpKc+WzHO/VAeSMlmnFEZuDBfSn+Ctv7QpazWvClOSAiLf0pw4EWxHKkp8X9B7Qi+B+MW3u4XScTNeakJQjRpG1EyCAMZIJIUTtcSBHut6p6lZ40o87dX+x6G06C7X65UbiC6UGagKPs4/vY5ur5KFFyTpK3VaH4w2sySU9HIImiS33G5hSh+xrkM46YtVv96frWcqeHvEExuVfwoBUM8Yu+/jttpprc/7wWR/c/oSTNownHG1hewTz+nJ+9rVfH0nIx2FvAgMBAAECggEAY+WgcoFWJ5hUfP0vxRx5Fw9vHc4oGWwcs2FSTedPC3vlPZ9RZZIamKo4RQivM5NAs23dEP3XB9WYFXT0iX5FbFl9vb03EEr4MBSBSymc+30qSscQZv6GcAADrmitducZngXJFz/GstWRpxIQCRwUeWualqOzte10pKc9zShI2g9S+psmHeM4pvftmPl25MP01NwtNfW8/5aQi6uWvxrXyzAgUoGEJI3vPIhH0wcVDL69Xgyyb4m6ivW+DaRvWGWiWvXyhP5CrQBnPHRrhSXwZ+6PcGAN9Q5i5R/ui9wo+MGHdwa32ebjIKUxkNyNfBZjiM/PSeycY3o17GNdKrCEgQKBgQDfJlFcPMdaMAwQbvhDU4bcpL6xxhmkmxGqBY6IoqvGsZWNTrq89Uu1+hcZb4NBMwQ/jBHahhc2wFt7r0h4bQKju8qnvHGswQMtlaTq5CVU2Pb3Yamz9G/PAJeWN/bZoZZkA2tF1dMFkeLQIowIfkfbgizBOetmM/8U9yVdTs8PVwKBgQDC+5m6DjqBLFxrVVKglQi/4AZhw85x7E+yup1i43AXf8oeyVVlrZJsI1Fo0Yx44bLZOYfTbAzwotHfXY51p05sXtvNke15jOsw/evA87xsvvFFMd8NO0jAMKkVJLnOL0rngKmdSwVMYUbcpb1LFdm6w17nvGzmOXwOhlOAB0AnqQKBgEUhas0nax7uiZ5Bspmw87PBOe57D5CmFafVht2ff5XTiCA5xrIpT+Y1bxiLKl91fZhuPU20gtaMawr7N3lPVCUDVXn3cEPzm5dwp6G5QjNx77idweQlEspPRabc+ZVccOnVAVOmNXShSGHwge9Tp9FCF7lYxytnalvFYQbyFkWLAoGAJ1cqai7KwRtZPlLFzB6l2Ej0IK+oLLY4UmBytuwaxrMC7flDYLOHsofhuhtlk1I+irOf4xmO9tJzM/UldDmgih8NjEmgN4EmRwlEkvbakrpn5cUtMvc+M4Dd7KUvVBmYrGL6VgE3/XQ3HvfV3Jt5BcS7llgfRMhebnPNzywnVpkCgYEAgjZSHwzyD36qK5mq/DzA7EmtSwYckjvZ9F/1E6UVBbJ7kI6/PMW7uMV+rBS9JjkwCK6j7rlFeXnMd+qvOnX/qEYyT4sTc+JctOWr5MGtRevc6xVxOsEq3HRqRdb3ibnxWHVvBmY7FZuqXCEKa6q8MhByiAFuj93cLF1c/cltqU4=";

    private static String DATA_PATH = "/Users/yangsongbo/workspace2/health-ai-sdk-java/src/test/java/api/data/";

    /**
     * 表情识别Test : base64 数据
     * 
     * @throws IOException
     */
    @Test
    public void imageEmotionRecognizeBase64Test() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.jiankangyouyi.com");

        String image = FileUtils.readFileToString(new File(DATA_PATH + "emotion_recognize_base64_image.txt"), "UTF-8");
        ImageEmotionRecognizeRequest request = new ImageEmotionRecognizeRequest();
        request.setImage(image);
        ImageEmotionRecognizeResponse response = client.execute(request);
        // response json ：
        // {"curTime":"2018-06-28
        // 18:47:36","recognitionEmotionList":[{"confidence":0.986506,"emotionName":"happy","leftCoordinate":0.781,"topCoordinate":0.0981}],"retCode":"SUCCESS","retInfo":"处理成功","sn":"ab1c6cd87ac011e8aa9bac1f6b22e430"}

        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
        int i = 3 * 60;
    }

    /**
     * 表情识别Test : URL
     * 
     * 
     * @throws IOException
     */
    @Test
    public void imageEmotionRecognizeURLTest() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");
        String emotionImageUrl = "https://oieve67xn.qnssl.com/images/2/b4d2cda31c8246d2bd2c2db67007833e.jpeg";

        ImageEmotionRecognizeRequest request = new ImageEmotionRecognizeRequest();
        request.setEmotionImageUrl(emotionImageUrl);
        ImageEmotionRecognizeResponse response = client.execute(request);

        // response json ：
        // {"curTime":"2018-06-28
        // 18:47:36","recognitionEmotionList":[{"confidence":0.986506,"emotionName":"happy","leftCoordinate":0.781,"topCoordinate":0.0981}],"retCode":"SUCCESS","retInfo":"处理成功","sn":"ab1c6cd87ac011e8aa9bac1f6b22e430"}
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));

    }

    /**
     * 一图多物食物识别Test : Base64
     * 
     * 
     * @throws IOException
     * 
     * @Test public void imageFoodMultiRecognizeBase64Test() throws IOException { String image =
     *       FileUtils.readFileToString(new File(DATA_PATH + "food_multi_recognize_base64_image.txt"), "UTF-8");
     * 
     *       HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
     *       "https://api2.hbox.jiankangyouyi.com"); ImageFoodMultiRecognizeRequest request = new
     *       ImageFoodMultiRecognizeRequest(); request.setImage(image); ImageFoodMultiRecognizeResponse response =
     *       client.execute(request); // response json ： // {"curTime":"2018-06-28 // 18:56:
     *       47","recognitionFoodList":[{"alanine":0.0,"arginine":0.0,"aspartic":0.0,"calcium":5.84,"carbohydrate":24.94,"carotene":0.0,"cholesterol":0.0,"chromium":0.0,"confidence":0.857318,"copper":0.05,"ediblePart":100.0,"fat":11.78,"fluorine":0.0,"foodId":"57b6bd3f3004d165422ad74b","foodName":"米饭","gi":0.0,"glutamic":0.0,"glycine":0.0,"heat":225,"heatKJ":941,"histidine":0.0,"iodine":0.0,"iron":1.05,"isoleucine":0.0,"leftCoordinate":0.407,"leucine":0.0,"lysine":0.0,"manganese":0.46,"methionine":0.0,"mfaPercent":45.07,"moisture":55.61,"monounsaturatedFattyAcid":0.84,"pfaPercent":41.19,"phenylalanine":0.0,"phosphorus":48.65,"polyunsaturatedFattyAcid":0.77,"potassium":23.59,"proline":0.0,"protein":4.63,"recognitionFoodNum":0,"saturatedFattyAcid":0.27,"selenium":0.31,"serine":0.0,"sfaPercent":14.36,"sodium":2.06,"solkfloc":0.24,"soyIsoflavone":0.0,"threonine":0.0,"topCoordinate":0.0898,"totalFattyAcid":1.87,"tryptophan":0.0,"unit":"克","valine":0.0,"vitaminA":0.0,"vitaminB1":0.06,"vitaminB12":0.0,"vitaminB2":0.02,"vitaminB3":1.49,"vitaminB5":0.0,"vitaminB6":0.0,"vitaminB9":0.0,"vitaminC":0.0,"vitaminD":0.0,"vitaminE":0.47,"vitaminK":0.0,"zinc":0.73},{"alanine":897.5,"arginine":758.0,"aspartic":922.5,"calcium":8.5,"carbohydrate":0.15,"carotene":0.0,"cholesterol":53.0,"chromium":0.0,"confidence":0.844831,"copper":0.13,"ediblePart":74.0,"fat":1.15,"fluorine":0.0,"foodId":"57da3a2177c86f66be2dab20","foodName":"乌鸡汤","gi":0.0,"glutamic":1530.5,"glycine":463.0,"heat":55,"heatKJ":230,"histidine":291.5,"iodine":0.0,"iron":1.15,"isoleucine":0.0,"leftCoordinate":0.4419,"leucine":0.0,"lysine":0.0,"manganese":0.03,"methionine":0.0,"mfaPercent":27.27,"moisture":36.95,"monounsaturatedFattyAcid":0.3,"pfaPercent":9.09,"phenylalanine":0.0,"phosphorus":105.0,"polyunsaturatedFattyAcid":0.1,"potassium":161.5,"proline":771.5,"protein":11.15,"recognitionFoodNum":0,"saturatedFattyAcid":0.65,"selenium":3.87,"serine":532.0,"sfaPercent":59.09,"sodium":32.0,"solkfloc":0.0,"soyIsoflavone":0.0,"threonine":0.0,"topCoordinate":0.4973,"totalFattyAcid":1.1,"tryptophan":140.0,"unit":"克","valine":362.0,"vitaminA":0.0,"vitaminB1":0.01,"vitaminB12":0.0,"vitaminB2":0.1,"vitaminB3":3.55,"vitaminB5":0.0,"vitaminB6":0.0,"vitaminB9":0.0,"vitaminC":0.0,"vitaminD":0.0,"vitaminE":0.89,"vitaminK":0.0,"zinc":0.8}],"retCode":"SUCCESS","retInfo":"处理成功","sn":"f2cb27e47ac111e8aa9bac1f6b22e430
     *       "} System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
     *       System.out.println(JsonUtil.toJson(response));
     * 
     *       }
     */

    /**
     * 一图多物食物识别Test : URL
     * 
     * 
     * @throws IOException
     * 
     * @Test public void imageFoodMultiRecognizeURLTest() throws IOException {
     * 
     *       HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
     *       "https://api2.hbox.jiankangyouyi.com");
     * 
     *       String foodImageUrl = "https://oieve67xn.qnssl.com/images/2/e62e0808a0004c1385bd806a89595051.jpeg";
     *       ImageFoodMultiRecognizeRequest request = new ImageFoodMultiRecognizeRequest();
     *       request.setFoodImageUrl(foodImageUrl); ImageFoodMultiRecognizeResponse response = client.execute(request);
     *       // response json ： // {"curTime":"2018-06-28 // 18:56:
     *       47","recognitionFoodList":[{"alanine":0.0,"arginine":0.0,"aspartic":0.0,"calcium":5.84,"carbohydrate":24.94,"carotene":0.0,"cholesterol":0.0,"chromium":0.0,"confidence":0.857318,"copper":0.05,"ediblePart":100.0,"fat":11.78,"fluorine":0.0,"foodId":"57b6bd3f3004d165422ad74b","foodName":"米饭","gi":0.0,"glutamic":0.0,"glycine":0.0,"heat":225,"heatKJ":941,"histidine":0.0,"iodine":0.0,"iron":1.05,"isoleucine":0.0,"leftCoordinate":0.407,"leucine":0.0,"lysine":0.0,"manganese":0.46,"methionine":0.0,"mfaPercent":45.07,"moisture":55.61,"monounsaturatedFattyAcid":0.84,"pfaPercent":41.19,"phenylalanine":0.0,"phosphorus":48.65,"polyunsaturatedFattyAcid":0.77,"potassium":23.59,"proline":0.0,"protein":4.63,"recognitionFoodNum":0,"saturatedFattyAcid":0.27,"selenium":0.31,"serine":0.0,"sfaPercent":14.36,"sodium":2.06,"solkfloc":0.24,"soyIsoflavone":0.0,"threonine":0.0,"topCoordinate":0.0898,"totalFattyAcid":1.87,"tryptophan":0.0,"unit":"克","valine":0.0,"vitaminA":0.0,"vitaminB1":0.06,"vitaminB12":0.0,"vitaminB2":0.02,"vitaminB3":1.49,"vitaminB5":0.0,"vitaminB6":0.0,"vitaminB9":0.0,"vitaminC":0.0,"vitaminD":0.0,"vitaminE":0.47,"vitaminK":0.0,"zinc":0.73},{"alanine":897.5,"arginine":758.0,"aspartic":922.5,"calcium":8.5,"carbohydrate":0.15,"carotene":0.0,"cholesterol":53.0,"chromium":0.0,"confidence":0.844831,"copper":0.13,"ediblePart":74.0,"fat":1.15,"fluorine":0.0,"foodId":"57da3a2177c86f66be2dab20","foodName":"乌鸡汤","gi":0.0,"glutamic":1530.5,"glycine":463.0,"heat":55,"heatKJ":230,"histidine":291.5,"iodine":0.0,"iron":1.15,"isoleucine":0.0,"leftCoordinate":0.4419,"leucine":0.0,"lysine":0.0,"manganese":0.03,"methionine":0.0,"mfaPercent":27.27,"moisture":36.95,"monounsaturatedFattyAcid":0.3,"pfaPercent":9.09,"phenylalanine":0.0,"phosphorus":105.0,"polyunsaturatedFattyAcid":0.1,"potassium":161.5,"proline":771.5,"protein":11.15,"recognitionFoodNum":0,"saturatedFattyAcid":0.65,"selenium":3.87,"serine":532.0,"sfaPercent":59.09,"sodium":32.0,"solkfloc":0.0,"soyIsoflavone":0.0,"threonine":0.0,"topCoordinate":0.4973,"totalFattyAcid":1.1,"tryptophan":140.0,"unit":"克","valine":362.0,"vitaminA":0.0,"vitaminB1":0.01,"vitaminB12":0.0,"vitaminB2":0.1,"vitaminB3":3.55,"vitaminB5":0.0,"vitaminB6":0.0,"vitaminB9":0.0,"vitaminC":0.0,"vitaminD":0.0,"vitaminE":0.89,"vitaminK":0.0,"zinc":0.8}],"retCode":"SUCCESS","retInfo":"处理成功","sn":"f2cb27e47ac111e8aa9bac1f6b22e430
     *       "} System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
     *       System.out.println(JsonUtil.toJson(response));
     * 
     *       }
     */

    /**
     * 一图一物食物识别Test : Base64
     * 
     * 
     * @throws IOException
     */
    @Test
    public void imageFoodSingleRecognizeBase64Test() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");

        String image =
            FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        // String image = FileUtils.readFileToString(new File("/Users/yangsongbo/Downloads/1.txt"),
        // "UTF-8");

        byte[] imageBys = Base64Util.decode(image);
        FileUtils.writeByteArrayToFile(new File("/Users/yangsongbo/Downloads/aaaaaa.jpg"), imageBys);
        ImageFoodSingleRecognizeRequest request = new ImageFoodSingleRecognizeRequest();
        request.setImage(image);
        ImageFoodSingleRecognizeResponse response = client.execute(request);
        // response json ：
        // {"curTime":"2018-06-28
        // 19:03:16","retCode":"SUCCESS","retInfo":"处理成功","sn":"db9c9ef87ac211e8aa9bac1f6b22e430","topFoodNutrientBeanList":[{"alanine":15.0,"arginine":10.44,"aspartic":23.89,"calcium":14.33,"carbohydrate":20.04,"carotene":894.44,"cholesterol":0.0,"chromium":0.0,"confidence":0.279938,"copper":0.05,"ediblePart":97.33,"fat":0.27,"fluorine":0.0,"foodId":"587344559679a828db5cae8f","foodName":"照烧鸡排饭","gi":0.0,"glutamic":35.0,"glycine":8.11,"heat":93,"heatKJ":389,"histidine":4.22,"iodine":0.0,"iron":1.1,"isoleucine":0.0,"leucine":0.0,"lysine":0.0,"manganese":0.42,"methionine":0.0,"mfaPercent":0.0,"moisture":76.96,"monounsaturatedFattyAcid":0.0,"pfaPercent":0.0,"phenylalanine":0.0,"phosphorus":50.11,"polyunsaturatedFattyAcid":0.0,"potassium":85.11,"proline":9.33,"protein":2.28,"saturatedFattyAcid":0.0,"selenium":0.97,"serine":11.56,"sfaPercent":0.0,"sodium":10.76,"solkfloc":0.62,"soyIsoflavone":0.0,"threonine":0.0,"totalFattyAcid":0.0,"tryptophan":4.0,"unit":"克","valine":12.78,"vitaminA":0.0,"vitaminB1":0.03,"vitaminB12":0.0,"vitaminB2":0.04,"vitaminB3":1.38,"vitaminB5":0.0,"vitaminB6":0.0,"vitaminB9":0.0,"vitaminC":10.33,"vitaminD":0.0,"vitaminE":0.05,"vitaminK":0.0,"zinc":0.69}]}
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 一图一物食物识别Test : URL
     * 
     * 
     * @throws IOException
     */
    @Test
    public void imageFoodSingleRecognizeURLTest() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");

        String foodImageUrl =
            "https://files.public.jianzhishidai.cn/images/2/3f2e9663a6de4ba8afad88b4a5ed10c3.jpg?hash=FtUd6_DTWkCFxhLZGYbti0ET7JkV&width=400&height=400&fsize=20759&scope=1";
        ImageFoodSingleRecognizeRequest request = new ImageFoodSingleRecognizeRequest();
        request.setFoodImageUrl(foodImageUrl);
        ImageFoodSingleRecognizeResponse response = client.execute(request);
        // response json ：
        // {"curTime":"2018-06-28
        // 19:05:05","retCode":"SUCCESS","retInfo":"处理成功","sn":"1c53db5a7ac311e8aa9bac1f6b22e430","topFoodNutrientBeanList":[{"alanine":15.0,"arginine":10.44,"aspartic":23.89,"calcium":14.33,"carbohydrate":20.04,"carotene":894.44,"cholesterol":0.0,"chromium":0.0,"confidence":0.279938,"copper":0.05,"ediblePart":97.33,"fat":0.27,"fluorine":0.0,"foodId":"587344559679a828db5cae8f","foodName":"照烧鸡排饭","gi":0.0,"glutamic":35.0,"glycine":8.11,"heat":93,"heatKJ":389,"histidine":4.22,"iodine":0.0,"iron":1.1,"isoleucine":0.0,"leucine":0.0,"lysine":0.0,"manganese":0.42,"methionine":0.0,"mfaPercent":0.0,"moisture":76.96,"monounsaturatedFattyAcid":0.0,"pfaPercent":0.0,"phenylalanine":0.0,"phosphorus":50.11,"polyunsaturatedFattyAcid":0.0,"potassium":85.11,"proline":9.33,"protein":2.28,"saturatedFattyAcid":0.0,"selenium":0.97,"serine":11.56,"sfaPercent":0.0,"sodium":10.76,"solkfloc":0.62,"soyIsoflavone":0.0,"threonine":0.0,"totalFattyAcid":0.0,"tryptophan":4.0,"unit":"克","valine":12.78,"vitaminA":0.0,"vitaminB1":0.03,"vitaminB12":0.0,"vitaminB2":0.04,"vitaminB3":1.38,"vitaminB5":0.0,"vitaminB6":0.0,"vitaminB9":0.0,"vitaminC":10.33,"vitaminD":0.0,"vitaminE":0.05,"vitaminK":0.0,"zinc":0.69}]}
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));

    }

    /**
     * 文具识别Test : Base64
     * 
     * 
     * @throws IOException
     * 
     * @Test public void imageStationeryRecognizeBase64Test() throws IOException {
     * 
     *       HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
     *       "https://api2.hbox.jiankangyouyi.com");
     * 
     *       String image = FileUtils.readFileToString(new File(DATA_PATH + "stationery_recognize_base64_image.txt"),
     *       "UTF-8"); ImageStationeryRecognizeRequest request = new ImageStationeryRecognizeRequest();
     *       request.setImage(image); ImageStationeryRecognizeResponse response = client.execute(request); // response
     *       json ： // {"confidence":0.993592,"curTime":"2018-06-28 //
     *       19:11:45","itemName":"笔","retCode":"SUCCESS","retInfo":"处理成功","sn":"0b5678a27ac411e8aa9bac1f6b22e430"}
     *       System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
     *       System.out.println(JsonUtil.toJson(response)); }
     */

    /**
     * 文具识别Test : Base64
     * 
     * 
     * @throws IOException
     * 
     * @Test public void imageStationeryRecognizeURLTest() throws IOException {
     * 
     *       HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
     *       "https://api2.hbox.jiankangyouyi.com");
     * 
     *       String officeImageUrl = "https://oieve67xn.qnssl.com/images/2/559bfa07ab6440459ebcde122c1f6038.jpeg";
     * 
     *       ImageStationeryRecognizeRequest request = new ImageStationeryRecognizeRequest();
     *       request.setOfficeImageUrl(officeImageUrl); ImageStationeryRecognizeResponse response =
     *       client.execute(request); // response json ： // {"confidence":0.993592,"curTime":"2018-06-28 //
     *       19:11:45","itemName":"笔","retCode":"SUCCESS","retInfo":"处理成功","sn":"0b5678a27ac411e8aa9bac1f6b22e430"}
     *       System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
     *       System.out.println(JsonUtil.toJson(response)); }
     */

    /**
     * 智能问答
     * 
     * 
     * @throws IOException
     */
    @Test
    public void qasQueryAnswerTest() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.jiankangyouyi.com");

        QasQueryAnswerRequest request = new QasQueryAnswerRequest();
        request.setQuestion("跑步可以减肥吗");
        QasQueryAnswerResponse response = client.execute(request);
        // response json ：
        // {"answer":"跑步能加速身体的新陈代谢，消耗多余的脂肪或碳水化合物，坚持跑步对减肥的作用很大。","curTime":"2018-06-28
        // 22:42:54","retCode":"SUCCESS","retInfo":"处理成功","sn":"89e2a1ba7ae111e8aa9bac1f6b22e430"}

        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 语音记录
     * 
     * 
     * @throws IOException
     */
    @Test
    public void recordLifestyle() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.jiankangyouyi.com");

        RecordLifestyleRequest request = new RecordLifestyleRequest();
        request.setMessage("我昨天午休了3个小时");
        RecordLifestyleResponse response = client.execute(request);
        // {"curTime":"2018-07-05
        // 16:55:50","result":[{"count":30,"intent":"RECORD_MEAL","itemName":"米饭","unit":"颗"},{"count":1,"intent":"RECORD_MEAL","itemName":"紫菜汤","unit":"碗"}],"retCode":"SUCCESS","sn":"5b3ddd165516106e19a8c4fa"}
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 查询食物列表
     * 
     * 
     * @throws IOException
     * 
     * @Test public void seachFoodList() throws IOException {
     * 
     *       HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
     *       "https://api.hbox.jiankangyouyi.com/ego-gw");
     * 
     *       SearchFoodListRequest request = new SearchFoodListRequest(); request.setFoodName("鸡蛋");
     *       request.setPageInfo(new PageInfo(1, 5));
     * 
     *       SearchFoodListResponse response = client.execute(request);
     *       System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
     *       System.out.println(JsonUtil.toJson(response)); }
     */

    /**
     * 查询食物详情
     * 
     * 
     * @throws IOException
     * 
     * @Test public void seachFoodDetail() throws IOException {
     * 
     *       HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
     *       "https://api.hbox.jiankangyouyi.com/ego-gw");
     * 
     *       SearchFoodDetailRequest request = new SearchFoodDetailRequest();
     *       request.setFoodId("57b6bd3f3004d165422ad7f4");
     * 
     *       SearchFoodDetailResponse response = client.execute(request);
     *       System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
     *       System.out.println(JsonUtil.toJson(response)); }
     */
    /**
     * 获取评测简介
     * 
     * 
     * @throws IOException
     */
    @Test
    public void loadEvaluationBrief() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        EvaluationBriefLoadRequest request = new EvaluationBriefLoadRequest();
        request.setEvaluationCode("GXZPC");

        EvaluationBriefLoadResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        // System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 获取评测内容
     * 
     * 
     * @throws IOException
     */
    @Test
    public void loadEvaluationContent() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        EvaluationUserInfoBean userInfo = new EvaluationUserInfoBean();
        userInfo.setBirthday("1988-11-26");
        userInfo.setGender("1");
        userInfo.setHeight("168");
        userInfo.setUserName("波波");
        userInfo.setWeight("70");

        EvaluationContentLoadRequest request = new EvaluationContentLoadRequest();
        request.setEvaluationCode("GXZPC");
        request.setUserInfo(userInfo);

        EvaluationContentLoadResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 保存评测数据
     * 
     * 
     * @throws IOException
     */
    @Test
    public void saveEvaluationData() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        EvaluationUserInfoBean userInfo = new EvaluationUserInfoBean();
        userInfo.setBirthday("1988-11-26");
        userInfo.setGender("1");
        userInfo.setHeight("168");
        userInfo.setUserName("波波");
        userInfo.setWeight("70");

        List<EvaluationUserOptionsBean> userOptions = new ArrayList<>();
        userOptions.add(new EvaluationUserOptionsBean("4", Arrays.asList("1")));
        userOptions.add(new EvaluationUserOptionsBean("6", Arrays.asList("1", "3")));
        userOptions.add(new EvaluationUserOptionsBean("7", Arrays.asList("1")));
        userOptions.add(new EvaluationUserOptionsBean("8", Arrays.asList("3")));
        userOptions.add(new EvaluationUserOptionsBean("9", Arrays.asList("3")));
        userOptions.add(new EvaluationUserOptionsBean("10", Arrays.asList("3")));
        userOptions.add(new EvaluationUserOptionsBean("11", Arrays.asList("1")));
        userOptions.add(new EvaluationUserOptionsBean("12", Arrays.asList("2")));
        userOptions.add(new EvaluationUserOptionsBean("13", Arrays.asList("4")));

        EvaluationDataSaveRequest request = new EvaluationDataSaveRequest();
        request.setQuesBankId("5b7e2546ae178f4a45f1fcb7");
        request.setUserInfo(userInfo);
        request.setEvaluationCode("GXZPC");
        request.setUserOptions(userOptions);

        EvaluationDataSaveResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        // System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 获取评测数据
     * 
     * 
     * @throws IOException
     */
    @Test
    public void loadEvaluationResult() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        EvaluationResultLoadRequest request = new EvaluationResultLoadRequest();
        request.setEvaluationId("5b7e5e6a14cced4a437bafdf");

        EvaluationResultLoadResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 健康人群食物文本查询
     * 
     * 
     * @throws IOException
     */
    @Test
    public void queryHealthyFoodByText() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        FoodTextQueryHealthyRequest request = new FoodTextQueryHealthyRequest();
        request.setText("苹果的热量是多少");
        request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
        request.setPageInfo(new PageInfo(1, 3));
        request.setCount(BigDecimal.valueOf(200));
        request.setAge(BigDecimal.valueOf(32));
        request.setBirthday(null);
        request.setGender("1");

        FoodTextSpeechQueryGeneralResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 亚健康人群食物文本查询
     * 
     * 
     * @throws IOException
     */
    @Test
    public void querySubHealthyFoodByText() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        FoodTextQuerySubHealthyRequest request = new FoodTextQuerySubHealthyRequest();
        request.setText("苹果的热量是多少");
        request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
        request.setPageInfo(new PageInfo(1, 3));
        request.setCount(BigDecimal.valueOf(200));
        request.setAge(BigDecimal.valueOf(32));
        request.setBirthday(null);
        request.setGender("1");

        FoodTextSpeechQueryGeneralResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 糖尿病人群食物文本查询
     * 
     * 
     * @throws IOException
     */
    @Test
    public void queryDiabetesFoodByText() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        FoodTextQueryDiabetesRequest request = new FoodTextQueryDiabetesRequest();
        request.setText("苹果的热量是多少");
        request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
        request.setPageInfo(new PageInfo(1, 3));
        request.setCount(BigDecimal.valueOf(200));
        request.setAge(BigDecimal.valueOf(32));
        request.setBirthday(null);
        request.setGender("1");

        FoodTextSpeechQueryGeneralResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 高血压人群食物文本查询
     * 
     * 
     * @throws IOException
     */
    @Test
    public void queryHypertensionFoodByText() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        FoodTextQueryHypertensionRequest request = new FoodTextQueryHypertensionRequest();
        request.setText("苹果的热量是多少");
        request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
        request.setPageInfo(new PageInfo(1, 3));
        request.setCount(BigDecimal.valueOf(200));
        request.setAge(BigDecimal.valueOf(32));
        request.setBirthday(null);
        request.setGender("1");

        FoodTextSpeechQueryGeneralResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 高血脂人群食物文本查询
     * 
     * 
     * @throws IOException
     */
    @Test
    public void queryHyperlipidemiaFoodByText() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        FoodTextQueryHyperlipidemiaRequest request = new FoodTextQueryHyperlipidemiaRequest();
        request.setText("苹果的热量是多少");
        request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
        request.setPageInfo(new PageInfo(1, 3));
        request.setCount(BigDecimal.valueOf(200));
        request.setAge(BigDecimal.valueOf(32));
        request.setBirthday(null);
        request.setGender("1");

        FoodTextSpeechQueryGeneralResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 孕产妇人群食物文本查询
     * 
     * 
     * @throws IOException
     */
    @Test
    public void queryMaternalFoodByText() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        FoodTextQueryMaternalRequest request = new FoodTextQueryMaternalRequest();
        request.setText("苹果的热量是多少");
        request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
        request.setPageInfo(new PageInfo(1, 3));
        request.setCount(BigDecimal.valueOf(200));
        request.setStage("1");

        FoodTextSpeechQueryGeneralResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 健康人群食物语音查询
     * 
     * 
     * @throws IOException
     * 
     */
    @Test
    public void queryHealthyFoodBySpeech() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        FoodSpeechQueryHealthyRequest request = new FoodSpeechQueryHealthyRequest();
        request.setFormat("amr");
        request.setRate(16000);
        request.setSpeech(Base64Util
            .encode(FileUtils.readFileToByteArray(new File("/Users/yangsongbo/Downloads/16k-23850 (1).amr"))));
        request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
        request.setPageInfo(new PageInfo(1, 2));
        request.setGender("1");
        request.setAge(BigDecimal.valueOf(32));

        FoodTextSpeechQueryGeneralResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        // System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 亚健康人群食物语音查询
     * 
     * 
     * @throws IOException
     * 
     */
    @Test
    public void querySubHealthyFoodBySpeech() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        FoodSpeechQuerySubHealthyRequest request = new FoodSpeechQuerySubHealthyRequest();
        request.setFormat("amr");
        request.setRate(16000);
        request.setSpeech(Base64Util
            .encode(FileUtils.readFileToByteArray(new File("/Users/yangsongbo/Downloads/16k-23850 (1).amr"))));
        request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
        request.setPageInfo(new PageInfo(1, 2));
        request.setGender("1");
        request.setAge(BigDecimal.valueOf(32));

        FoodTextSpeechQueryGeneralResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        // System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 糖尿病人群食物语音查询
     * 
     * 
     * @throws IOException
     * 
     */
    @Test
    public void queryDiabetesFoodBySpeech() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        FoodSpeechQueryDiabetesRequest request = new FoodSpeechQueryDiabetesRequest();
        request.setFormat("amr");
        request.setRate(16000);
        request.setSpeech(Base64Util
            .encode(FileUtils.readFileToByteArray(new File("/Users/yangsongbo/Downloads/16k-23850 (1).amr"))));
        request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
        request.setPageInfo(new PageInfo(1, 2));
        request.setGender("1");
        request.setAge(BigDecimal.valueOf(32));

        FoodTextSpeechQueryGeneralResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        // System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 高血压人群食物语音查询
     * 
     * 
     * @throws IOException
     * 
     */
    @Test
    public void queryHypertensionFoodBySpeech() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        FoodSpeechQueryHypertensionRequest request = new FoodSpeechQueryHypertensionRequest();
        request.setFormat("amr");
        request.setRate(16000);
        request.setSpeech(Base64Util
            .encode(FileUtils.readFileToByteArray(new File("/Users/yangsongbo/Downloads/16k-23850 (1).amr"))));
        request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
        request.setPageInfo(new PageInfo(1, 2));
        request.setGender("1");
        request.setAge(BigDecimal.valueOf(32));

        FoodTextSpeechQueryGeneralResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        // System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 高血脂人群食物语音查询
     * 
     * 
     * @throws IOException
     * 
     */
    @Test
    public void queryHyperlipidemiaFoodBySpeech() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        FoodSpeechQueryHyperlipidemiaRequest request = new FoodSpeechQueryHyperlipidemiaRequest();
        request.setFormat("amr");
        request.setRate(16000);
        request.setSpeech(Base64Util
            .encode(FileUtils.readFileToByteArray(new File("/Users/yangsongbo/Downloads/16k-23850 (1).amr"))));
        request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
        request.setPageInfo(new PageInfo(1, 2));
        request.setGender("1");
        request.setAge(BigDecimal.valueOf(32));

        FoodTextSpeechQueryGeneralResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        // System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 孕产妇人群食物语音查询
     * 
     * 
     * @throws IOException
     * 
     */
    @Test
    public void queryMaternalFoodBySpeech() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        FoodSpeechQueryMaternalRequest request = new FoodSpeechQueryMaternalRequest();
        request.setFormat("amr");
        request.setRate(16000);
        request.setSpeech(Base64Util
            .encode(FileUtils.readFileToByteArray(new File("/Users/yangsongbo/Downloads/16k-23850 (1).amr"))));
        request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
        request.setPageInfo(new PageInfo(1, 2));
        request.setStage("1");

        FoodTextSpeechQueryGeneralResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        // System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 健康人群食物图像查询
     * 
     * 
     * @throws IOException
     * 
     */
    @Test
    public void queryHealthyFoodByImage() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.jiankangyouyi.com/");

        String image =
            FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        FoodImageQueryHealthyRequest request = new FoodImageQueryHealthyRequest();
        request.setImage(image);
        request.setCount(BigDecimal.valueOf(100));
        request.setTop(2);
        request.setGender("1");
        request.setAge(BigDecimal.valueOf(32));

        FoodImageQueryGeneralResponse response = client.execute(request);
        // System.out.println("sss:" + JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 亚健康人群食物图像查询
     * 
     * 
     * @throws IOException
     * 
     */
    @Test
    public void querySubHealthyFoodByImage() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.jiankangyouyi.com/");

        String image =
            FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        FoodImageQuerySubHealthyRequest request = new FoodImageQuerySubHealthyRequest();
        request.setImage(image);
        request.setCount(BigDecimal.valueOf(100));
        request.setTop(2);
        request.setGender("1");
        request.setAge(BigDecimal.valueOf(32));

        FoodImageQueryGeneralResponse response = client.execute(request);
        System.out.println("sss:" + JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        // System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 糖尿病人群食物图像查询
     * 
     * 
     * @throws IOException
     * 
     */
    @Test
    public void queryDiabetesFoodByImage() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.jiankangyouyi.com/");

        String image =
            FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        FoodImageQueryDiabetesRequest request = new FoodImageQueryDiabetesRequest();
        request.setImage(image);
        request.setCount(BigDecimal.valueOf(100));
        request.setTop(2);
        request.setGender("1");
        request.setAge(BigDecimal.valueOf(32));

        FoodImageQueryGeneralResponse response = client.execute(request);
        System.out.println("sss:" + JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        // System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 高血压人群食物图像查询
     * 
     * 
     * @throws IOException
     * 
     */
    @Test
    public void queryHypertensionFoodByImage() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.jiankangyouyi.com/");

        String image =
            FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        FoodImageQueryHypertensionRequest request = new FoodImageQueryHypertensionRequest();
        request.setImage(image);
        request.setCount(BigDecimal.valueOf(100));
        request.setTop(2);
        request.setGender("1");
        request.setAge(BigDecimal.valueOf(32));

        FoodImageQueryGeneralResponse response = client.execute(request);
        System.out.println("sss:" + JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        // System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 高血脂人群食物图像查询
     * 
     * 
     * @throws IOException
     * 
     */
    @Test
    public void queryHyperlipidemiaFoodByImage() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.jiankangyouyi.com/");

        String image =
            FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        FoodImageQueryHyperlipidemiaRequest request = new FoodImageQueryHyperlipidemiaRequest();
        request.setImage(image);
        request.setCount(BigDecimal.valueOf(100));
        request.setTop(2);
        request.setGender("1");
        request.setAge(BigDecimal.valueOf(32));

        FoodImageQueryGeneralResponse response = client.execute(request);
        System.out.println("sss:" + JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        // System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 孕产妇人群食物图像查询
     * 
     * 
     * @throws IOException
     * 
     */
    @Test
    public void queryMaternalFoodByImage() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.jiankangyouyi.com/");

        String image =
            FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"), "UTF-8");

        FoodImageQueryMaternalRequest request = new FoodImageQueryMaternalRequest();
        request.setImage(image);
        request.setCount(BigDecimal.valueOf(100));
        request.setTop(2);
        request.setStage("1");

        FoodImageQueryGeneralResponse response = client.execute(request);
        System.out.println("sss:" + JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        // System.out.println(JsonUtil.toJson(response));
    }

    /**
     * 食物语音查询
     * 
     * 
     * @throws IOException
     * 
     * @Test public void queryFoodBySpeechJson() throws IOException {
     * 
     *       HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
     *       "https://api.hbox.jiankangyouyi.com/ego-gw");
     * 
     *       FoodSpeechQueryRequest request = new FoodSpeechQueryRequest(); request.setFormat("amr");
     *       request.setSpeech(Base64Util.encode (FileUtils.readFileToByteArray(new File(
     *       "/Users/yangsongbo/Downloads/16k-23850 (1).amr")))); request.setHighlight(new HighlightBean("<highlight>",
     *       "</highlight>")); request.setPageInfo(new PageInfo(1, 2));
     * 
     * 
     *       String result = client.execute(request); System.out.println(result); }
     */

    /**
     * 食物语音查询
     * 
     * 
     * @throws IOException
     * 
     * @Test public void estimateFoodCount() throws IOException {
     * 
     *       HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
     *       "https://api.hbox.jiankangyouyi.com/ego-gw");
     * 
     *       FoodCountEstimateRequest request = new FoodCountEstimateRequest();
     *       request.setFoodId("57b6bd3f3004d165422ad79a");
     * 
     *       FoodCountEstimateResponse response = client.execute(request);
     *       System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
     *       System.out.println(JsonUtil.toJson(response)); }
     */

    @Test
    public void queryExerciseByText() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        ExerciseTextQueryRequest request = new ExerciseTextQueryRequest();
        request.setText("跑步羽毛球");
        request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
        request.setPageInfo(new PageInfo(1, 2));
        request.setCount("18");
        request.setBodyData(new BodyDataBean("1", "75"));

        ExerciseQueryGeneralResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    @Test
    public void queryExerciseBySpeech() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        ExerciseSpeechQueryRequest request = new ExerciseSpeechQueryRequest();
        request.setFormat("amr");
        request.setRate(16000);
        request.setSpeech(Base64Util
            .encode(FileUtils.readFileToByteArray(new File("/Users/yangsongbo/Downloads/16k-23850 (1).amr"))));
        request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
        request.setPageInfo(new PageInfo(1, 2));

        ExerciseQueryGeneralResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    // @Test
    // public void analysisMeal() throws IOException {
    //
    // HealthAiClient client =
    // new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");
    //
    // List<MealDataBean> breakfast = new ArrayList<>();
    // breakfast.add(new MealDataBean("57b6cb003004c3a694946dbe", "178"));
    // breakfast.add(new MealDataBean("57b6cb003004c3a69494845c", "71"));
    // breakfast.add(new MealDataBean("57b6cb003004c3a694947ce8", "178"));
    // breakfast.add(new MealDataBean("57b6cb003004c3a694947437", "178"));
    //
    // List<MealDataBean> lunch = new ArrayList<>();
    // lunch.add(new MealDataBean("57da3d2677c8df901ec90e2e", "178"));
    // lunch.add(new MealDataBean("57b6cb003004c3a694945e6e", "297"));
    // lunch.add(new MealDataBean("57da3cdc77c8df901ec90da3", "119"));
    // lunch.add(new MealDataBean("57b6cb003004c3a694947de3", "178"));
    //
    // List<MealDataBean> supper = new ArrayList<>();
    // supper.add(new MealDataBean("57b6cb003004c3a6949473e1", "357"));
    // supper.add(new MealDataBean("57b6cb003004c3a694946e65", "119"));
    // supper.add(new MealDataBean("57b6cb003004c3a694945cfc", "178"));
    // supper.add(new MealDataBean("58eb4b0df32eaa580dec7296", "100"));
    //
    // AnalysisMealRequest request = new AnalysisMealRequest();
    // request.setBodyData(new BodyData("1", "1988-11-26", "1", "1"));
    // request.setBreakfast(breakfast);
    // request.setLunch(lunch);
    // request.setSupper(supper);
    //
    // AnalysisMealResponse response = client.execute(request);
    // System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
    // System.out.println(JsonUtil.toJson(response));
    // }

    @Test
    public void recommendFood() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");

        FoodRecommendRequest request = new FoodRecommendRequest();
        request.setAge(30);
        request.setGender("2");
        request.setHeight(167);
        request.setWeight(new BigDecimal("65"));

        FoodRecommendResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    @Test
    public void recommendFoodChangement() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");
        List<RecommendFoodBean> foodList = new ArrayList<>();
        foodList.add(new RecommendFoodBean("1", "五谷麦片", 50, "g", 0));
        foodList.add(new RecommendFoodBean("2", "筱麦面", 50, "g", 0));
        foodList.add(new RecommendFoodBean("3", "红心甘薯", 50, "g", 0));
        foodList.add(new RecommendFoodBean("4", "鸽子肉", 40, "g", 0));
        foodList.add(new RecommendFoodBean("5", "黄螺", 40, "g", 0));
        foodList.add(new RecommendFoodBean("6", "鹌鹑蛋", 60, "g", 0));
        foodList.add(new RecommendFoodBean("7", "酸白菜", 80, "g", 0));
        foodList.add(new RecommendFoodBean("8", "包心芥菜", 70, "g", 0));
        foodList.add(new RecommendFoodBean("9", "青萝卜", 50, "g", 0));
        foodList.add(new RecommendFoodBean("10", "豇豆", 50, "g", 1));
        foodList.add(new RecommendFoodBean("11", "鸡腿菇", 50, "g", 0));
        foodList.add(new RecommendFoodBean("12", "巨峰葡萄", 130, "g", 0));
        foodList.add(new RecommendFoodBean("13", "黄元帅苹果", 100, "g", 0));
        foodList.add(new RecommendFoodBean("14", "芡实米(鲜)", 30, "g", 0));
        foodList.add(new RecommendFoodBean("15", "脱脂牛奶", 300, "ml", 0));
        foodList.add(new RecommendFoodBean("16", "花生油", 30, "ml", 0));

        FoodRecommendChangementRequest request = new FoodRecommendChangementRequest();
        request.setAge(30);
        request.setGender("2");
        request.setHeight(167);
        request.setWeight(new BigDecimal("65"));
        request.setFoodList(foodList);

        FoodRecommendChangementResponse response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    @Test
    public void foodVolumeRecognitionBase64() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");

        List<String> imageList = new ArrayList<>();
        imageList.add(
            Base64Util.encode(FileUtils.readFileToByteArray(new File("/Users/yangsongbo/Downloads/食物三维重建-1.jpeg"))));
        imageList.add(
            Base64Util.encode(FileUtils.readFileToByteArray(new File("/Users/yangsongbo/Downloads/食物三维重建-2.jpeg"))));

        FoodVolumeRecognitionRequest request = new FoodVolumeRecognitionRequest();
        request.setImageType(2);
        request.setImageList(imageList);

        FoodVolumeRecognitionResponse response = client.execute(request);

        // System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    @Test
    public void foodVolumeRecognitionURL() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");

        List<String> imageList = new ArrayList<>();
        imageList.add("https://files.jiankangyouyi.com/apple279701849_1.jpg");
        imageList.add("https://files.jiankangyouyi.com/apple279701849_2.jpg");

        FoodVolumeRecognitionRequest request = new FoodVolumeRecognitionRequest();
        request.setImageType(1);
        request.setImageList(imageList);

        FoodVolumeRecognitionResponse response = client.execute(request);

        // System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    @Test
    public void bodyThreeDimensionalBase64() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");

        List<String> imageList = new ArrayList<>();
        imageList.add(Base64Util
            .encode(FileUtils.readFileToByteArray(new File("/Users/yangsongbo/Downloads/boby3424242_zhengmian.jpg"))));
        imageList.add(Base64Util
            .encode(FileUtils.readFileToByteArray(new File("/Users/yangsongbo/Downloads/boby3424242_cemian.jpg"))));

        BodyThreeDimensionalRequest request = new BodyThreeDimensionalRequest();
        request.setImageList(imageList);
        request.setHeight(BigDecimal.valueOf(172));
        request.setGender(1);
        request.setImageType(2);

        BodyThreeDimensionalResponse response = client.execute(request);
        // String result = client.execute(request);
        // System.out.println(result);
        // System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    @Test
    public void bodyThreeDimensionalURL() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");

        List<String> imageList = new ArrayList<>();
        imageList.add("https://files.jiankangyouyi.com/boby3424242_zhengmian.jpg");
        imageList.add("https://files.jiankangyouyi.com/boby3424242_cemian.jpg");

        BodyThreeDimensionalRequest request = new BodyThreeDimensionalRequest();
        request.setImageList(imageList);
        request.setHeight(BigDecimal.valueOf(172));
        request.setGender(1);
        request.setImageType(1);

        BodyThreeDimensionalResponse response = client.execute(request);
        // String result = client.execute(request);
        // System.out.println(result);
        // System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));

    }

    @Test
    public void semanticRecordFoodAnalysis() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        Map<String, String> reqData = new HashMap<>();
        reqData.put("text", "我早上吃了一个包子，一杯豆浆");

        String result = client.executeReturnJson(JsonUtil.toJson(reqData), "/v2/semantic/record/food/analysis.do");

        System.out.println(result);
        System.out.println(JsonUtil.formatJson(result));

    }

    @Test
    public void queryFoodByFoodIdsFoodName() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        Map<String, Object> reqData = new HashMap<>();
        // reqData.put("foodIds",
        // Arrays.asList("57b6cb003004c3a694945dee","57b6cb003004c3a6949485ee"));
        reqData.put("foodName", "火龙果");

        String result = client.executeReturnJson(JsonUtil.toJson(reqData), "/v2/query/foodids_foodname/food/list.do");
        System.out.println(JsonUtil.formatJson(result));
    }

    @Test
    public void saveRecordFood() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        Map<String, Object> record1 = new HashMap<>();
        record1.put("recordFrom", "3");
        record1.put("mealType", "1");
        record1.put("foodType", "1");
        record1.put("foodId", "5b431137ae178f4a45f1de54");
        record1.put("count", 1);
        record1.put("kilocalorie", 210);
        record1.put("unit", "个");
        record1.put("imageRecognitionSn", null);
        record1.put("semanticAnalysisSn", "5be98e6f14cced2a3086dbbd");

        Map<String, Object> record2 = new HashMap<>();
        record2.put("recordFrom", "3");
        record2.put("mealType", "1");
        record2.put("foodType", "1");
        record2.put("foodId", "57b6bd3f3004d165422af1cf");
        record2.put("count", 1);
        record2.put("kilocalorie", 48);
        record2.put("unit", "杯");
        record2.put("imageRecognitionSn", null);
        record2.put("semanticAnalysisSn", "5be98e6f14cced2a3086dbbd");

        List<Map<String, Object>> recordList = new ArrayList<>();
        recordList.add(record1);
        recordList.add(record2);

        Map<String, Object> reqData = new HashMap<>();
        reqData.put("recordDate", DateUtil.getCurDateStr("yyyyMMdd"));
        reqData.put("userId", "20150208010000008441");
        reqData.put("recordList", recordList);

        String result = client.executeReturnJson(JsonUtil.toJson(reqData), "/v2/record/food/save.do");
        System.out.println(JsonUtil.formatJson(result));
    }

    @Test
    public void saveCustomFood() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        // byte[] imageBytes = FileUtils.readFileToByteArray(new File("/Users/yangsongbo/Downloads/aaaaaaa.jpg"));

        byte[] imageBytes =
            FileUtils.readFileToByteArray(new File("/Users/yangsongbo/Downloads/005LUq26jw1eyfcnmyfmwj30ci08cgn7.jpg"));
        String image = Base64Util.encode(imageBytes);

        Map<String, Object> reqData = new HashMap<>();
        reqData.put("userId", "20150208010000008441");
        reqData.put("foodName", "妈妈炖的牛肉");
        reqData.put("count", "500");
        reqData.put("unit", "克");
        reqData.put("kilocalorie", "1450");
        reqData.put("image", image);

        System.out.println("image length : " + imageBytes.length);

        String result = client.executeReturnJson(JsonUtil.toJson(reqData), "/v2/record/custom_food/save.do");
        System.out.println(JsonUtil.formatJson(result));
    }

    @Test
    public void findFoodMetrologyDetail() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        Map<String, Object> reqData = new HashMap<>();
        reqData.put("foodId", "57b6bd3f3004d165422ad79a");

        String result = client.executeReturnJson(JsonUtil.toJson(reqData), "/v2/record/food/metrology/detail.do");
        System.out.println(JsonUtil.formatJson(result));
    }

    @Test
    public void findFoodMetrologyTypeList() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        Map<String, Object> reqData = new HashMap<>();

        String result = client.executeReturnJson(null, "/v2/record/food/metrology/type/list.do");
        System.out.println(JsonUtil.formatJson(result));
    }

    @Test
    public void semanticRecordExerciseAnalysis() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        Map<String, Object> reqData = new HashMap<>();
        reqData.put("text", "我刚才跑了30分钟");
        reqData.put("gender", "1");
        reqData.put("weight", 76);

        String result = client.executeReturnJson(JsonUtil.toJson(reqData), "/v2/semantic/record/exercise/analysis.do");
        System.out.println(JsonUtil.formatJson(result));
    }

    @Test
    public void saveCustomExercise() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        byte[] imageBytes =
            FileUtils.readFileToByteArray(new File("/Users/yangsongbo/Downloads/005LUq26jw1eyfcnmyfmwj30ci08cgn7.jpg"));
        String image = Base64Util.encode(imageBytes);

        Map<String, Object> reqData = new HashMap<>();
        reqData.put("userId", "20150208010000008441");
        reqData.put("exerciseName", "打出溜滑");
        reqData.put("count", 15);
        reqData.put("unit", "米");
        reqData.put("kilocalorie", 15);
        reqData.put("image", image);

        String result = client.executeReturnJson(JsonUtil.toJson(reqData), "/v2/record/custom_exercise/save.do");
        System.out.println(JsonUtil.formatJson(result));
    }

    @Test
    public void saveRecordExercise() throws IOException {

        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
            "https://api.hbox.jiankangyouyi.com/ego-gw");

        // 5beaa19d14cced6e342c83b0 打出溜滑
        // 5beaa28414cced6e342c83b1 sn
        Map<String, Object> record1 = new HashMap<>();
        record1.put("exerciseType", "1"); // 1 系统运动 2 自定义运动
        record1.put("exerciseId", "58abe85f0cad1532604c23a9");
        record1.put("count", 15);
        record1.put("kilocalorie", 205);
        record1.put("unit", "分钟");
        record1.put("recordFrom", "3"); // 2 文字录入 2 语音录入
        record1.put("semanticAnalysisSn", "5beaa28414cced6e342c83b1");

        Map<String, Object> record2 = new HashMap<>();
        record2.put("exerciseType", "1"); // 1 系统运动 2 自定义运动
        record2.put("exerciseId", "5beaa19d14cced6e342c83b0");
        record2.put("count", 30);
        record2.put("kilocalorie", 30);
        record2.put("unit", "米");
        record2.put("recordFrom", "3"); // 2 文字录入 2 语音录入
        record2.put("semanticAnalysisSn", "5beaa28414cced6e342c83b1");

        List<Map<String, Object>> recordList = new ArrayList<>();
        recordList.add(record1);
        recordList.add(record2);

        Map<String, Object> reqData = new HashMap<>();
        reqData.put("recordDate", api.DateUtil.getCurDateStr("yyyyMMdd"));
        reqData.put("userId", "20150208010000008441");
        reqData.put("recordList", recordList);

        String result = client.executeReturnJson(JsonUtil.toJson(reqData), "/v2/record/exercise/save.do");
        System.out.println(JsonUtil.formatJson(result));
    }

    @Test
    public void test() throws IOException {

        String url = "https://apps.hbox.jiankangyouyi.com/jkyy-apps/h5/food/matching/diabetic/life/advice/query.do";
        Map<String, String> params = new HashMap<>();
        params.put("sex", "1");
        params.put("weight", "75");
        params.put("height", "173");
        params.put("age", "34");
        params.put("userActivityLevel", "0");
        params.put("bloodGlucose", "10.3");
        params.put("systolicPressure", "120");
        params.put("diastolicPressure", "80");
        params.put("user", "yangsongbo");

        String result = HttpClientUtil.post(url, JsonUtil.toJson(params), HttpClientUtil.CONTENT_TYPE_JSON);
        System.out.println(result);
    }

    @Test
    public void analysisHealthyMeal() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        List<MealDataBean> breakfast = new ArrayList<>();
        breakfast.add(new MealDataBean("57b6cb003004c3a694946dbe", "178"));
        breakfast.add(new MealDataBean("57b6cb003004c3a69494845c", "71"));
        breakfast.add(new MealDataBean("57b6cb003004c3a694947ce8", "178"));
        breakfast.add(new MealDataBean("57b6cb003004c3a694947437", "178"));

        List<MealDataBean> lunch = new ArrayList<>();
        lunch.add(new MealDataBean("57da3d2677c8df901ec90e2e", "178"));
        lunch.add(new MealDataBean("57b6cb003004c3a694945e6e", "297"));
        lunch.add(new MealDataBean("57da3cdc77c8df901ec90da3", "119"));
        lunch.add(new MealDataBean("57b6cb003004c3a694947de3", "178"));

        List<MealDataBean> supper = new ArrayList<>();
        supper.add(new MealDataBean("57b6cb003004c3a6949473e1", "357"));
        supper.add(new MealDataBean("57b6cb003004c3a694946e65", "119"));
        supper.add(new MealDataBean("57b6cb003004c3a694945cfc", "178"));
        supper.add(new MealDataBean("58eb4b0df32eaa580dec7296", "100"));

        AnalysisHealthyMealReqData request = new AnalysisHealthyMealReqData();
        request.setBreakfast(breakfast);
        request.setLunch(lunch);
        request.setSupper(supper);
        request.setAge("31");
        request.setGender("1");

        AnalysisMealGeneralResData response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    @Test
    public void analysisSubHealthyMeal() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        List<MealDataBean> breakfast = new ArrayList<>();
        breakfast.add(new MealDataBean("57b6cb003004c3a694946dbe", "178"));
        breakfast.add(new MealDataBean("57b6cb003004c3a69494845c", "71"));
        breakfast.add(new MealDataBean("57b6cb003004c3a694947ce8", "178"));
        breakfast.add(new MealDataBean("57b6cb003004c3a694947437", "178"));

        List<MealDataBean> lunch = new ArrayList<>();
        lunch.add(new MealDataBean("57da3d2677c8df901ec90e2e", "178"));
        lunch.add(new MealDataBean("57b6cb003004c3a694945e6e", "297"));
        lunch.add(new MealDataBean("57da3cdc77c8df901ec90da3", "119"));
        lunch.add(new MealDataBean("57b6cb003004c3a694947de3", "178"));

        List<MealDataBean> supper = new ArrayList<>();
        supper.add(new MealDataBean("57b6cb003004c3a6949473e1", "357"));
        supper.add(new MealDataBean("57b6cb003004c3a694946e65", "119"));
        supper.add(new MealDataBean("57b6cb003004c3a694945cfc", "178"));
        supper.add(new MealDataBean("58eb4b0df32eaa580dec7296", "100"));

        AnalysisSubHealthyMealReqData request = new AnalysisSubHealthyMealReqData();
        request.setBreakfast(breakfast);
        request.setLunch(lunch);
        request.setSupper(supper);
        request.setAge("31");
        request.setGender("1");

        AnalysisMealGeneralResData response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    @Test
    public void analysisDiabetesMeal() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        List<MealDataBean> breakfast = new ArrayList<>();
        breakfast.add(new MealDataBean("57b6cb003004c3a694946dbe", "178"));
        breakfast.add(new MealDataBean("57b6cb003004c3a69494845c", "71"));
        breakfast.add(new MealDataBean("57b6cb003004c3a694947ce8", "178"));
        breakfast.add(new MealDataBean("57b6cb003004c3a694947437", "178"));

        List<MealDataBean> lunch = new ArrayList<>();
        lunch.add(new MealDataBean("57da3d2677c8df901ec90e2e", "178"));
        lunch.add(new MealDataBean("57b6cb003004c3a694945e6e", "297"));
        lunch.add(new MealDataBean("57da3cdc77c8df901ec90da3", "119"));
        lunch.add(new MealDataBean("57b6cb003004c3a694947de3", "178"));

        List<MealDataBean> supper = new ArrayList<>();
        supper.add(new MealDataBean("57b6cb003004c3a6949473e1", "357"));
        supper.add(new MealDataBean("57b6cb003004c3a694946e65", "119"));
        supper.add(new MealDataBean("57b6cb003004c3a694945cfc", "178"));
        supper.add(new MealDataBean("58eb4b0df32eaa580dec7296", "100"));

        AnalysisDiabetesMealReqData request = new AnalysisDiabetesMealReqData();
        request.setBreakfast(breakfast);
        request.setLunch(lunch);
        request.setSupper(supper);
        request.setAge("31");
        request.setGender("1");

        AnalysisMealGeneralResData response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    @Test
    public void analysisHypertensionMeal() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        List<MealDataBean> breakfast = new ArrayList<>();
        breakfast.add(new MealDataBean("57b6cb003004c3a694946dbe", "178"));
        breakfast.add(new MealDataBean("57b6cb003004c3a69494845c", "71"));
        breakfast.add(new MealDataBean("57b6cb003004c3a694947ce8", "178"));
        breakfast.add(new MealDataBean("57b6cb003004c3a694947437", "178"));

        List<MealDataBean> lunch = new ArrayList<>();
        lunch.add(new MealDataBean("57da3d2677c8df901ec90e2e", "178"));
        lunch.add(new MealDataBean("57b6cb003004c3a694945e6e", "297"));
        lunch.add(new MealDataBean("57da3cdc77c8df901ec90da3", "119"));
        lunch.add(new MealDataBean("57b6cb003004c3a694947de3", "178"));

        List<MealDataBean> supper = new ArrayList<>();
        supper.add(new MealDataBean("57b6cb003004c3a6949473e1", "357"));
        supper.add(new MealDataBean("57b6cb003004c3a694946e65", "119"));
        supper.add(new MealDataBean("57b6cb003004c3a694945cfc", "178"));
        supper.add(new MealDataBean("58eb4b0df32eaa580dec7296", "100"));

        AnalysisHypertensionMealReqData request = new AnalysisHypertensionMealReqData();
        request.setBreakfast(breakfast);
        request.setLunch(lunch);
        request.setSupper(supper);
        request.setAge("31");
        request.setGender("1");

        AnalysisMealGeneralResData response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    @Test
    public void analysisHyperlipidemiaMeal() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        List<MealDataBean> breakfast = new ArrayList<>();
        breakfast.add(new MealDataBean("57b6cb003004c3a694946dbe", "178"));
        breakfast.add(new MealDataBean("57b6cb003004c3a69494845c", "71"));
        breakfast.add(new MealDataBean("57b6cb003004c3a694947ce8", "178"));
        breakfast.add(new MealDataBean("57b6cb003004c3a694947437", "178"));

        List<MealDataBean> lunch = new ArrayList<>();
        lunch.add(new MealDataBean("57da3d2677c8df901ec90e2e", "178"));
        lunch.add(new MealDataBean("57b6cb003004c3a694945e6e", "297"));
        lunch.add(new MealDataBean("57da3cdc77c8df901ec90da3", "119"));
        lunch.add(new MealDataBean("57b6cb003004c3a694947de3", "178"));

        List<MealDataBean> supper = new ArrayList<>();
        supper.add(new MealDataBean("57b6cb003004c3a6949473e1", "357"));
        supper.add(new MealDataBean("57b6cb003004c3a694946e65", "119"));
        supper.add(new MealDataBean("57b6cb003004c3a694945cfc", "178"));
        supper.add(new MealDataBean("58eb4b0df32eaa580dec7296", "100"));

        AnalysisHyperlipidemiaMealReqData request = new AnalysisHyperlipidemiaMealReqData();
        request.setBreakfast(breakfast);
        request.setLunch(lunch);
        request.setSupper(supper);
        request.setAge("31");
        request.setGender("1");

        AnalysisMealGeneralResData response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }

    @Test
    public void analysisMaternalMeal() throws IOException {

        HealthAiClient client =
            new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api.jiankangyouyi.com/ego-gw");

        List<MealDataBean> breakfast = new ArrayList<>();
        breakfast.add(new MealDataBean("57b6cb003004c3a694946dbe", "178"));
        breakfast.add(new MealDataBean("57b6cb003004c3a69494845c", "71"));
        breakfast.add(new MealDataBean("57b6cb003004c3a694947ce8", "178"));
        breakfast.add(new MealDataBean("57b6cb003004c3a694947437", "178"));

        List<MealDataBean> lunch = new ArrayList<>();
        lunch.add(new MealDataBean("57da3d2677c8df901ec90e2e", "178"));
        lunch.add(new MealDataBean("57b6cb003004c3a694945e6e", "297"));
        lunch.add(new MealDataBean("57da3cdc77c8df901ec90da3", "119"));
        lunch.add(new MealDataBean("57b6cb003004c3a694947de3", "178"));

        List<MealDataBean> supper = new ArrayList<>();
        supper.add(new MealDataBean("57b6cb003004c3a6949473e1", "357"));
        supper.add(new MealDataBean("57b6cb003004c3a694946e65", "119"));
        supper.add(new MealDataBean("57b6cb003004c3a694945cfc", "178"));
        supper.add(new MealDataBean("58eb4b0df32eaa580dec7296", "100"));

        AnalysisMaternalMealReqData request = new AnalysisMaternalMealReqData();
        request.setBreakfast(breakfast);
        request.setLunch(lunch);
        request.setSupper(supper);
        request.setStage("1");

        AnalysisMealGeneralResData response = client.execute(request);
        System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
        System.out.println(JsonUtil.toJson(response));
    }
}
