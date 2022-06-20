package com.equne.onlinevideo.service.impl;


import com.equne.onlinevideo.dao.UserDao;
import com.equne.onlinevideo.entity.CourseTopic;
import com.equne.onlinevideo.entity.User;
import com.equne.onlinevideo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserDao userDao;


    @Override
    public User login(User user) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("email", user.getEmail());
        map.put("password", user.getPassword());
        return userDao.findUserByCondition(map);
    }

    @Override
    public int regist(User user) {
        user.setCreateTime(new Date());
        user.setVipFlag(0);
        return userDao.insertUser(user);
    }

    @Override
    public User existEmail(String email) {

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("email", email);

        return userDao.findUserByCondition(map);
    }

    @Override
    public PageInfo<User> getUserList() {


        List<User> list = userDao.findUserAll();

        // TODO 2
        // TODO 3 MYBATIS 配置文件拦截器
        PageInfo<User> pageInfo = new PageInfo<>(list, 4);

        return pageInfo;
    }

    @Override
    public int delete(int uid) {

        User user = getUser(uid);
        user.setFlag(0);

        return userDao.updateUser(user);
    }

    @Override
    public User getUser(int uid) {
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(uid);

        return userDao.findUserByIds(ids);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }
}
