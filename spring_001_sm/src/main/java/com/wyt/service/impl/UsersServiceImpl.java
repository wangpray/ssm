package com.wyt.service.impl;

import com.wyt.mapper.UsersMapper;
import com.wyt.pojo.Users;
import com.wyt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersMapper usersMapper;


    @Override
    public List<Users> getAll() {
        return usersMapper.getAll();
    }

    @Override
    public int insert(Users u) {
        int num = usersMapper.insert(u);
        System.out.println("成功添加用户");
        return num;
    }
}
