package com.equne.onlinevideo.service.impl;

import com.equne.onlinevideo.dao.CourseTopicDao;
import com.equne.onlinevideo.entity.CourseTopic;
import com.equne.onlinevideo.service.CourseTopicService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Service
public class CourseTopicServiceImpl implements CourseTopicService {

    @Autowired
    CourseTopicDao courseTopicDao;

    @Override
    public PageInfo<CourseTopic> getIndexCourseTopic(int typeId) {

        HashMap<String, Object> map = new HashMap<>();
        // 类型ID
        map.put("typeId", typeId);
        // flag=1
        map.put("flag", 1);

        List<CourseTopic> list = courseTopicDao.findCourseTopicByCondition(map);

        PageInfo<CourseTopic> pageInfo = new PageInfo<>(list, 4);

        return pageInfo;
    }

    @Override
    public PageInfo<CourseTopic> getIndexNewestTopic() {
        // TODO 1

        HashMap<String, Object> map = new HashMap<>();
        // 排序 ==1 倒序 desc
        map.put("order", 1);
        // flag=1
        map.put("flag", 1);
        List<CourseTopic> list = courseTopicDao.findCourseTopicByCondition(map);

        // TODO 2
        // TODO 3 MYBATIS 配置文件拦截器
        PageInfo<CourseTopic> pageInfo = new PageInfo<>(list, 4);

        return pageInfo;

    }

    @Override
    public CourseTopic getCourseTopic(int topicId) {
        List<Integer> ids = new ArrayList<>();
        ids.add(topicId);
        List<CourseTopic> list = courseTopicDao.findCourseTopicByIds(ids);
        return list.get(0);
    }

    public PageInfo<CourseTopic> searchCourseTopic(String keyword) {

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("topicName", keyword);
        map.put("flag", 1);

        List<CourseTopic> list = courseTopicDao.findCourseTopicByCondition(map);

        PageInfo<CourseTopic> pageInfo = new PageInfo<CourseTopic>(list);

        return pageInfo;
    }
}
