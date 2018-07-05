package com.jiankangyouyi.health.ai.api.response;

import java.math.BigDecimal;
import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 语音记录返回接口Bean
 * 
 * @author yangsongbo
 *
 */
public class DialogRecordResponse extends HealthAiResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * 识别结果
	 */
	private List<DialogRecordResult> result;

	public List<DialogRecordResult> getResult() {
		return result;
	}

	public void setResult(List<DialogRecordResult> result) {
		this.result = result;
	}

	public static class DialogRecordResult {

		/**
		 * 意图 ：
		 * </p>
		 * RECORD_MEAL ： 意图
		 * </p>
		 * RECORD_SPORT ： 运动记录
		 * </p>
		 * UNKOWN ： 未知意图
		 * </p>
		 */
		private String intent;

		/**
		 * 时间
		 * </p>
		 * AM ：上午
		 * </p>
		 * NOON ： 中午
		 * </p>
		 * PM ： 下午
		 * </p>
		 */
		private String dayTime;

		/**
		 * 实体名称：食物名称或运动名称，未知意图会返回解析出来的名词。
		 */
		private String itemName;

		/**
		 * 数量
		 */
		private BigDecimal count;

		/**
		 * 单位
		 */
		private String unit;

		public String getIntent() {
			return intent;
		}

		public void setIntent(String intent) {
			this.intent = intent;
		}

		public String getDayTime() {
			return dayTime;
		}

		public void setDayTime(String dayTime) {
			this.dayTime = dayTime;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public BigDecimal getCount() {
			return count;
		}

		public void setCount(BigDecimal count) {
			this.count = count;
		}

		public String getUnit() {
			return unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

	}
}
