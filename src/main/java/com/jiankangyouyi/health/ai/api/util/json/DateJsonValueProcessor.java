package com.jiankangyouyi.health.ai.api.util.json;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

/**
 * 时间戳数据类型的转换
 * 
 */
public class DateJsonValueProcessor implements JsonValueProcessor {

	public static final String Default_DATE_PATTERN = "yyyy-MM-dd";
	private DateFormat dateFormat;

	public DateJsonValueProcessor(String datePattern) {
		try {
			dateFormat = new SimpleDateFormat(datePattern);
		} catch (Exception e) {
			dateFormat = new SimpleDateFormat(Default_DATE_PATTERN);
		}
	}
	
	@Override
	public Object processArrayValue(Object value, JsonConfig arg1) {
		return process(value);
	}

	@Override
	public Object processObjectValue(String key, Object value, JsonConfig arg2) {
		return process(value);
	}
	
	private Object process(Object value){
		if(value==null){
			return "";
		}else{
			return this.dateFormat.format(value);
		}
	}

}