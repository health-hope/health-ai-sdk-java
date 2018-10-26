package com.jiankangyouyi.health.ai.api.request;

import java.math.BigDecimal;

import com.jiankangyouyi.health.ai.api.HealthAiRequest;
import com.jiankangyouyi.health.ai.api.response.SportSubjectQueryResponse;

/**
 * 运动课程查询
 * 
 * @see /v2/sports/course/video/query.do
 * @author yangsongbo
 *
 */
public class SportSubjectQueryRequest extends HealthAiRequest<SportSubjectQueryResponse> {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 请求链接
	 */
	private static final String API_URL = "/v2/sports/course/video/query.do";
	

	/**
	 * 课程ID
	 */
    private String courseId;

    /**
     * 性别 1男 2 女
     */
    private String gender;
    
    /**
     * 体重
     */
    private BigDecimal weight;
    

    
    @Override
	public String getApiUrl() {
		return API_URL;
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

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    
    @Override
    public void check() {
    }
}
