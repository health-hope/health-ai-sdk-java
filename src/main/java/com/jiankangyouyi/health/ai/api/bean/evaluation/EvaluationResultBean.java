package com.jiankangyouyi.health.ai.api.bean.evaluation;

import java.util.HashMap;
import java.util.Map;

/**
 * 评测结果
 * @author yangsongbo
 *
 */
public class EvaluationResultBean {

	/**
	 * 评测报告
	 */
	private EvaluationReportBean evaluationReport;
	
	/**
	 * 管理方案
	 */
	private EvaluationManagementPlanBean managementPlan;
	
	/**
	 * 相关检查
	 */
	private EvaluationPhysicalExamBean physicalExam;

	

	public EvaluationReportBean getEvaluationReport() {
		return evaluationReport;
	}

	public void setEvaluationReport(EvaluationReportBean evaluationReport) {
		this.evaluationReport = evaluationReport;
	}

	public EvaluationPhysicalExamBean getPhysicalExam() {
		return physicalExam;
	}

	public void setPhysicalExam(EvaluationPhysicalExamBean physicalExam) {
		this.physicalExam = physicalExam;
	}
	
    public EvaluationManagementPlanBean getManagementPlan() {
		return managementPlan;
	}

	public void setManagementPlan(EvaluationManagementPlanBean managementPlan) {
		this.managementPlan = managementPlan;
	}



    public String toString(){
        String sep = "; ";
        StringBuffer sb = new StringBuffer();
        sb.append("EvaluationResultBean").append(":");
        sb.append("[evaluationReport]").append(" = ").append(getEvaluationReport()).append(sep);
        sb.append("[managementPlan]").append(" = ").append(getManagementPlan()).append(sep);
        sb.append("[physicalExam]").append(" = ").append(getPhysicalExam()).append(sep);
        return sb.toString();
    }


    public Map<String,Object> putFieldValueToMap() {
   		Map<String,Object> map_=new HashMap<String,Object>();
    	map_.put("evaluationReport",getEvaluationReport());
    	map_.put("managementPlan",getManagementPlan());
    	map_.put("physicalExam",getPhysicalExam());
		return map_;
    }


    public void doMapToDtoValue(Map<String, Object> map,boolean isDealNull) {
    	if(null!=map.get("evaluationReport")){
    		this.setEvaluationReport((EvaluationReportBean)map.get("evaluationReport"));
    	}else{
    		if(isDealNull && map.containsKey("evaluationReport"))
    			this.setEvaluationReport((EvaluationReportBean)map.get("evaluationReport"));
    	}	
    	if(null!=map.get("managementPlan")){
    		this.setManagementPlan((EvaluationManagementPlanBean)map.get("managementPlan"));
    	}else{
    		if(isDealNull && map.containsKey("managementPlan"))
    			this.setManagementPlan((EvaluationManagementPlanBean)map.get("managementPlan"));
    	}	
    	if(null!=map.get("physicalExam")){
    		this.setPhysicalExam((EvaluationPhysicalExamBean)map.get("physicalExam"));
    	}else{
    		if(isDealNull && map.containsKey("physicalExam"))
    			this.setPhysicalExam((EvaluationPhysicalExamBean)map.get("physicalExam"));
    	}	
    }


    public static final String field_evaluationReport = "evaluationReport";
    public static final String field_managementPlan = "managementPlan";
    public static final String field_physicalExam = "physicalExam";

}
