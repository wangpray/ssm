package com.wyt.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInterceptor;
import com.wyt.mapper.UserMapper;
import com.wyt.pojo.User;
import com.wyt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    // 数据访问层对象！！！  业务逻辑层搭建玩测试类
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectUserPage(String userName, String userSex, Integer page, int pageSize) {
        // 服务逻辑层实现分页的功能
        PageHelper.startPage(page, pageSize);
        // 按条件查询表格
        List<User> list = userMapper.selectUserPage(userName, userSex);
        PageInfo<User> info = new PageInfo(list);
        return info.getList();
    }

    @Override
    public int getRowCount(String userName, String userSex) {

        return userMapper.getRowCount(userName, userSex);
    }

    @Override
    public int deleteUserById(String userId) {
        return userMapper.deleteUserById(userId);
    }

    @Override
    public int createUser(User user) {
        return userMapper.createUser(user);
    }

    @Override
    public int updateUserById(User user) {
        return userMapper.updateUserById(user);
    }
}
