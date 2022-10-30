package com.it.service.impl;

import com.it.dao.impl.BookDaoImpl;
import com.it.dao.impl.UserDaoImpl;
import com.it.service.BookService;
import com.it.service.BookServiceAuto;
import org.junit.Test;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class BookServiceImplAuto implements BookServiceAuto {
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
