package com.it.service.impl;

import com.it.dao.impl.BookDaoImpl;
import com.it.service.BookService;
import org.junit.Test;

public class BookServiceImpl implements BookService {
//        BookDaoImpl BookDao = new BookDaoImpl();
    private BookDaoImpl BookDao;
    @Test
    public void BookServiceRun() {
        System.out.println("BookService on run");
        BookDao.save();
    }
    public void setBookDao(BookDaoImpl bookDao) {
        BookDao = bookDao;
    }
}
