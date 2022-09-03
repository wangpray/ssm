package com.wyt.mapper;

import com.wyt.pojo.Users;

import java.util.List;

public interface UsersMapper {
    List<Users> getAll();
    int insert(Users users);
    int delete(Integer uid);
}
