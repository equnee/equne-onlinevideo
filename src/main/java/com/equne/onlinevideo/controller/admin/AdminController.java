package com.equne.onlinevideo.controller.admin;


import com.equne.onlinevideo.entity.CourseType;
import com.equne.onlinevideo.entity.User;
import com.equne.onlinevideo.service.CourseTypeService;
import com.equne.onlinevideo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    UserService userService;

    @Autowired
    CourseTypeService courseTypeService;

    @RequestMapping("/admin")
    public String adminPage(Model model) {

        PageHelper.startPage(1, 8);
        PageInfo<User> userList = userService.getUserList();
        model.addAttribute("userList", userList);
        PageInfo<CourseType> courseTypeList = courseTypeService.getCourseType();
        model.addAttribute("coursetypeList", courseTypeList);

        return "admin_main";
    }

    //用户列表，显示所有分类
    @RequestMapping(value = "/admin/user")
    public String user(Model model, Integer pageNum) {

        if (pageNum == null || pageNum <= 1) {
            pageNum = 1;
        }

        PageHelper.startPage(pageNum, 8);

        PageInfo<User> userList = userService.getUserList();
        model.addAttribute("userList", userList);

        return "admin_main";
    }

    // 删除用户
    @RequestMapping(value = "/admin/userDel/{uid}")
    public String userDel(@PathVariable Integer uid, Model model, Integer pageNum) {

        int code = userService.delete(uid);
        if (pageNum == null || pageNum <= 1) {
            pageNum = 1;
        }
        return "redirect:/admin/user?pageNum=" + pageNum;
    }

    // 显示更新用户页面
    @RequestMapping(value = "/admin/updatePage/{uid}")
    public String updatePage(@PathVariable Integer uid, Model model) {

        User user = userService.getUser(uid);


        model.addAttribute("user", user);

        return "admin_update_user";
    }

    // 处理用户更新请求
    @RequestMapping(value = "/admin/updateUser", method = RequestMethod.POST)
    public String updatePage(User user) {

        int code = userService.updateUser(user);

        return "redirect:/admin/user";
    }


    // 新增用户
    @RequestMapping(value = "/admin/addUser", method = RequestMethod.POST)
    public String insertUser(User user) {

        int code = userService.updateUser(user);

        return "redirect:/admin/user";
    }




    // ------------------------------------------------------------

    //用户列表，显示所有分类
    @RequestMapping(value = "/admin/admin_course_type")
    public String courseType(Model model, Integer pageNum) {

        if (pageNum == null || pageNum <= 1) {
            pageNum = 1;
        }

        PageHelper.startPage(pageNum, 8);

        List<CourseType> courseType = courseTypeService.getCourseTypeAll();
        model.addAttribute("coursetypeList", courseType);

        return "admin_course_type";
    }

    // 删除用户
    @RequestMapping(value = "/admin/courseTypeDel/{ctid}")
    public String courseTypeDel(@PathVariable Integer ctid, Model model, Integer pageNum) {

        int code = courseTypeService.delete(ctid);
        if (pageNum == null || pageNum <= 1) {
            pageNum = 1;
        }
        return "redirect:/admin/coursetype?pageNum=" + pageNum;
    }

    // 显示更新用户页面
    @RequestMapping(value = "/admin/updateCtPage/{ctid}")
    public String updateCtPage(@PathVariable Integer ctid, Model model) {

        CourseType courseType = (CourseType) courseTypeService.getCourseTypeAll();


        model.addAttribute("couseType", courseType);

        return "admin_update_user";
    }

    // 处理用户更新请求
    @RequestMapping(value = "/admin/updateCourseType", method = RequestMethod.POST)
    public String updateCtPage(User user) {

        int code = userService.updateUser(user);

        return "redirect:/admin/coure_type";
    }


    // 新增用户

}
