package com.jiankangyouyi.health.ai.api.request;

import com.jiankangyouyi.health.ai.api.response.AbstractHealthAiResData;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Request对象
 *
 * @param <T> 返回的对象
 * @author yangsongbo
 */
public abstract class AbstractHealthAiReqData<T extends AbstractHealthAiResData> implements Serializable {


    private static final long serialVersionUID = 1L;


    @SuppressWarnings("unchecked")
    public Class<T> getResponseClass() {
        Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return entityClass;
    }

}
