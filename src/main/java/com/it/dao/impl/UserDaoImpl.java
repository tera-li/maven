package com.it.dao.impl;

import com.it.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("UserDao on save");
    }
}
