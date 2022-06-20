package com.equne.onlinevideo.service.impl;

import com.equne.onlinevideo.dao.CourseTypeDao;
import com.equne.onlinevideo.entity.CourseType;
import com.equne.onlinevideo.entity.User;
import com.equne.onlinevideo.service.CourseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseTypeServiceImpl implements CourseTypeService {

    @Autowired
    CourseTypeDao courseTypeDao;

    @Override
    public int insertCourseType(CourseType courseType) {
        return courseTypeDao.insertCourseType(courseType);
    }

    @Override
    public List<CourseType> getCourseTypeAll() {
        return courseTypeDao.findCourseTypeAll();
    }

    @Override
    public CourseType getCourseType() {
        return null;
    }

    @Override
    public int delete(Integer uid) {
        return 0;
    }
}
