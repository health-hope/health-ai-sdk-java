package com.jiankangyouyi.health.ai.api.response;

import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;
import com.jiankangyouyi.health.ai.api.PageInfo;

/**
 * 运动专题列表
 * 
 * @see /v2/sports/subject/list.do
 * @author yangsongbo
 *
 */
public class SportSubjectListResponse extends HealthAiResponse {
	
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 分页信息
	 */
    private PageInfo pageInfo;

    
    /**
     * 专题列表
     */
    private List<SportSubject> subjectList;

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<SportSubject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<SportSubject> subjectList) {
        this.subjectList = subjectList;
    }

    
    /**
     * 运动专题信息
     * @author yangsongbo
     *
     */
    public static class SportSubject {
    	
    	/**
    	 * 专题ID
    	 */
        private String subjectId;
        
        /**
         * 专题标题
         */
        private String subjectTitle;
        
        /**
         * 课程节数
         */
        private Integer courseCount;
        
        /**
         * 课程难度
         * </p>
         * 1 一级难度 2 二级难度 3 三级难度 4 四级难度 5 五级难度
         */
        private String difficulty;
        
        /**
         * 专题标签
         * </p>
         * 如：腰腹塑形 无器械
         */
        private String subjectTag;
        
        /**
         * 专题图片
         */
        private String subjectImageUrl;
        
        /**
         * 专题介绍
         */
        private String summary;
        
        /**
         * 注意事项
         */
        private List<String> attentions;
        
        /**
         * 课程列表
         */
        private List<SportCourse> courseList;

        public String getSubjectId() {
            return subjectId;
        }

        public void setSubjectId(String subjectId) {
            this.subjectId = subjectId;
        }

        public String getSubjectTitle() {
            return subjectTitle;
        }

        public void setSubjectTitle(String subjectTitle) {
            this.subjectTitle = subjectTitle;
        }

        public Integer getCourseCount() {
            return courseCount;
        }

        public void setCourseCount(Integer courseCount) {
            this.courseCount = courseCount;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public void setDifficulty(String difficulty) {
            this.difficulty = difficulty;
        }

        public String getSubjectTag() {
            return subjectTag;
        }

        public void setSubjectTag(String subjectTag) {
            this.subjectTag = subjectTag;
        }

        public String getSubjectImageUrl() {
            return subjectImageUrl;
        }

        public void setSubjectImageUrl(String subjectImageUrl) {
            this.subjectImageUrl = subjectImageUrl;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<String> getAttentions() {
            return attentions;
        }

        public void setAttentions(List<String> attentions) {
            this.attentions = attentions;
        }

        public List<SportCourse> getCourseList() {
            return courseList;
        }

        public void setCourseList(List<SportCourse> courseList) {
            this.courseList = courseList;
        }

        /**
         * 课程信息
         * @author yangsongbo
         *
         */
        public static class SportCourse {
        	
        	/**
        	 * 序号
        	 */
            private Integer sequence;
            
            /**
             * 课程ID
             */
            private String courseId;
            
            /**
             * 课程名称
             */
            private String courseName;
            
            /**
             * 课程图片
             */
            private String courseImageUrl;
            
            /**
             * 课程时长 单位 秒
             */
            private String courseTimeLen;
            
            /**
             * 卡路里，单位 大卡
             */
            private String courseCalorie;

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

            public String getCourseImageUrl() {
                return courseImageUrl;
            }

            public void setCourseImageUrl(String courseImageUrl) {
                this.courseImageUrl = courseImageUrl;
            }

            public String getCourseTimeLen() {
                return courseTimeLen;
            }

            public void setCourseTimeLen(String courseTimeLen) {
                this.courseTimeLen = courseTimeLen;
            }

            public String getCourseCalorie() {
                return courseCalorie;
            }

            public void setCourseCalorie(String courseCalorie) {
                this.courseCalorie = courseCalorie;
            }

            public Integer getSequence() {
                return sequence;
            }

            public void setSequence(Integer sequence) {
                this.sequence = sequence;
            }
        }
    }
}