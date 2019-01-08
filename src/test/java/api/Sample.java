package api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jiankangyouyi.health.ai.api.DefaultHealthAiClient;
import com.jiankangyouyi.health.ai.api.DefaultHealthAiClient.Version;
import com.jiankangyouyi.health.ai.api.HealthAiClient;
import com.jiankangyouyi.health.ai.api.bean.analysis.MealDataBean;
import com.jiankangyouyi.health.ai.api.request.analysis.AnalysisMaternalMealReqData;
import com.jiankangyouyi.health.ai.api.response.analysis.AnalysisMealGeneralResData;
import com.jiankangyouyi.health.ai.api.util.JsonUtil;

public class Sample {

    private static final String APPID = "你的appId";
    private static final String PRIVATE_KEY = "你的私钥";
    private static final Version VERSION = Version.VERSION_2_0;
    private static final String URL = "https://api.jiankangyouyi.com/ego-gw";

    public static void main(String[] args) throws IOException {
        // 初始化client
        HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);

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

        // 根据接口文档构建Request
        AnalysisMaternalMealReqData request = new AnalysisMaternalMealReqData();
        // 早餐数据
        request.setBreakfast(breakfast);
        // 午餐数据
        request.setLunch(lunch);
        // 晚餐数据
        request.setSupper(supper);
        // 1 <孕早期(孕第1周到13周末期间)> 2 <孕中期(孕14周到孕27周末期间)> 3 <孕晚期(孕28周后)> 4 <哺乳期>
        request.setStage("1");

