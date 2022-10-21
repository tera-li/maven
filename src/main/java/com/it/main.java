package com.it;

import com.it.mapper.UserMapper;
import com.it.user.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

    public SqlSession getSession() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        return factory.openSession(true);
    }

    @Test
    public void main() throws IOException {
        // 加载核心配置
        SqlSession session = getSession();
        // 执行sql
        // List<User> userList = session.selectList("com.it.mapper.UserMapper.selectAll");
        // 获取mapper接口的代理对象
        UserMapper users = session.getMapper(UserMapper.class);
        // 实体类封装参数
        User user = new User();
        user.setRunoob_id(28);
        user.setRunoob_title("22229999");
        // map集合封装
        Map map = new HashMap();
        map.put("runoob_id", 28);
        map.put("runoob_title", "22229999");
        List<User> userList1 = users.selectAll();
        List<User> userList2 = users.selectAllList();
        List<User> userList3 = users.selectOne(28);
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
        session.close();
    }

    @Test
    public void insetData() throws IOException {
        // 加载核心配置
        SqlSession session = getSession();
        // 获取mapper接口的代理对象
        UserMapper users = session.getMapper(UserMapper.class);
        // 插入
        User addUser = new User();
        addUser.setRunoob_title("111m");
        addUser.setRunoob_author("surprise");
        addUser.setSubmission_date(new Date());
        users.addOne(addUser);
        Integer id = addUser.getRunoob_id();
        System.out.println(id);
        session.close();
    }

    @Test
    public void updateData() throws IOException {
        // 加载核心配置
        SqlSession session = getSession();
        // 获取mapper接口的代理对象
        UserMapper users = session.getMapper(UserMapper.class);
        // 更新
        User addUser = new User();
        addUser.setRunoob_id(29);
        addUser.setRunoob_title(null);
        addUser.setRunoob_author("surprise");
        addUser.setSubmission_date(new Date());
        boolean num = users.updateOne(addUser);
        System.out.println(num);
        session.close();
    }

    @Test
    public void deleteData() throws IOException {
        // 加载核心配置
        SqlSession session = getSession();
        // 获取mapper接口的代理对象
        UserMapper users = session.getMapper(UserMapper.class);
        // 插入
        // 单个删除
        // User addUser = new User();
        // addUser.setRunoob_id(32);
        // boolean num = users.deleteOne(addUser);

        // 批量删除
        int [] ids = { 30, 31, 32 };
        boolean nums = users.deleteList(ids);
        System.out.println(nums);
        session.close();
    }
}
