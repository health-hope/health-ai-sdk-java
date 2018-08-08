package api;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import com.jiankangyouyi.health.ai.api.DefaultHealthAiClient;
import com.jiankangyouyi.health.ai.api.DefaultHealthAiClient.Version;
import com.jiankangyouyi.health.ai.api.HealthAiClient;
import com.jiankangyouyi.health.ai.api.PageInfo;
import com.jiankangyouyi.health.ai.api.request.DialogRecordRequest;
import com.jiankangyouyi.health.ai.api.request.ImageEmotionRecognizeRequest;
import com.jiankangyouyi.health.ai.api.request.ImageFoodMultiRecognizeRequest;
import com.jiankangyouyi.health.ai.api.request.ImageFoodSingleRecognizeRequest;
import com.jiankangyouyi.health.ai.api.request.ImageStationeryRecognizeRequest;
import com.jiankangyouyi.health.ai.api.request.QasQueryAnswerRequest;
import com.jiankangyouyi.health.ai.api.request.SearchFoodDetailRequest;
import com.jiankangyouyi.health.ai.api.request.SearchFoodListRequest;
import com.jiankangyouyi.health.ai.api.response.DialogRecordResponse;
import com.jiankangyouyi.health.ai.api.response.ImageEmotionRecognizeResponse;
import com.jiankangyouyi.health.ai.api.response.ImageFoodMultiRecognizeResponse;
import com.jiankangyouyi.health.ai.api.response.ImageFoodSingleRecognizeResponse;
import com.jiankangyouyi.health.ai.api.response.ImageStationeryRecognizeResponse;
import com.jiankangyouyi.health.ai.api.response.QasQueryAnswerResponse;
import com.jiankangyouyi.health.ai.api.response.SearchFoodDetailResponse;
import com.jiankangyouyi.health.ai.api.response.SearchFoodListResponse;
import com.jiankangyouyi.health.ai.api.util.JsonUtil;

public class ApiTest {

	private static String APPID = "5b33941b84274a0aa482e105";
	private static String PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDD9CM6VzJXDV7/GKNu3zAarMF0vMkAxcrYQlcKshfapDBxwhq/ILDQwtq3qwg7jG63QPGE8eqmjFWAfcnUSQAwG1Sw6R2qPGT+jXeQyKGwFicPPXS9ghRXYwPtNr8uJJ6B2R2QZB4MBFWZcgVFCG6Ygoww0PUZQPooLk/Xlw1KXLfPtFsd5b2mcg8fHvGPv6+yUJMypnUHRgOAmo9ussOoihOVEdVugk4q++nGwVrPxGvYnv4aFjkRV6huArsl/rirKGyhAt+4wg7UNbTSJEAWV+PRoKwOQLbF8C3C+mOXeJMxjcvyxo0QA3ZavXX+NkA7zg1wDan7Fb7qG7K+IZ6BAgMBAAECggEBAKzlH6QdRcR7fsM0GRf9g3M11KfM3sl4u6aeujAsvVFkJ35oFrNnA7vfAZ6nIOdx3EqC2ddEoJb9IX/y/P76vliz9MD3nv4StcXISqQL8mXs1d/jiLqhKJOGQPOvp3XuR5EoYaaCP+S4elKewTmM3BBit5Fm/aufolmLq1T86XQe2JkiCUGagRkTgaRRWjHKgTMMwpR8jc6k5mYigZRRu5HXNeDrlOSiPbHfvefQVgpQnONe3KhMGaMe1HFxOPFANlDMbqjyaBxDluipDgqTSSk0x6+ee0ClW8WqUDDb26k5ow4FEHVn8dDlid2ujCsluoN62wOjaWcbTUrgFXZbMLECgYEA8S6Rn6F83NdhEkdfVzPDfrdMejjlxRQW5A5CG1dMEoYxDdBGuOnLfyhe1DrsmBwXNb8n4lktHbAaaYAWx/obsb5w6YQZMfn7pLgw9AF3sg5hZP+WnTcsiszuoqgTt4rLX2wDnKDcqA4nPT8i/CI0367cG720qA7GRSqcM94HXD0CgYEAz/4yLU4hGiIqbWUe5Sal7IVjBG657P2ZGGlpdZ14uofNInlKbaCWO3Gj48GKS+jf8hFI9azICVMvdiuP+D4rlwhmo61pCMcalk8bqRwAJR+HYz3yKAaQ7nPwU6rjtmHSmN39i6Df4R3TMnmYLK/IdE/8a8cQmw90WPkaOjsAm5UCgYEAiPCTGJsdhVr5L+K8fIvUlW9ICiGiPKsycBy0ZkfD1sTAt4IplbaRp8ppRYGLcraIayj1YWyW1EN4S6zBwpv8+4gRHlW15I1210kJ6pGmv7+whyMkBnIcZVcEq/BY+Z7h6HUw+87OWtFmcD0YBSb69IKZUVr+Z2m0I/OUq1KGxVUCgYAkPktIEcE66JE0FtbXX3CyUlv6vcCwR1CSLGwwDoynFFrukuwhRkZnfVntqiALMj0z1Uc9aCpDVbeDg/vGai72VoRsKR+QZAGCB67uPO7ZiTDyXi0ARISkyJcsPS8I7OrhsG0qE5Jvi97tgLq/rrHjcrytmzaNjpfbmSy00Os+MQKBgQC/6r+JMHh24x+vfHeTOkIo3KNpYewnV3iM5/gSOBACP58lBKDw7cijx7tFdr0AEUa6/sAs36LUKcQGCZqrxOOJET2sFc21cEOx5zuEazjPD4cilO37FBuyTo5DxB56EzLLeQ02RibHuNw8ZjF0Qnz+YOyF9TD7pWk2zgaueKUc3Q==";
	
