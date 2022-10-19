package com.it;

import com.it.mapper.UserMapper;
import com.it.user.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        // mapper代理
//        UserMapper users = session.getMapper(UserMapper.class);
//        List<User> userList = users.selectAll();
        // 静态
        List<User> userList = session.selectList("com.it.mapper.UserMapper.selectAll");
        System.out.println("查到了");
        System.out.println(userList);
        session.close();
    }
}
