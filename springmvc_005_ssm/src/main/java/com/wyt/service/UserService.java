package com.wyt.service;

import com.wyt.pojo.User;

import java.util.List;

public interface UserService {

    List<User> selectUserPage(String userName, String userSex, Integer page, int pageSize);

    int getRowCount(String userName,String userSex);

    int deleteUserById(String userId);

    int createUser(User user);

    int updateUserById(User user);
}
