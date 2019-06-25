package com.jiankangyouyi.health.ai.api.enums;

/**
 * 版本号
 *
 * @author yangsongbo
 */
public enum Version {

    /**
     * 1.0版本
     */
    VERSION_1_0("1.0"),

    /**
     * 2.0版本
     */
    VERSION_2_0("2.0");

    Version(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
