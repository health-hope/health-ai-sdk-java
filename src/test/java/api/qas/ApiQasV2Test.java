package api.qas;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.jiankangyouyi.health.ai.api.DefaultHealthAiClient;
import com.jiankangyouyi.health.ai.api.DefaultHealthAiClient.Version;
import com.jiankangyouyi.health.ai.api.HealthAiClient;
import com.jiankangyouyi.health.ai.api.request.QasQueryAnswerRequest;
import com.jiankangyouyi.health.ai.api.response.QasQueryAnswerResponse;

import cn.jianzhishidai.core.utils.excel.ExcelUtil;
import cn.jianzhishidai.core.utils.excel.ExportExcelUtil;

public class ApiQasV2Test {

	private static String APPID = "5b33941b84274a0aa482e105";
	private static String PRIVATE_KEY = 
			"MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDvGsh7/ollxwhrtRU3m746ERkgXW2gNlol+IcbvI/7APL+2ndMZvxpwliR59X7vMhPM1t33bkWDQLT1VIzmdkz/2ZTw7UN2EGgbTEflu3Bzt6UqQc0mOxJtsm6PMvfzrIhdr8rYDDR749QDhhKsEg2wzbJNBEhp7JCJRzTTqNpIvaTbaEck8FSm8H6QYOmAcupExrMQA7pEUVBgduVT3oMmcT5RnHh8hD8BjjMV9V/xq8tVOF7F++tvBtdoIW9gT+joFKCWUOertiQWENaub+lvKTeRaGeOlRjmZWp55rcx3hp56usGtSM3O8un8aKMbOJ448gka+XzQ/kOXUmPGlLAgMBAAECggEBAMYhKXQlzXC65q1pljVIJu8y7+Ezyf1yTG0ebcZ8D8rsVG7+VNDInex9EKuGsngxTMLkSa0f25j8GxWxtLXxjFxcDEzo5QSd6HOpR4VnqYhphWMmVUQuW84RW0Op0T6Zpl24alzlDk9H9TdfFp39STmntaQwMunybfIFksc+aIZaylP2sPkvjh8D9LyuSKKpmO5RMO8jM2EEo0AenonV7eXEvVQls/zht8ZnPQzGLBwCS+LvmggYjTbkDEELaVZClxjSgw1Ksw8cY3M05JZAZVfK8sZkxAAqzcrXNLZ0YC/wo/aZNw7LGPD78FHe/AFKTZ9rFtUWtmF9egwLN78aQ6ECgYEA/biIBQzsbRGWB6s3dkRjCYeWptc8aiNg0pzn+vmLbV9fmQII7bLS+lUjzZthYsjHBEEYilcrOYfx9ODT/1mzux+8e/kjxCvzOxJWktE2CfaRn2LzL1fXei6hk4It9kXxUCbxMeH0gTWhp6P8zmJcHh9LIyMZ2O8kivXdGjbRQFMCgYEA8UCjwni8esFnYn4qUXwyXap01EXGOhLqFIwiyds+InnLT723AXFFIxPW91lDCZdWXloL83flyP82qXAjfM//4Dvtb7bq2Ee77uCJn9DaGdQC8xJj1HHkkFInQSexFrIKwcEAPEMZ/EgdPrVW7Fmypf4CVd79RrqqoiHNv1eu9CkCgYEA+ZIXcehZc5vV2StI/fOc+5W80dZsHfc42VLwOYZX6Ljk3ywKPk4li4pOEoQh0jqu0Pd7PTErWobnsLmqrsW8rnc0Pzo9PU0CD3wlXnueTUSVz5NUpKAiW5Qc6W0m6tW33eDAZhHeIW7w2WbMWPKVrCeaEDEJzsLFTk80MwHy6PMCgYBO9CCj3G+SnQkAqtmeoU66aLajYdJl3xrMbrBT73R+Q+3NwwDJcBB4Ul3fxU6zLNwPNNkEbRC+nwd8nD6A8nGDKRmjnfFtpsxSeRmRPACkw0XT1wjk1gE/WiOOpzbFfq8WidtR3YP7lH49r4sq/pAA0whgogGxzBVbykRTgpa3QQKBgQCVWLYdXllqLUQhKZZa2ehShroO14fdCANc0eE5L6wl84gCzGX5ePPvk/WKZtaImTZFGNJZ+XwTGEf9cJ0oMTvZ5kdb3DOSWOIueq4uGohsZUeXBMVjeU6uRqBTn46i7gOH3/FS4U6Vcpr4lY/YVsBnJiQ/oST2jWwghHdvd4SMYw==";

	private static String DATA_FILE = "/Users/yangsongbo/workspace2/health-ai-sdk-java/src/test/java/api/qas/扩充0917.xlsx";
	private static String EXPORT_PATH = "/Users/yangsongbo/workspace2/health-ai-sdk-java/src/test/java/api/qas/";

	
	/**
	 * 定义excel的sheet index 和 对应的sheet name
	 */
	private static Map<Integer,String> sheetMap;
	
