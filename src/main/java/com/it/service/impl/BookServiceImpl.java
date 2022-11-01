package com.it.service.impl;

import com.it.dao.impl.BookDaoImpl;
import com.it.dao.impl.UserDaoImpl;
import com.it.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("bookService")
public class BookServiceImpl implements BookService {
//        BookDaoImpl BookDao = new BookDaoImpl();
    @Resource
    private BookDaoImpl BookDao;
    @Resource
    private UserDaoImpl UserDao;
    @Value("${name}")
    private String name;
//    public BookServiceImpl(UserDaoImpl userDao) {
//        this.userDao = userDao;
//    }

    @Test
    public void BookServiceRun() {
        System.out.println("BookService on run " + name);
        BookDao.save();
        UserDao.save();
    }
//    @Autowired
//    public void setBookDao(BookDaoImpl bookDao) { BookDao = bookDao; }
//    public void setUserDao(UserDaoImpl userDao) { UserDao = userDao; }

    public void init() {
        System.out.println("init ...");
    }
}
