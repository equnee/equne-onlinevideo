package com.equne.onlinevideo.dao;

import com.equne.onlinevideo.entity.CourseType;

import java.util.List;


public interface CourseTypeDao {

    int insertCourseType(CourseType courseType);

    List<CourseType> findCourseTypeAll();
}
