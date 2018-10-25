package com.jiankangyouyi.health.ai.api.request;

import java.math.BigDecimal;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.PageInfo;
import com.jiankangyouyi.health.ai.api.response.SportSubjectListResponse;



/**
 * 运动专题列表
 * 
 * @see /v2/sports/subject/list.do
 * @author yangsongbo
 *
 */
public class SportSubjectListRequest extends HealthAiRequest<SportSubjectListResponse> {
    
	private static final long serialVersionUID = 1L;

	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/sports/subject/list.do";
	
	/**
	 * 专题类型，非必输
	 * </p>
	 * 1 腰腹 2 臀腿 3 手臂 4 背部 5 燃脂 6 热身拉伸 7 新手起航 8 进阶提升 
	 * 9 女生精选 10 女神养成 11 男生热门 12 跑步必备 13 办公室专题
	 */
    private String sportSubject;

    /**
     * 专题名称，非必输
     */
    private String subjectName;
    /**
     * 性别 
     * </p>
     * 1 男 2 女
     * </p>
     * 需要返回课程卡路里时必输
     */
    private String gender;
    
    /**
     * 体重
     * </p>
     * 需要返回课程卡路里时必输
     */
    private BigDecimal weight;

    /**
     * 分页信息
     */
    private PageInfo pageInfo;
    
    
    
    @Override
	public String getApiUrl() {
		return API_URL;
	}
	

    public String getSportSubject() {
        return sportSubject;
    }

    public void setSportSubject(String sportSubject) {
        this.sportSubject = sportSubject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public void check() {
    }
}
