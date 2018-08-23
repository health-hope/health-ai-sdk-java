package com.jiankangyouyi.health.ai.api.bean.evaluation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 评测结果-相关检查
 * 
 * @author yangsongbo
 *
 */
public class EvaluationPhysicalExamBean {

	/**
	 * 相关检查内容
	 */
	private List<EvaluationTemplateBean> content;

	public List<EvaluationTemplateBean> getContent() {
		return content;
	}

	public void setContent(List<EvaluationTemplateBean> content) {
		this.content = content;
	}

	public String toString() {
		String sep = "; ";
		StringBuffer sb = new StringBuffer();
		sb.append("EvaluationPhysicalExamBean").append(":");
		sb.append("[content]").append(" = ").append(getContent()).append(sep);
		return sb.toString();
	}

	public Map<String, Object> putFieldValueToMap() {
		Map<String, Object> map_ = new HashMap<String, Object>();
		map_.put("content", getContent());
		return map_;
	}

	@SuppressWarnings("unchecked")
	public void doMapToDtoValue(Map<String, Object> map, boolean isDealNull) {
		if (null != map.get("content")) {
			this.setContent((List<EvaluationTemplateBean>) map.get("content"));
		} else {
			if (isDealNull && map.containsKey("content"))
				this.setContent((List<EvaluationTemplateBean>) map.get("content"));
		}
	}

	public static final String field_content = "content";

}
