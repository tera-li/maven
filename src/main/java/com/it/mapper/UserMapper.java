package com.it.mapper;

import com.it.user.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
    List<User> selectAllList();
    List<User> selectOne(int id);
}
