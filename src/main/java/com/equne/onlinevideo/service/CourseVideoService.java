package com.equne.onlinevideo.service;

import com.equne.onlinevideo.entity.CourseVideo;

import java.util.List;

public interface CourseVideoService {

    List<CourseVideo> getCourseVideoAll(int topicId);

    CourseVideo getCourseVideo(int vid);

}
