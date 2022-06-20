package com.equne.onlinevideo.controller;

import com.equne.onlinevideo.entity.*;
import com.equne.onlinevideo.service.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PageController {


    @Autowired
    CourseTopicService courseTopicService;

    @Autowired
    BannerService bannerService;

    @Autowired
    CourseTypeService courseTypeService;

    @Autowired
    ToolsItemService toolsItemService;

    @Autowired
    ToolsTypeService toolsTypeService;

    //首页
    @RequestMapping(value = "/")
    public String indexPage(Model model) {

        // 设置导航条当前焦点位置
        model.addAttribute("focusIndex", 1);

        // 获取首页数据

        // banner
        List<Banner> bannerList = bannerService.getIndexBanner();

        // 最新
        // 设置分页 第几页，显示N个
        PageHelper.startPage(1, 4);
        PageInfo<CourseTopic> newsetTopicList = courseTopicService.getIndexNewestTopic();
        // type=3
        // 设置分页 第几页，显示N个
        PageHelper.startPage(1, 4);
        PageInfo<CourseTopic> courseTopicList = courseTopicService.getIndexCourseTopic(3);

        model.addAttribute("newsetTopicList", newsetTopicList);
        model.addAttribute("courseTopicList", courseTopicList);
        model.addAttribute("bannerList", bannerList);

        return "index";
    }


    // vip
    @RequestMapping(value = "/vip")
    public String vip(Model model) {
        model.addAttribute("focusIndex", 3);
        return "vip";
    }

    //课程列表，显示所有分类
    @RequestMapping(value = "/courseList")
    public String courseList(Model model) {
        model.addAttribute("focusIndex", 2);
        model.addAttribute("typeId", 0);
        // 最新
        // 设置分页 第几页，显示N个
        PageHelper.startPage(1, 16);
        PageInfo<CourseTopic> newsetTopicList = courseTopicService.getIndexNewestTopic();
        model.addAttribute("topicList", newsetTopicList);

        List<CourseType> courseTypeList = courseTypeService.getCourseTypeAll();
        model.addAttribute("courseTypeList", courseTypeList);

        return "course_list";
    }

    //课程列表，显示所有分类
    @RequestMapping(value = "/courseList/type/{typeId}")
    public String courseList(@PathVariable Integer typeId, Model model, Integer pageNum) {
        model.addAttribute("typeId", typeId);
        model.addAttribute("focusIndex", 2);

        if (pageNum == null || pageNum <= 1) {
            pageNum = 1;
        }

        List<CourseType> courseTypeList = courseTypeService.getCourseTypeAll();
        model.addAttribute("courseTypeList", courseTypeList);

        PageHelper.startPage(pageNum, 16);

        PageInfo<CourseTopic> courseTopicList = null;
        if (typeId == 0) {
            // 最新专题
            courseTopicList = courseTopicService.getIndexNewestTopic();
        } else {
            // 对应类型专题
            courseTopicList = courseTopicService.getIndexCourseTopic(typeId);
        }

        model.addAttribute("topicList", courseTopicList);

        return "course_list";
    }

    //工具
    @RequestMapping(value = "/tools")
    public String toolsPage(Model model) {
        model.addAttribute("focusIndex", 5);
        model.addAttribute("toolsTypeId", 0);
        // 最新
        // 设置分页 第几页，显示N个
        PageHelper.startPage(1, 16);
        PageInfo<ToolsItem> toolsList = toolsItemService.getToolsItemAll();
        model.addAttribute("toolsList", toolsList);

        List<ToolsType> toolsTypeList = toolsTypeService.getToolsTypeAll();
        model.addAttribute("toolsTypeList", toolsTypeList);

        return "tools";
    }


    //课程列表，显示所有分类
    @RequestMapping(value = "/toolsList/type/{toolsTypeId}")
    public String toolsList(@PathVariable Integer toolsTypeId, Model model, Integer pageNum) {
        model.addAttribute("toolsTypeId", toolsTypeId);
        model.addAttribute("focusIndex", 5);

        if (pageNum == null || pageNum <= 1) {
            pageNum = 1;
        }

        List<ToolsType> toolsTypeList = toolsTypeService.getToolsTypeAll();
        model.addAttribute("toolsTypeList", toolsTypeList);

        PageHelper.startPage(pageNum, 16);

        PageInfo<ToolsItem> toolsList = null;
        if (toolsTypeId == 0) {
            // 最新
            toolsList = toolsItemService.getToolsItemAll();

        } else {
            // 对应类型
            toolsList = toolsItemService.getToolsItem(toolsTypeId);
        }

        model.addAttribute("toolsList", toolsList);

        return "tools";
    }

    // 直播
    @RequestMapping(value = "/live")
    public String livePage(Model model) {
        model.addAttribute("focusIndex", 4);
        return "redirect:https://search.bilibili.com/live?keyword=%E7%BC%96%E7%A8%8B&focusIndex=4";
    }

}
