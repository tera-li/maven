package com.it.service.impl;

import com.it.dao.impl.BookDaoImpl;
import com.it.dao.impl.UserDaoImpl;
import com.it.service.BookService;
import org.junit.Test;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {
//        BookDaoImpl BookDao = new BookDaoImpl();
    private BookDaoImpl BookDao;
    private UserDaoImpl UserDao;

//    public BookServiceImpl(UserDaoImpl userDao) {
//        this.userDao = userDao;
//    }

    @Test
    public void BookServiceRun() {
        System.out.println("BookService on run");
        BookDao.save();
        UserDao.save();
    }
    public void setBookDao(BookDaoImpl bookDao) { BookDao = bookDao; }
    public void setUserDao(UserDaoImpl userDao) { UserDao = userDao; }

    public void init() {
        System.out.println("init ...");
    }
}
