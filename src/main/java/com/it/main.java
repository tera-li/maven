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
        // 记载核心配置
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        // 执行sql
        // List<User> userList = session.selectList("com.it.mapper.UserMapper.selectAll");
        // 获取mapper接口的代理对象
        UserMapper users = session.getMapper(UserMapper.class);
        // 实现代理接口
        List<User> userList = users.selectAll();
        System.out.println("查到了");
        System.out.println(userList);
        session.close();
    }
}
