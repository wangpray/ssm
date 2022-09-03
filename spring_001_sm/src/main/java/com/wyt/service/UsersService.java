package com.wyt.service;

import com.wyt.pojo.Users;

import java.util.List;

public interface UsersService {
    List<Users> getAll();
    int insert(Users u);
}