	static{
		sheetMap = new HashMap<>();
		sheetMap.put(0, "what");
//		sheetMap.put(1, "food_effect");
//		sheetMap.put(2, "nutrient_content");
//		sheetMap.put(3, "weight_loss_effects");
//		sheetMap.put(4, "normal_physical_indicators");
//		sheetMap.put(5, "what_to_not_eat");
//		sheetMap.put(6, "what_to_eat");
//		sheetMap.put(7, "disease_symptoms_reason");
//		sheetMap.put(8, "curing_disease");
//		sheetMap.put(9, "how_to_do");
//		sheetMap.put(10, "prevent_disease");
//		sheetMap.put(11, "living_habit");	
	}
	
	/**
	 * 智能问答
	 * 
	 * 
	 * @throws IOException 
	 */
	@Test
	public void test() throws IOException {
		HealthAiClient client = new DefaultHealthAiClient(APPID, PRIVATE_KEY, Version.VERSION_2_0,
				"https://api2.hbox.jiankangyouyi.com");
		
		for(Entry<Integer, String> entry : sheetMap.entrySet()){
			int sheetIndex = entry.getKey();
			String sheetName = entry.getValue();
			List<List<String>> dataList = ExcelUtil.readExcel(DATA_FILE, sheetIndex, 3);

			if(CollectionUtils.isEmpty(dataList)){
				System.err.println("无法解析sheetIndex["+sheetIndex+"]数据");
				continue;
			}
			
			List<String> questions = new ArrayList<>();
			List<QasExcelBean> exportList = new ArrayList<>();
			
			for(int i=1;i<dataList.size();i++){
				List<String> data = dataList.get(i);
				if(CollectionUtils.isEmpty(data)){
					continue;
				}
				
				String question = data.get(0);
				if(StringUtils.isBlank(question)){
					continue;
				}
				questions.add(question);	
			}
			
			for(int i=1;i<dataList.size();i++){
				List<String> data = dataList.get(i);
				if(CollectionUtils.isEmpty(data)){
					continue;
				}
				
				String entity = data.get(1);
				String answer = data.get(2);

				for(String ques : questions){
					String question = getChinese(ques.replace("**", getChinese(entity)));
//					System.out.println("准备调用接口，问题["+question+"]");
//					QasQueryAnswerRequest request = new QasQueryAnswerRequest();
//					request.setQuestion(question);
//					QasQueryAnswerResponse response = client.execute(request);
//
//					String result = null;
//					
//					if(response == null){
//						result = "通讯异常";
//					}else{
//						if(answer.equals(response.getAnswer())){
//							result = "正确";
//						}else{
//							result = "错误";
//						}
//						
//					}
//					
//					QasExcelBean bean = new QasExcelBean();
//					bean.setAnswer(answer);
//					bean.setResult(result);
//					bean.setQuestion(question);
//					bean.setResAnswer(response == null ? "通讯异常" : response.getAnswer());
					
					System.out.println("question["+question+"],ques["+ques+"],entity["+entity+"],answer["+answer+"]");
//					exportList.add(bean);
				}
				
			}
			
//			ExportExcelUtil<QasExcelBean> util = new ExportExcelUtil<QasExcelBean>();
//			ByteArrayOutputStream out = new ByteArrayOutputStream();
//			try {
//				String[] headers = { "原始问题", "匹配结果", "原始答案", "接口调用答案"};
//				String[] columns = { "question", "result", "answer","resAnswer"};
//
//				util.exportExcel("测试数据", headers, columns, exportList, out);
//				
//				FileUtils.writeByteArrayToFile(new File(EXPORT_PATH + sheetName + ".xls"), out.toByteArray());
//				
//			} catch (Exception e) {
//				System.err.println(e);
//			} finally {
//				try {
//					if (out != null) {
//						out.close();
//					}
//				} catch (IOException e) {
//				}
//			}
//			
			
		} 
	}
	
	
	public static void main(String[] args) {
		String str = "*甲状腺B_DI*钙化I_DI*";
		
		String question = "*给*我*讲*下**的*定义*是*啥*";
		
		System.out.println(getChinese(question.replace("**", getChinese(str))));
	}
	
	public static String getChinese(String paramValue) {
		String regex = "([\u4e00-\u9fa5]+)";
		String str = "";
		Matcher matcher = Pattern.compile(regex).matcher(paramValue);
		while (matcher.find()) {
			str += matcher.group(0);
		}
		return str;

	}
	
	
	public static class QasExcelBean{
		
		private String question;		
		
		private String answer;
		
		private String resAnswer;
		
		private String result;
		
		
		
		
		@Override
		public String toString() {
			return "QasExcelBean [question=" + question + ", answer=" + answer + ", resAnswer=" + resAnswer
					+ ", result=" + result + "]";
		}

		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public String getAnswer() {
			return answer;
		}

		public void setAnswer(String answer) {
			this.answer = answer;
		}

		public String getResAnswer() {
			return resAnswer;
		}

		public void setResAnswer(String resAnswer) {
			this.resAnswer = resAnswer;
		}

		public String getResult() {
			return result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		
		
		
		
	}
	
	
}
