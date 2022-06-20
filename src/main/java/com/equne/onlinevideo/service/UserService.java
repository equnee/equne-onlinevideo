package com.equne.onlinevideo.service;

import com.equne.onlinevideo.entity.User;
import com.github.pagehelper.PageInfo;

public interface UserService {

    User login(User user);

    int regist(User user);

    User existEmail(String email);

    PageInfo<User> getUserList();

    int delete(int uid);

    User getUser(int uid);

    int updateUser(User user);


}
