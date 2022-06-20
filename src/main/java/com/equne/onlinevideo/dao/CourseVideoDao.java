package com.equne.onlinevideo.dao;

import com.equne.onlinevideo.entity.CourseVideo;

import java.util.HashMap;
import java.util.List;

public interface CourseVideoDao {

    int insertCourseVideo(CourseVideo courseVideo);

    List<CourseVideo> findCourseVideoByCondition(HashMap<String, Object> map);

    CourseVideo findCourseVideoByIds(List<Integer> ids);
}
