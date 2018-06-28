package com.jiankangyouyi.health.ai.api.util.json;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

public class ToStringJsonValueProcessor implements JsonValueProcessor {
	public static ToStringJsonValueProcessor instance = new ToStringJsonValueProcessor();

	 
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
			return  String.valueOf(value);
		}
	}

}