	private static String DATA_PATH = "/Users/yangsongbo/workspace2/health-ai-sdk-java/src/test/java/api/data/";
	
	/**
	 * 表情识别Test : base64 数据
	 * @throws IOException 
	 */
	@Test
	public void imageEmotionRecognizeBase64Test() throws IOException{
		
		
		HealthAiClient client = 
				new DefaultHealthAiClient
					(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");
		
		String image = FileUtils.readFileToString(new File(DATA_PATH+"emotion_recognize_base64_image.txt"), "UTF-8");
		ImageEmotionRecognizeRequest request = new ImageEmotionRecognizeRequest();
		request.setImage(image);
		ImageEmotionRecognizeResponse response = client.execute(request);
		//response json ： 
		//{"curTime":"2018-06-28 18:47:36","recognitionEmotionList":[{"confidence":0.986506,"emotionName":"happy","leftCoordinate":0.781,"topCoordinate":0.0981}],"retCode":"SUCCESS","retInfo":"处理成功","sn":"ab1c6cd87ac011e8aa9bac1f6b22e430"}

		System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response,true)));
		System.out.println(JsonUtil.toJson(response));
	}

	/**
	 * 表情识别Test : URL
	 * 
	 * 
	 * @throws IOException 
	 */
	@Test
	public void imageEmotionRecognizeURLTest() throws IOException{
		
		
		HealthAiClient client = 
				new DefaultHealthAiClient
					(APPID, PRIVATE_KEY, Version.VERSION_2_0, "https://api2.hbox.jiankangyouyi.com");
		String emotionImageUrl = "https://oieve67xn.qnssl.com/images/2/b4d2cda31c8246d2bd2c2db67007833e.jpeg";
		
		ImageEmotionRecognizeRequest request = new ImageEmotionRecognizeRequest();
		request.setEmotionImageUrl(emotionImageUrl);
		ImageEmotionRecognizeResponse response = client.execute(request);
		
		//response json ： 
		//{"curTime":"2018-06-28 18:47:36","recognitionEmotionList":[{"confidence":0.986506,"emotionName":"happy","leftCoordinate":0.781,"topCoordinate":0.0981}],"retCode":"SUCCESS","retInfo":"处理成功","sn":"ab1c6cd87ac011e8aa9bac1f6b22e430"}
		System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response,true)));
		System.out.println(JsonUtil.toJson(response));

	}
	
	/**
	 * 一图多物食物识别Test : Base64
	 * 
	 * 
	 * @throws IOException 
	 */
	@Test
	public void imageFoodMultiRecognizeBase64Test() throws IOException {

		HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
				"https://api2.hbox.jiankangyouyi.com");

		String image = FileUtils.readFileToString(new File(DATA_PATH + "food_multi_recognize_base64_image.txt"),
				"UTF-8");
		ImageFoodMultiRecognizeRequest request = new ImageFoodMultiRecognizeRequest();
		request.setImage(image);
		ImageFoodMultiRecognizeResponse response = client.execute(request);
		// response json ：
		//{"curTime":"2018-06-28 18:56:47","recognitionFoodList":[{"alanine":0.0,"arginine":0.0,"aspartic":0.0,"calcium":5.84,"carbohydrate":24.94,"carotene":0.0,"cholesterol":0.0,"chromium":0.0,"confidence":0.857318,"copper":0.05,"ediblePart":100.0,"fat":11.78,"fluorine":0.0,"foodId":"57b6bd3f3004d165422ad74b","foodName":"米饭","gi":0.0,"glutamic":0.0,"glycine":0.0,"heat":225,"heatKJ":941,"histidine":0.0,"iodine":0.0,"iron":1.05,"isoleucine":0.0,"leftCoordinate":0.407,"leucine":0.0,"lysine":0.0,"manganese":0.46,"methionine":0.0,"mfaPercent":45.07,"moisture":55.61,"monounsaturatedFattyAcid":0.84,"pfaPercent":41.19,"phenylalanine":0.0,"phosphorus":48.65,"polyunsaturatedFattyAcid":0.77,"potassium":23.59,"proline":0.0,"protein":4.63,"recognitionFoodNum":0,"saturatedFattyAcid":0.27,"selenium":0.31,"serine":0.0,"sfaPercent":14.36,"sodium":2.06,"solkfloc":0.24,"soyIsoflavone":0.0,"threonine":0.0,"topCoordinate":0.0898,"totalFattyAcid":1.87,"tryptophan":0.0,"unit":"克","valine":0.0,"vitaminA":0.0,"vitaminB1":0.06,"vitaminB12":0.0,"vitaminB2":0.02,"vitaminB3":1.49,"vitaminB5":0.0,"vitaminB6":0.0,"vitaminB9":0.0,"vitaminC":0.0,"vitaminD":0.0,"vitaminE":0.47,"vitaminK":0.0,"zinc":0.73},{"alanine":897.5,"arginine":758.0,"aspartic":922.5,"calcium":8.5,"carbohydrate":0.15,"carotene":0.0,"cholesterol":53.0,"chromium":0.0,"confidence":0.844831,"copper":0.13,"ediblePart":74.0,"fat":1.15,"fluorine":0.0,"foodId":"57da3a2177c86f66be2dab20","foodName":"乌鸡汤","gi":0.0,"glutamic":1530.5,"glycine":463.0,"heat":55,"heatKJ":230,"histidine":291.5,"iodine":0.0,"iron":1.15,"isoleucine":0.0,"leftCoordinate":0.4419,"leucine":0.0,"lysine":0.0,"manganese":0.03,"methionine":0.0,"mfaPercent":27.27,"moisture":36.95,"monounsaturatedFattyAcid":0.3,"pfaPercent":9.09,"phenylalanine":0.0,"phosphorus":105.0,"polyunsaturatedFattyAcid":0.1,"potassium":161.5,"proline":771.5,"protein":11.15,"recognitionFoodNum":0,"saturatedFattyAcid":0.65,"selenium":3.87,"serine":532.0,"sfaPercent":59.09,"sodium":32.0,"solkfloc":0.0,"soyIsoflavone":0.0,"threonine":0.0,"topCoordinate":0.4973,"totalFattyAcid":1.1,"tryptophan":140.0,"unit":"克","valine":362.0,"vitaminA":0.0,"vitaminB1":0.01,"vitaminB12":0.0,"vitaminB2":0.1,"vitaminB3":3.55,"vitaminB5":0.0,"vitaminB6":0.0,"vitaminB9":0.0,"vitaminC":0.0,"vitaminD":0.0,"vitaminE":0.89,"vitaminK":0.0,"zinc":0.8}],"retCode":"SUCCESS","retInfo":"处理成功","sn":"f2cb27e47ac111e8aa9bac1f6b22e430"}
		System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
		System.out.println(JsonUtil.toJson(response));

	}
	
	/**
	 * 一图多物食物识别Test : URL
	 * 
	 * 
	 * @throws IOException 
	 */
	@Test
	public void imageFoodMultiRecognizeURLTest() throws IOException {

		HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
				"https://api2.hbox.jiankangyouyi.com");

		String foodImageUrl = "https://oieve67xn.qnssl.com/images/2/e62e0808a0004c1385bd806a89595051.jpeg";
		ImageFoodMultiRecognizeRequest request = new ImageFoodMultiRecognizeRequest();
		request.setFoodImageUrl(foodImageUrl);
		ImageFoodMultiRecognizeResponse response = client.execute(request);
		// response json ：
		//{"curTime":"2018-06-28 18:56:47","recognitionFoodList":[{"alanine":0.0,"arginine":0.0,"aspartic":0.0,"calcium":5.84,"carbohydrate":24.94,"carotene":0.0,"cholesterol":0.0,"chromium":0.0,"confidence":0.857318,"copper":0.05,"ediblePart":100.0,"fat":11.78,"fluorine":0.0,"foodId":"57b6bd3f3004d165422ad74b","foodName":"米饭","gi":0.0,"glutamic":0.0,"glycine":0.0,"heat":225,"heatKJ":941,"histidine":0.0,"iodine":0.0,"iron":1.05,"isoleucine":0.0,"leftCoordinate":0.407,"leucine":0.0,"lysine":0.0,"manganese":0.46,"methionine":0.0,"mfaPercent":45.07,"moisture":55.61,"monounsaturatedFattyAcid":0.84,"pfaPercent":41.19,"phenylalanine":0.0,"phosphorus":48.65,"polyunsaturatedFattyAcid":0.77,"potassium":23.59,"proline":0.0,"protein":4.63,"recognitionFoodNum":0,"saturatedFattyAcid":0.27,"selenium":0.31,"serine":0.0,"sfaPercent":14.36,"sodium":2.06,"solkfloc":0.24,"soyIsoflavone":0.0,"threonine":0.0,"topCoordinate":0.0898,"totalFattyAcid":1.87,"tryptophan":0.0,"unit":"克","valine":0.0,"vitaminA":0.0,"vitaminB1":0.06,"vitaminB12":0.0,"vitaminB2":0.02,"vitaminB3":1.49,"vitaminB5":0.0,"vitaminB6":0.0,"vitaminB9":0.0,"vitaminC":0.0,"vitaminD":0.0,"vitaminE":0.47,"vitaminK":0.0,"zinc":0.73},{"alanine":897.5,"arginine":758.0,"aspartic":922.5,"calcium":8.5,"carbohydrate":0.15,"carotene":0.0,"cholesterol":53.0,"chromium":0.0,"confidence":0.844831,"copper":0.13,"ediblePart":74.0,"fat":1.15,"fluorine":0.0,"foodId":"57da3a2177c86f66be2dab20","foodName":"乌鸡汤","gi":0.0,"glutamic":1530.5,"glycine":463.0,"heat":55,"heatKJ":230,"histidine":291.5,"iodine":0.0,"iron":1.15,"isoleucine":0.0,"leftCoordinate":0.4419,"leucine":0.0,"lysine":0.0,"manganese":0.03,"methionine":0.0,"mfaPercent":27.27,"moisture":36.95,"monounsaturatedFattyAcid":0.3,"pfaPercent":9.09,"phenylalanine":0.0,"phosphorus":105.0,"polyunsaturatedFattyAcid":0.1,"potassium":161.5,"proline":771.5,"protein":11.15,"recognitionFoodNum":0,"saturatedFattyAcid":0.65,"selenium":3.87,"serine":532.0,"sfaPercent":59.09,"sodium":32.0,"solkfloc":0.0,"soyIsoflavone":0.0,"threonine":0.0,"topCoordinate":0.4973,"totalFattyAcid":1.1,"tryptophan":140.0,"unit":"克","valine":362.0,"vitaminA":0.0,"vitaminB1":0.01,"vitaminB12":0.0,"vitaminB2":0.1,"vitaminB3":3.55,"vitaminB5":0.0,"vitaminB6":0.0,"vitaminB9":0.0,"vitaminC":0.0,"vitaminD":0.0,"vitaminE":0.89,"vitaminK":0.0,"zinc":0.8}],"retCode":"SUCCESS","retInfo":"处理成功","sn":"f2cb27e47ac111e8aa9bac1f6b22e430"}
		System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
		System.out.println(JsonUtil.toJson(response));

	}
	

	/**
	 * 一图一物食物识别Test : Base64
	 * 
	 * 
	 * @throws IOException 
	 */
	@Test
	public void imageFoodSingleRecognizeBase64Test() throws IOException {

		HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
				"https://api2.hbox.jiankangyouyi.com");

		String image = FileUtils.readFileToString(new File(DATA_PATH + "food_single_recognize_base64_image.txt"),
				"UTF-8");
		ImageFoodSingleRecognizeRequest request = new ImageFoodSingleRecognizeRequest();
		request.setImage(image);
		ImageFoodSingleRecognizeResponse response = client.execute(request);
		// response json ：
		//{"curTime":"2018-06-28 19:03:16","retCode":"SUCCESS","retInfo":"处理成功","sn":"db9c9ef87ac211e8aa9bac1f6b22e430","topFoodNutrientBeanList":[{"alanine":15.0,"arginine":10.44,"aspartic":23.89,"calcium":14.33,"carbohydrate":20.04,"carotene":894.44,"cholesterol":0.0,"chromium":0.0,"confidence":0.279938,"copper":0.05,"ediblePart":97.33,"fat":0.27,"fluorine":0.0,"foodId":"587344559679a828db5cae8f","foodName":"照烧鸡排饭","gi":0.0,"glutamic":35.0,"glycine":8.11,"heat":93,"heatKJ":389,"histidine":4.22,"iodine":0.0,"iron":1.1,"isoleucine":0.0,"leucine":0.0,"lysine":0.0,"manganese":0.42,"methionine":0.0,"mfaPercent":0.0,"moisture":76.96,"monounsaturatedFattyAcid":0.0,"pfaPercent":0.0,"phenylalanine":0.0,"phosphorus":50.11,"polyunsaturatedFattyAcid":0.0,"potassium":85.11,"proline":9.33,"protein":2.28,"saturatedFattyAcid":0.0,"selenium":0.97,"serine":11.56,"sfaPercent":0.0,"sodium":10.76,"solkfloc":0.62,"soyIsoflavone":0.0,"threonine":0.0,"totalFattyAcid":0.0,"tryptophan":4.0,"unit":"克","valine":12.78,"vitaminA":0.0,"vitaminB1":0.03,"vitaminB12":0.0,"vitaminB2":0.04,"vitaminB3":1.38,"vitaminB5":0.0,"vitaminB6":0.0,"vitaminB9":0.0,"vitaminC":10.33,"vitaminD":0.0,"vitaminE":0.05,"vitaminK":0.0,"zinc":0.69}]}
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

		HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
				"https://api2.hbox.jiankangyouyi.com");

		String foodImageUrl = "https://oieve67xn.qnssl.com/images/2/e62e0808a0004c1385bd806a89595051.jpeg";
		ImageFoodSingleRecognizeRequest request = new ImageFoodSingleRecognizeRequest();
		request.setFoodImageUrl(foodImageUrl);
		ImageFoodSingleRecognizeResponse response = client.execute(request);
		// response json ：
		//{"curTime":"2018-06-28 19:05:05","retCode":"SUCCESS","retInfo":"处理成功","sn":"1c53db5a7ac311e8aa9bac1f6b22e430","topFoodNutrientBeanList":[{"alanine":15.0,"arginine":10.44,"aspartic":23.89,"calcium":14.33,"carbohydrate":20.04,"carotene":894.44,"cholesterol":0.0,"chromium":0.0,"confidence":0.279938,"copper":0.05,"ediblePart":97.33,"fat":0.27,"fluorine":0.0,"foodId":"587344559679a828db5cae8f","foodName":"照烧鸡排饭","gi":0.0,"glutamic":35.0,"glycine":8.11,"heat":93,"heatKJ":389,"histidine":4.22,"iodine":0.0,"iron":1.1,"isoleucine":0.0,"leucine":0.0,"lysine":0.0,"manganese":0.42,"methionine":0.0,"mfaPercent":0.0,"moisture":76.96,"monounsaturatedFattyAcid":0.0,"pfaPercent":0.0,"phenylalanine":0.0,"phosphorus":50.11,"polyunsaturatedFattyAcid":0.0,"potassium":85.11,"proline":9.33,"protein":2.28,"saturatedFattyAcid":0.0,"selenium":0.97,"serine":11.56,"sfaPercent":0.0,"sodium":10.76,"solkfloc":0.62,"soyIsoflavone":0.0,"threonine":0.0,"totalFattyAcid":0.0,"tryptophan":4.0,"unit":"克","valine":12.78,"vitaminA":0.0,"vitaminB1":0.03,"vitaminB12":0.0,"vitaminB2":0.04,"vitaminB3":1.38,"vitaminB5":0.0,"vitaminB6":0.0,"vitaminB9":0.0,"vitaminC":10.33,"vitaminD":0.0,"vitaminE":0.05,"vitaminK":0.0,"zinc":0.69}]}
		System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
		System.out.println(JsonUtil.toJson(response));

	}
	
	
	/**
	 * 文具识别Test : Base64
	 * 
	 * 
	 * @throws IOException 
	 */
	@Test
	public void imageStationeryRecognizeBase64Test() throws IOException {

		HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
				"https://api2.hbox.jiankangyouyi.com");

		String image = FileUtils.readFileToString(new File(DATA_PATH + "stationery_recognize_base64_image.txt"),
				"UTF-8");
		ImageStationeryRecognizeRequest request = new ImageStationeryRecognizeRequest();
		request.setImage(image);
		ImageStationeryRecognizeResponse response = client.execute(request);
		// response json ：
		//{"confidence":0.993592,"curTime":"2018-06-28 19:11:45","itemName":"笔","retCode":"SUCCESS","retInfo":"处理成功","sn":"0b5678a27ac411e8aa9bac1f6b22e430"}
		System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
		System.out.println(JsonUtil.toJson(response));
	}
	
	
	/**
	 * 文具识别Test : Base64
	 * 
	 * 
	 * @throws IOException 
	 */
	@Test
	public void imageStationeryRecognizeURLTest() throws IOException {

		HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
				"https://api2.hbox.jiankangyouyi.com");

		String officeImageUrl = "https://oieve67xn.qnssl.com/images/2/559bfa07ab6440459ebcde122c1f6038.jpeg";
		
		ImageStationeryRecognizeRequest request = new ImageStationeryRecognizeRequest();
		request.setOfficeImageUrl(officeImageUrl);
		ImageStationeryRecognizeResponse response = client.execute(request);
		// response json ：
		//{"confidence":0.993592,"curTime":"2018-06-28 19:11:45","itemName":"笔","retCode":"SUCCESS","retInfo":"处理成功","sn":"0b5678a27ac411e8aa9bac1f6b22e430"}
		System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
		System.out.println(JsonUtil.toJson(response));
	}
	
	/**
	 * 智能问答
	 * 
	 * 
	 * @throws IOException 
	 */
	@Test
	public void qasQueryAnswerTest() throws IOException {

		HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
				"https://api2.hbox.jiankangyouyi.com");

		
		QasQueryAnswerRequest request = new QasQueryAnswerRequest();
		request.setQuestion("吃什么有利于减肥？");
		QasQueryAnswerResponse response = client.execute(request);
		// response json ：
