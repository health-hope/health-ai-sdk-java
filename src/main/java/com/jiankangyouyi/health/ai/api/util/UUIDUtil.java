package com.jiankangyouyi.health.ai.api.util;

import java.util.UUID;

public final class UUIDUtil {

	public static String getJavaUUID(){
		return UUID.randomUUID().toString().replace("-", "");
	}
}