        // 发起请求，得到返回结果
        AnalysisMealGeneralResData response = client.execute(request);
        System.out.println(JsonUtil.toJson(response, true));
    }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request
    // FoodCountEstimateRequest request = new FoodCountEstimateRequest();
    // request.setFoodId("57b6bd3f3004d165422ad79a");
    //
    // // 发起请求，得到返回结果
    // FoodCountEstimateResponse response = client.execute(request);
    //
    // System.out.println(JsonUtil.toJson(response, true));
    // }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request
    // FoodTextQueryRequest request = new FoodTextQueryRequest();
    // request.setText("苹果的热量是多少");
    // request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
    // request.setPageInfo(new PageInfo(1, 3));
    // request.setCount("230");
    //
    // // 发起请求，得到返回结果
    // FoodQueryGeneralResponse response = client.execute(request);
    //
    // System.out.println(JsonUtil.toJson(response, true));
    // }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request
    // FoodSpeechQueryRequest request = new FoodSpeechQueryRequest();
    // request.setFormat("amr");
    // request.setSpeech("Base64 语音数据");
    // request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
    // request.setPageInfo(new PageInfo(1, 2));
    //
    // // 发起请求，得到返回结果
    // FoodQueryGeneralResponse response = client.execute(request);
    //
    // System.out.println(JsonUtil.toJson(response, true));
    // }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request
    // ExerciseSpeechQueryRequest request = new ExerciseSpeechQueryRequest();
    // request.setFormat("amr");
    // request.setSpeech("Base64 语音数据");
    // request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
    // request.setPageInfo(new PageInfo(1, 2));
    //
    // // 发起请求，得到返回结果
    // ExerciseQueryGeneralResponse response = client.execute(request);
    //
    // System.out.println(JsonUtil.toJson(response, true));
    // }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request
    // ExerciseTextQueryRequest request = new ExerciseTextQueryRequest();
    // request.setText("跑步羽毛球");
    // request.setHighlight(new HighlightBean("<highlight>", "</highlight>"));
    // request.setPageInfo(new PageInfo(1, 2));
    // request.setCount("18");
    // request.setBodyData(new BodyDataBean("1", "75"));
    //
    // // 发起请求，得到返回结果
    // ExerciseQueryGeneralResponse response = client.execute(request);
    //
    // System.out.println(JsonUtil.toJson(response, true));
    // }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request
    // DialogRecordRequest request = new DialogRecordRequest();
    // request.setText("我晚上跑步35分钟，然后喝了一罐可乐");
    //
    // // 发起请求，得到返回结果
    // DialogRecordResponse response = client.execute(request);
    //
    // System.out.println(JsonUtil.toJson(response, true));
    // }
    //

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request
    // QasQueryAnswerRequest request = new QasQueryAnswerRequest();
    // request.setQuestion("跑步可以减肥吗");
    //
    // // 发起请求，得到返回结果
    // QasQueryAnswerResponse response = client.execute(request);
    //
    // System.out.println(JsonUtil.toJson(response, true));
    // }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request
    // List<RecommendFoodBean> foodList = new ArrayList<>();
    // foodList.add(new RecommendFoodBean("1", "薏米", 50, "g", 0));
    // foodList.add(new RecommendFoodBean("2", "锅贴", 50, "g", 0));
    // foodList.add(new RecommendFoodBean("3", "红薯", 50, "g", 0));
    // foodList.add(new RecommendFoodBean("4", "鸡胸肉(生)", 40, "g", 0));
    // foodList.add(new RecommendFoodBean("5", "墨鱼丸", 40, "g", 0));
    // foodList.add(new RecommendFoodBean("6", "鹅蛋", 60, "g", 0));
    // foodList.add(new RecommendFoodBean("7", "紫甘蓝", 80, "g", 0));
    // foodList.add(new RecommendFoodBean("8", "油菜", 70, "g", 0));
    // foodList.add(new RecommendFoodBean("9", "西红柿", 50, "g", 0));
    // foodList.add(new RecommendFoodBean("10", "猴头菇", 50, "g", 1));
    // foodList.add(new RecommendFoodBean("11", "胡萝卜", 50, "g", 0));
    // foodList.add(new RecommendFoodBean("12", "荔枝", 130, "g", 0));
    // foodList.add(new RecommendFoodBean("13", "苹果", 100, "g", 0));
    // foodList.add(new RecommendFoodBean("14", "杏仁", 30, "g", 0));
    // foodList.add(new RecommendFoodBean("15", "牛奶", 300, "ml", 0));
    // foodList.add(new RecommendFoodBean("16", "橄榄油", 30, "ml", 0));
    //
    // FoodRecommendChangementRequest request = new FoodRecommendChangementRequest();
    // request.setAge(30);
    // request.setGender("2");
    // request.setHeight(167);
    // request.setWeight(new BigDecimal("65"));
    // request.setFoodList(foodList);
    //
    // // 发起请求，得到返回结果
    // FoodRecommendChangementResponse response = client.execute(request);
    //
    // System.out.println(JsonUtil.toJson(response, true));
    // }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request
    // List<String> foodList = Arrays.asList
    // ("薏米","锅贴","红薯","鸡胸肉(生)","墨鱼丸","鹅蛋",
    // "紫甘蓝","油菜","西红柿","猴头菇","胡萝卜","荔枝","苹果","杏仁"
    // ,"牛奶","橄榄油","全麦面条(干)","青豆","红心甘薯");
    //
    // FridgeFoodRecommendRequest request = new FridgeFoodRecommendRequest();
    // request.setAge(30);
    // request.setGender("2");
    // request.setHeight(167);
    // request.setWeight(new BigDecimal("65"));
    // request.setFoodList(foodList);
    //
    // // 发起请求，得到返回结果
    // FridgeFoodRecommendResponse response = client.execute(request);
    //
    // System.out.println(JsonUtil.toJson(response, true));
    // }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request
    // FoodRecommendRequest request = new FoodRecommendRequest();
    // request.setAge(30);
    // request.setGender("2");
    // request.setHeight(167);
    // request.setWeight(new BigDecimal("65"));
    //
    // // 发起请求，得到返回结果
    // FoodRecommendResponse response = client.execute(request);
    // System.out.println(JsonUtil.toJson(response, true));
    // }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request，image和emotionImageUrl参数二选一
    // ImageEmotionRecognizeRequest request = new ImageEmotionRecognizeRequest();
    // request.setImage("图片的Base64编码");
    // request.setEmotionImageUrl("图片的URL");
    //
    // // 发起请求，得到返回结果
    // ImageEmotionRecognizeResponse response = client.execute(request);
    // System.out.println(JsonUtil.toJson(response, true));
    // }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request，image和foodImageUrl参数二选一
    // ImageFoodMultiRecognizeRequest request = new ImageFoodMultiRecognizeRequest();
    // request.setImage("图片Base64编码");
    // request.setFoodImageUrl("图片链接");
    // request.setImageWidth(200); //指定返回的食物图片宽度。
    //
    // // 发起请求，得到返回结果
    // ImageFoodMultiRecognizeResponse response = client.execute(request);
    // System.out.println(JsonUtil.toJson(response, true));
    // }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request，image和foodImageUrl参数二选一
    // ImageFoodSingleRecognizeRequest request = new ImageFoodSingleRecognizeRequest();
    // request.setImage("图片Base64编码");
    // request.setFoodImageUrl("图片链接");
    // request.setImageWidth(200); //指定返回的食物图片宽度。
    // request.setTop(10); //指定返回的数据条数
    //
    // // 发起请求，得到返回结果
    // ImageFoodSingleRecognizeResponse response = client.execute(request);
    // System.out.println(JsonUtil.toJson(response, true));
    // }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request
    // SportVoiceQueryRequest request = new SportVoiceQueryRequest();
    // request.setSportVoiceType("1");
    //
    // // 发起请求，得到返回结果
    // SportVoiceQueryResponse response = client.execute(request);
    // System.out.println(JsonUtil.toJson(response, true));
    // }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request
    // SportSubjectQueryRequest request = new SportSubjectQueryRequest();
    // request.setCourseId("5926afec48fb60380a0706a8");
    // request.setGender("1");
    // request.setWeight(new BigDecimal("74.3"));
    //
    // // 发起请求，得到返回结果
    // SportSubjectQueryResponse response = client.execute(request);
    // System.out.println(JsonUtil.toJson(response, true));
    // }

    // public static void main(String[] args) {
    // // 初始化client
    // HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, VERSION, URL);
    //
    // // 根据接口文档构建Request
    // SportSubjectListRequest request = new SportSubjectListRequest();
    // request.setSportSubject("1");
    // request.setSubjectName(null);
    // request.setGender("1");
    // request.setWeight(BigDecimal.valueOf(70));
    // request.setPageInfo(new PageInfo(1, 2));
    // // 发起请求，得到返回结果
    // SportSubjectListResponse response = client.execute(request);
    // System.out.println(JsonUtil.toJson(response, true));
    // }
}
