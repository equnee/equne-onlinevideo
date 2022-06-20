package com.equne.onlinevideo.service;

import com.equne.onlinevideo.entity.CourseType;

import java.util.List;

public interface CourseTypeService {

    int insertCourseType(CourseType courseType);
    
    List<CourseType> getCourseTypeAll();

    CourseType getCourseType();

    int delete(Integer uid);
}
