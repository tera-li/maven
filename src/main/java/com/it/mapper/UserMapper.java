package com.it.mapper;

import com.it.user.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> selectAll();
    List<User> selectAllList();
    List<User> selectOne(int id);
    List<User> selectCondition(User user);
    List<User> selectConditionMap(Map map);
}
