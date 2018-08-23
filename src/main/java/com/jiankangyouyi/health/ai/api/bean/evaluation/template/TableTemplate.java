package com.jiankangyouyi.health.ai.api.bean.evaluation.template;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 表格数据模板 : TABLE_TEMPLATE
 * 
 * 
 * @author yangsongbo
 *
 */
public class TableTemplate implements IEvaluationTemplate {

	/**
	 * 行数据
	 */
	private List<TableRow> rows;

	public List<TableRow> getRows() {
		return rows;
	}

	public void setRows(List<TableRow> rows) {
		this.rows = rows;
	}

	public static class TableRow {
		/**
		 * 单元格
		 */
		private List<TableCell> cells;
		
		
		public TableRow() {
			super();
		}

		public TableRow(List<TableCell> cells) {
			super();
			this.cells = cells;
		}

		public List<TableCell> getCells() {
			return cells;
		}

		public void setCells(List<TableCell> cells) {
			this.cells = cells;
		}

		public String toString() {
			String sep = "; ";
			StringBuffer sb = new StringBuffer();
			sb.append("TableRow").append(":");
			sb.append("[cells]").append(" = ").append(getCells()).append(sep);
			return sb.toString();
		}

		public Map<String, Object> putFieldValueToMap() {
			Map<String, Object> map_ = new HashMap<String, Object>();
			map_.put("cells", getCells());
			return map_;
		}

		@SuppressWarnings("unchecked")
		public void doMapToDtoValue(Map<String, Object> map, boolean isDealNull) {
			if (null != map.get("cells")) {
				this.setCells((List<TableCell>) map.get("cells"));
			} else {
				if (isDealNull && map.containsKey("cells"))
					this.setCells((List<TableCell>) map.get("cells"));
			}
		}

		public static final String field_cells = "cells";

	}

	public static class TableCell {

		/**
		 * 类型
		 * </p>
		 * TH 表头 TD 表格单元
		 */
		private String type;

		/**
		 * 内容
		 */
		private List<String> value;

		/**
		 * 对齐方式
		 * </p>
		 * LEFT、CENTER、RIGHT
		 */
		private String align;

		/**
		 * 跨列
		 */
		private Integer colspan;

		/**
		 * 跨行
		 */
		private Integer rowspan;

		public TableCell() {
			super();
		}

		public TableCell(String type, List<String> value, String align, Integer colspan, Integer rowspan) {
			super();
			this.type = type;
			this.value = value;
			this.align = align;
			this.colspan = colspan;
			this.rowspan = rowspan;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<String> getValue() {
			return value;
		}

		public void setValue(List<String> value) {
			this.value = value;
		}

		public String getAlign() {
			return align;
		}

		public void setAlign(String align) {
			this.align = align;
		}

		public Integer getColspan() {
			return colspan;
		}

		public void setColspan(Integer colspan) {
			this.colspan = colspan;
		}

		public Integer getRowspan() {
			return rowspan;
		}

		public void setRowspan(Integer rowspan) {
			this.rowspan = rowspan;
		}

		public String toString() {
			String sep = "; ";
			StringBuffer sb = new StringBuffer();
			sb.append("TableCell").append(":");
			sb.append("[type]").append(" = ").append(getType()).append(sep);
			sb.append("[value]").append(" = ").append(getValue()).append(sep);
			sb.append("[align]").append(" = ").append(getAlign()).append(sep);
			sb.append("[colspan]").append(" = ").append(getColspan()).append(sep);
			sb.append("[rowspan]").append(" = ").append(getRowspan()).append(sep);
			return sb.toString();
		}

		public Map<String, Object> putFieldValueToMap() {
			Map<String, Object> map_ = new HashMap<String, Object>();
			map_.put("type", getType());
			map_.put("value", getValue());
			map_.put("align", getAlign());
			map_.put("colspan", getColspan());
			map_.put("rowspan", getRowspan());
			return map_;
		}

		@SuppressWarnings("unchecked")
		public void doMapToDtoValue(Map<String, Object> map, boolean isDealNull) {
			if (null != map.get("type")) {
				this.setType((String) map.get("type"));
			} else {
				if (isDealNull && map.containsKey("type"))
					this.setType((String) map.get("type"));
			}
			if (null != map.get("value")) {
				this.setValue((List<String>) map.get("value"));
			} else {
				if (isDealNull && map.containsKey("value"))
					this.setValue((List<String>) map.get("value"));
			}
			if (null != map.get("align")) {
				this.setAlign((String) map.get("align"));
			} else {
				if (isDealNull && map.containsKey("align"))
					this.setAlign((String) map.get("align"));
			}
			if (null != map.get("colspan")) {
				this.setColspan((Integer) map.get("colspan"));
			} else {
				if (isDealNull && map.containsKey("colspan"))
					this.setColspan((Integer) map.get("colspan"));
			}
			if (null != map.get("rowspan")) {
				this.setRowspan((Integer) map.get("rowspan"));
			} else {
				if (isDealNull && map.containsKey("rowspan"))
					this.setRowspan((Integer) map.get("rowspan"));
			}
		}

		public static final String field_type = "type";
		public static final String field_value = "value";
		public static final String field_align = "align";
		public static final String field_colspan = "colspan";
		public static final String field_rowspan = "rowspan";
	}

	public String toString() {
		String sep = "; ";
		StringBuffer sb = new StringBuffer();
		sb.append("TableTemplate").append(":");
		sb.append("[rows]").append(" = ").append(getRows()).append(sep);
		return sb.toString();
	}

	public Map<String, Object> putFieldValueToMap() {
		Map<String, Object> map_ = new HashMap<String, Object>();
		map_.put("rows", getRows());
		return map_;
	}

	@SuppressWarnings("unchecked")
	public void doMapToDtoValue(Map<String, Object> map, boolean isDealNull) {
		if (null != map.get("row")) {
			this.setRows((List<TableRow>) map.get("rows"));
		} else {
			if (isDealNull && map.containsKey("rows"))
				this.setRows((List<TableRow>) map.get("rows"));
		}
	}

	public static final String field_rows = "rows";

}
