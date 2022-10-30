package com.it.dao.impl;

import com.it.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("bookDao")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("BookDao on save");
    }
}
