package com.equne.onlinevideo.dao;

import com.equne.onlinevideo.entity.User;

import java.util.HashMap;
import java.util.List;

public interface UserDao {

    int insertUser(User user);

    User findUserByCondition(HashMap<String, Object> map);

    List<User> findUserAll();

    int updateUser(User user);

    User findUserByIds(List<Integer> ids);
}
