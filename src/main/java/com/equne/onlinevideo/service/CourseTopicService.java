package com.equne.onlinevideo.service;

import com.equne.onlinevideo.entity.CourseTopic;
import com.github.pagehelper.PageInfo;

public interface CourseTopicService {

    PageInfo<CourseTopic> getIndexCourseTopic(int typeId);

    PageInfo<CourseTopic> getIndexNewestTopic();


    CourseTopic getCourseTopic(int topicId);

    // 根据用户指定名字 搜索视频
    PageInfo<CourseTopic> searchCourseTopic(String keyword);
}
