package com.jiankangyouyi.health.ai.api;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;


public abstract class HealthAiRequest<T extends HealthAiResponse> implements Serializable{

	
	private static final long serialVersionUID = 1L;

	public abstract String getApiUrl();
	
	@SuppressWarnings("unchecked")
	public Class<T> getResponseClass(){
		Class<T> entityClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		return entityClass;
	}
	
}
