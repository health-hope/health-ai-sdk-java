package com.jiankangyouyi.health.ai.api.util.json;

import net.sf.json.util.PropertyFilter;

public class IgnorNullPropertyFilter implements PropertyFilter{

	@Override
	public boolean apply(Object arg0, String arg1, Object arg2) {
		if(arg2 == null) 
			return true;
		return false;
	}

}