//		{"answer":"跑步能加速身体的新陈代谢，消耗多余的脂肪或碳水化合物，坚持跑步对减肥的作用很大。","curTime":"2018-06-28 22:42:54","retCode":"SUCCESS","retInfo":"处理成功","sn":"89e2a1ba7ae111e8aa9bac1f6b22e430"}

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
	public void dialogRecordTest() throws IOException {

		HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
				"https://api.hbox.jiankangyouyi.com/ego-gw");

		
		DialogRecordRequest request = new DialogRecordRequest();
		request.setText("我吃了三十颗米饭一碗紫菜汤");
		DialogRecordResponse response = client.execute(request);
		//{"curTime":"2018-07-05 16:55:50","result":[{"count":30,"intent":"RECORD_MEAL","itemName":"米饭","unit":"颗"},{"count":1,"intent":"RECORD_MEAL","itemName":"紫菜汤","unit":"碗"}],"retCode":"SUCCESS","sn":"5b3ddd165516106e19a8c4fa"}
		System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
		System.out.println(JsonUtil.toJson(response));
	}
	
	
	/**
	 * 查询食物列表
	 * 
	 * 
	 * @throws IOException 
	 */
	@Test
	public void seachFoodList() throws IOException {

		HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
				"https://api.hbox.jiankangyouyi.com/ego-gw");

		
		SearchFoodListRequest request = new SearchFoodListRequest();
		request.setFoodName("鸡蛋");
		request.setPageInfo(new PageInfo(1,5));
		
		SearchFoodListResponse response = client.execute(request);
		System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
		System.out.println(JsonUtil.toJson(response));
	}
	
	/**
	 * 查询食物详情
	 * 
	 * 
	 * @throws IOException 
	 */
	@Test
	public void seachFoodDetail() throws IOException {

		HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
				"https://api.hbox.jiankangyouyi.com/ego-gw");

		
		SearchFoodDetailRequest request = new SearchFoodDetailRequest();
		request.setFoodId("57b6bd3f3004d165422ad7f4");
		
		SearchFoodDetailResponse response = client.execute(request);
		System.out.println(JsonUtil.formatJson(JsonUtil.toJson(response, true)));
		System.out.println(JsonUtil.toJson(response));
	}
}
