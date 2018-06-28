package com.jiankangyouyi.health.ai.api.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * java 泛型工具类
 * @author ThinkPad
 *
 */
public class GenericsUtil {

	/**
	 * 获取超类的泛型类型
	 * @param clazz
	 * @return
	 */
	public static Class<?> getSuperClassGenricType(Class<?> clazz) {  
		return getSuperClassGenricType(clazz,0);
	}
	
	/**
	 * 获取超类的泛型类型
	 * @param clazz
	 * @param genericIndex 泛型定义的index
	 * @return
	 */
	public static Class<?> getSuperClassGenricType(Class<?> clazz, int genericIndex) {  
		  
        Type genType = clazz.getGenericSuperclass();  
  
        if (!(genType instanceof ParameterizedType)) {  
            return Object.class;  
        }  
  
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();  
  
        if (genericIndex >= params.length || genericIndex < 0) {  
            return Object.class;  
        }  
        if (!(params[genericIndex] instanceof Class)) {  
            return Object.class;  
        }  
        return (Class<?>) params[genericIndex];  
    }  
	
	/**
	 * 获取接口泛型的实际类型
	 * @param clazz
	 * @return
	 */
	public static Class<?> getInterfaceGenricType(Class<?> clazz) { 
		return getInterfaceGenricType(clazz,0,0);
	}
	
	public static Class<?> getInterfaceGenricType(Class<?> clazz, int interfaceIndex) { 
		return getInterfaceGenricType(clazz,interfaceIndex,0);
	}
	
	public static Class<?> getInterfaceGenricType(Class<?> clazz, int interfaceIndex,int genericIndex) {  
		  
        Type genType = clazz.getGenericInterfaces()[interfaceIndex];  
  
        if (!(genType instanceof ParameterizedType)) {  
            return Object.class;  
        }  
  
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();  
  
        if (genericIndex >= params.length || genericIndex < 0) {  
            return Object.class;  
        }  
        if (!(params[genericIndex] instanceof Class)) {  
            return Object.class;  
        }  
        return (Class<?>) params[genericIndex];  
    }  
	
}
