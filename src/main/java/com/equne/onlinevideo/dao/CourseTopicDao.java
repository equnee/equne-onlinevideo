package com.equne.onlinevideo.dao;

import com.equne.onlinevideo.entity.CourseTopic;

import java.util.HashMap;
import java.util.List;

public interface CourseTopicDao {

    int insertCourseTopic(CourseTopic courseTopic);


    List<CourseTopic> findCourseTopicByCondition(HashMap<String, Object> map);


    List<CourseTopic> findCourseTopicByIds(List<Integer> ids);

}
