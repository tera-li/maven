package com.it;

import com.it.mapper.UserMapper;
import com.it.user.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) throws IOException {
        // 加载核心配置
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession(true);
        // 执行sql
        // List<User> userList = session.selectList("com.it.mapper.UserMapper.selectAll");
        // 获取mapper接口的代理对象
        UserMapper users = session.getMapper(UserMapper.class);
        // 实现代理接口
        // 查询逻辑
        // 实体类封装参数
        User user = new User();
        user.setRunoob_id(2);
        user.setRunoob_title("111m");
        // map集合封装
        Map map = new HashMap();
        map.put("runoob_id", 2);
        map.put("runoob_title", "111m");
        List<User> userList1 = users.selectAll();
        List<User> userList2 = users.selectAllList();
        List<User> userList3 = users.selectOne(2);
        List<User> userList4 = users.selectCondition(user);
        List<User> userList5 = users.selectConditionMap(map);
        List<User> userList6 = users.selectConditionChoose(map);
        System.out.println("查到了");
        System.out.println(userList1);
        System.out.println(userList2);
        System.out.println(userList3);
        System.out.println(userList4);
        System.out.println(userList5);
        System.out.println(userList6);
        // 插入
        User addUser = new User();
        addUser.setRunoob_title("111m");
        addUser.setRunoob_author("surprise");
        addUser.setSubmission_date(new Date());
//        users.addOne(addUser);
//        Integer id = addUser.getRunoob_id();
//        System.out.println(id);
        session.close();
    }
}
