package com.jiankangyouyi.health.ai.api.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

import java.util.List;
import java.util.Map;

public class JsonUtil {

    private static final SerializerFeature[] features = {
            SerializerFeature.WriteNullListAsEmpty,
            SerializerFeature.WriteNullNumberAsZero,
            SerializerFeature.WriteNullStringAsEmpty,
            SerializerFeature.DisableCircularReferenceDetect,
            SerializerFeature.IgnoreNonFieldGetter
    };

    private static final SerializeConfig config = new SerializeConfig();

    static {
        config.put(java.util.Date.class, new SimpleDateFormatSerializer(
                "yyyy-MM-dd"));
        config.put(java.sql.Timestamp.class, new SimpleDateFormatSerializer(
                "yyyy-MM-dd HH:mm:ss"));
        config.put(java.sql.Date.class, new SimpleDateFormatSerializer(
                "yyyy-MM-dd"));
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }

    @SuppressWarnings("unchecked")
    public static Map<String, Object> fromJson(String json) {
        return (Map<String, Object>) JSON.parse(json);
    }


    public static String toJson(Object object) {

        return toJson(object, config, features);
    }

    public static String toJson(Object object, SerializeConfig serializeConfig, SerializerFeature[] serializeFeature) {
        return JSON.toJSONString(object, serializeConfig, serializeFeature);
    }

    public static <T> List<T> jsonToList(String jsonString, Class<T> clazz) {
        List<T> list = JSON.parseArray(jsonString, clazz);
        return list;
    }

    public static String formatJson(String jsonStr) {
        if (null == jsonStr || "".equals(jsonStr)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char last = '\0';
        char current = '\0';
        int indent = 0;
        for (int i = 0; i < jsonStr.length(); i++) {
            last = current;
            current = jsonStr.charAt(i);
            switch (current) {
                case '{':
                    sb.append(current);
                    sb.append('\n');
                    indent++;
                    addIndentBlank(sb, indent);
                    break;
                case '[':
                    sb.append(current);
                    if (jsonStr.charAt(i + 1) == '{') {
                        sb.append('\n');
                        indent++;
                        addIndentBlank(sb, indent);
                    }
                    break;
                case '}':
                    sb.append('\n');
                    indent--;
                    addIndentBlank(sb, indent);
                    sb.append(current);
                    break;
                case ']':
                    sb.append(current);
                    if (jsonStr.charAt(i - 1) == '}') {
                        sb.append('\n');
                        indent--;
                        addIndentBlank(sb, indent);
                    }
                    break;
                case ',':
                    sb.append(current);
                    if (last != '\\' && jsonStr.charAt(i + 1) == '"') {
                        sb.append('\n');
                        addIndentBlank(sb, indent);
                    }
                    break;
                default:
                    sb.append(current);
            }
        }

        return sb.toString();
    }

    private static void addIndentBlank(StringBuilder sb, int indent) {
        for (int i = 0; i < indent; i++) {
            sb.append('\t');
        }
    }
}
