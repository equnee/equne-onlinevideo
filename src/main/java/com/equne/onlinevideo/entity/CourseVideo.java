package com.equne.onlinevideo.entity;

import java.util.Date;

public class CourseVideo implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8893445070870758344L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** id */
    private Integer id;

    /** name */
    private String name;

    /** freeView */
    private Integer freeView;

    /** topicId */
    private Integer topicId;

    /** flag */
    private Integer flag;

    /** videoUrl1 */
    private String videoUrl1;

    /** videoUrl2 */
    private String videoUrl2;

    /** createTime */
    private Date createTime;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取id
     * 
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置id
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取name
     * 
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取freeView
     * 
     * @return freeView
     */
    public Integer getFreeView() {
        return this.freeView;
    }

    /**
     * 设置freeView
     * 
     * @param freeView
     */
    public void setFreeView(Integer freeView) {
        this.freeView = freeView;
    }

    /**
     * 获取topicId
     * 
     * @return topicId
     */
    public Integer getTopicId() {
        return this.topicId;
    }

    /**
     * 设置topicId
     * 
     * @param topicId
     */
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    /**
     * 获取flag
     * 
     * @return flag
     */
    public Integer getFlag() {
        return this.flag;
    }

    /**
     * 设置flag
     * 
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * 获取videoUrl1
     * 
     * @return videoUrl1
     */
    public String getVideoUrl1() {
        return this.videoUrl1;
    }

    /**
     * 设置videoUrl1
     * 
     * @param videoUrl1
     */
    public void setVideoUrl1(String videoUrl1) {
        this.videoUrl1 = videoUrl1;
    }

    /**
     * 获取videoUrl2
     * 
     * @return videoUrl2
     */
    public String getVideoUrl2() {
        return this.videoUrl2;
    }

    /**
     * 设置videoUrl2
     * 
     * @param videoUrl2
     */
    public void setVideoUrl2(String videoUrl2) {
        this.videoUrl2 = videoUrl2;
    }

    /**
     * 获取createTime
     * 
     * @return createTime
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置createTime
     * 
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}