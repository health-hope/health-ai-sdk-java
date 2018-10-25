package com.jiankangyouyi.health.ai.api.response;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

import cn.jianzhishidai.core.annotations.JavaBean;

/**
 * 运动课程查询
 * 
 * @see /v2/sports/course/video/query.do
 * @author yangsongbo
 *
 */
@JavaBean
public class SportSubjectQueryResponse extends HealthAiResponse {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 课程ID
	 */
    private String courseId;
    
    /**
     * 课程名称
     */
    private String courseName;
    
    /**
     * 难度
     * </p>
     * 1 一级难度 2 二级难度 3 三级难度 4 四级难度 5 五级难度
     */
    private String difficulty;
    
    /**
     * 动作数
     */
    private int actionCount;
    
    /**
     * 课程时长，单位分钟
     */
    private String courseTimeLen;
    
    /**
     * 卡路里
     */
    private Integer courseCalorie;
    
    /**
     * 视频URL
     */
    private String videoUrl;
    
    /**
     * 动作列表
     */
    private List<SportAction> actionList;

  
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getActionCount() {
        return actionCount;
    }

    public void setActionCount(int actionCount) {
        this.actionCount = actionCount;
    }

    public String getCourseTimeLen() {
        return courseTimeLen;
    }

    public void setCourseTimeLen(String courseTimeLen) {
        this.courseTimeLen = courseTimeLen;
    }

    public Integer getCourseCalorie() {
        return courseCalorie;
    }

    public void setCourseCalorie(Integer courseCalorie) {
        this.courseCalorie = courseCalorie;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public List<SportAction> getActionList() {
        return actionList;
    }

    public void setActionList(List<SportAction> actionList) {
        this.actionList = actionList;
    }

    /**
     * 动作信息
     * @author yangsongbo
     *
     */
    public static class SportAction {
    	/**
    	 * 序号
    	 */
        private Integer sequence;
        
        /**
         * 时长，单位毫秒
         */
        private Long actionTimeLen;
        
        /**
         * 动作图片URL
         */
        private String ationImageUrl;
        
        /**
         * 动作名称
         */
        private String actionName;

        public Long getActionTimeLen() {
            return actionTimeLen;
        }

        public void setActionTimeLen(Long actionTimeLen) {
            this.actionTimeLen = actionTimeLen;
        }

        public String getAtionImageUrl() {
            return ationImageUrl;
        }

        public void setAtionImageUrl(String ationImageUrl) {
            this.ationImageUrl = ationImageUrl;
        }

        public String getActionName() {
            return actionName;
        }

        public void setActionName(String actionName) {
            this.actionName = actionName;
        }

        public Integer getSequence() {
            return sequence;
        }

        public void setSequence(Integer sequence) {
            this.sequence = sequence;
        }
    }

}