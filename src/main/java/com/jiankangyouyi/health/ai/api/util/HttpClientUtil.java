package com.jiankangyouyi.health.ai.api.util;

import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class HttpClientUtil {

    private static final String DEFAULT_CHARSET = "UTF-8";

    public static final String CONTENT_TYPE_JSON = "application/json;charset=utf-8";

    /**
     * 链接超时时间,毫秒
     */
    private static final int CONNECT_TIME_OUT = 30000;

    private static final RequestConfig REQUEST_CONFIG = RequestConfig.custom().setConnectTimeout(CONNECT_TIME_OUT).build();

    /**
     * @param url     请求地址
     * @param params  参数
     * @param headers headers参数
     * @return 请求失败返回null
     * @description 功能描述: get 请求
     */
    public static String get(String url, Map<String, String> params, Map<String, String> headers) {
        CloseableHttpClient httpClient = null;
        if (params != null && !params.isEmpty()) {
            StringBuffer param = new StringBuffer();
            boolean flag = true;
            for (Entry<String, String> entry : params.entrySet()) {
                if (flag) {
                    param.append("?");
                    flag = false;
                } else {
                    param.append("&");
                }
                param.append(entry.getKey()).append("=");

                try {
                    param.append(URLEncoder.encode(entry.getValue(), DEFAULT_CHARSET));
                } catch (UnsupportedEncodingException e) {
                    //编码失败
                }
            }
            url += param.toString();
        }

        String body = null;
        CloseableHttpResponse response = null;
        try {
            httpClient = HttpClients.custom()
                    .setDefaultRequestConfig(REQUEST_CONFIG)
                    .build();
            HttpGet httpGet = new HttpGet(url);
            response = httpClient.execute(httpGet);
            body = EntityUtils.toString(response.getEntity(), DEFAULT_CHARSET);
        } catch (Exception e) {
            throw new RuntimeException("http get exception", e);
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    throw new RuntimeException(null, e);
                }
            }

            if (httpClient != null) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    throw new RuntimeException(null, e);
                }
            }
        }
        return body;
    }

    /**
     * @param url 请求地址
     * @return 请求失败返回null
     * @description 功能描述: get 请求
     */
    public static String get(String url) {
        return get(url, null);
    }

    /**
     * @param url    请求地址
     * @param params 参数
     * @return 请求失败返回null
     * @description 功能描述: get 请求
     */
    public static String get(String url, Map<String, String> params) {
        return get(url, params, null);
    }

    /**
     * @param url    请求地址
     * @param params 参数
     * @return 请求失败返回null
     * @description 功能描述: post 请求
     */
    public static String post(String url, Map<String, String> params) {
        CloseableHttpClient httpClient = null;
        HttpPost httpPost = new HttpPost(url);
        List<NameValuePair> nameValuePairs = new ArrayList<>();
        if (params != null && !params.isEmpty()) {
            for (Entry<String, String> entry : params.entrySet()) {
                nameValuePairs.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
        }

        String body = null;
        CloseableHttpResponse response = null;
        try {
            httpClient = HttpClients.custom()
                    .setDefaultRequestConfig(REQUEST_CONFIG)
                    .build();
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, DEFAULT_CHARSET));
            response = httpClient.execute(httpPost);
            body = EntityUtils.toString(response.getEntity(), DEFAULT_CHARSET);
        } catch (Exception e) {
            throw new RuntimeException("http post exception", e);
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    throw new RuntimeException(null, e);
                }
            }

            if (httpClient != null) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    throw new RuntimeException(null, e);
                }
            }
        }
        return body;
    }

    public static String post(String url, String s) {
        return post(url, s, null, null);
    }


    public static String post(String url, String s, String contentType) {

        return post(url, s, contentType, null);
    }

    /**
     * @param url 请求地址
     * @param s   参数
     * @return 请求失败返回null
     * @description 功能描述: post 请求
     */
    public static String post(String url, String s, String contentType, Map<String, String> header) {
        CloseableHttpClient httpClient = null;
        HttpPost httpPost = new HttpPost(url);
        String body = null;
        CloseableHttpResponse response = null;
        try {
            httpClient = HttpClients.custom()
                    .setDefaultRequestConfig(REQUEST_CONFIG)
                    .build();
            if (contentType != null && contentType.length() > 0) {
                httpPost.setHeader("Content-Type", contentType);
            }

            if (header != null && !header.isEmpty()) {
                for (Entry<String, String> entry : header.entrySet()) {
                    httpPost.setHeader(entry.getKey(), entry.getValue());
                }
            }

            httpPost.setEntity(new StringEntity(s, DEFAULT_CHARSET));
            response = httpClient.execute(httpPost);
            body = EntityUtils.toString(response.getEntity(), DEFAULT_CHARSET);
        } catch (Exception e) {
            throw new RuntimeException("http post exception", e);
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    throw new RuntimeException(null, e);
                }
            }

            if (httpClient != null) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    throw new RuntimeException(null, e);
                }
            }
        }
        return body;
    }


}
