package com.jiankangyouyi.health.ai.api;


import com.jiankangyouyi.health.ai.api.request.*;
import com.jiankangyouyi.health.ai.api.response.AbstractHealthAiResData;
import com.jiankangyouyi.health.ai.api.response.HealthAiResponse;
import com.jiankangyouyi.health.ai.api.response.ServiceResponse;
import com.jiankangyouyi.health.ai.api.util.JsonUtil;
import com.jiankangyouyi.health.ai.api.util.UUIDUtil;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/**
 * API 执行抽象类
 *
 * @author yangsongbo
 */
public abstract class AbstractHealthAiClient implements HealthAiClient {

    /**
     * 应用ID
     */
    protected String appId;

    /**
     * 版本号
     */
    protected String version;


    private DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 执行请求
     *
     * @param request 请求数据
     * @param url     请求URL
     * @return 返回数据 JSON
     */
    abstract String execute(ServiceRequest request, String url);


    @Override
    public String execute(String reqDataJson, String url) {

        ServiceJsonRequest request = new ServiceJsonRequest(appId, UUIDUtil.getJavaUUID(),
                version, sdf.format(new Timestamp(System.currentTimeMillis())), reqDataJson);

        return this.execute(request, url);
    }


    @Override
    public String execute(Map<String, Object> reqData, String url) {

        ServiceMapRequest request = new ServiceMapRequest(appId, UUIDUtil.getJavaUUID(),
                version, sdf.format(new Timestamp(System.currentTimeMillis())), reqData);

        return this.execute(request, url);
    }

    @Override
    public <T extends AbstractHealthAiResData> HealthAiResponse<T> execute(AbstractHealthAiReqData<T> reqData, String url) {

        ServiceBeanRequest request = new ServiceBeanRequest(appId, UUIDUtil.getJavaUUID(),
                version, sdf.format(new Timestamp(System.currentTimeMillis())), reqData);

        String result = this.execute(request, url);

        ServiceResponse response = JsonUtil.fromJson(result, ServiceResponse.class);
        T trs = null;
        if (response.getResData() != null && response.getResData().length() > 0) {
            trs = JsonUtil.fromJson(response.getResData(), reqData.getResponseClass());
        }

        HealthAiResponse<T> healthAiResponse = new HealthAiResponse<T>();
        healthAiResponse.setResData(trs);
        healthAiResponse.setResponseJson(result);
        return healthAiResponse;
    }

}
