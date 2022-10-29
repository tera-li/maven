package com.it;

import com.it.dao.BookDao;
import com.it.service.impl.BookServiceImpl;
import com.it.service.impl.BookServiceImplAuto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {

    public static void main(String[] args) {
        // 获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取id，并调用
        BookServiceImpl bookService = (BookServiceImpl) ioc.getBean("bookService");
        bookService.BookServiceRun();

        BookServiceImplAuto bookServiceAuto = (BookServiceImplAuto) ioc.getBean("bookServiceAuto");
        bookServiceAuto.BookServiceRun();
    }
}
