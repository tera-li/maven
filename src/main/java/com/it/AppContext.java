package com.it;

import com.it.config.SpringConfig;
import com.it.dao.BookDao;
import com.it.dao.impl.BookDaoImpl;
import com.it.service.impl.BookServiceImpl;
import com.it.service.impl.BookServiceImplAuto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {

    public static void main(String[] args) {
        // 获取IOC容器
        //        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 替代applicationContext.xml，实现类配置bean
        ApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);

        // 获取id，并调用
        BookServiceImpl bookService = (BookServiceImpl) ioc.getBean("bookService");
        bookService.BookServiceRun();
        String dataString = (String) ioc.getBean("dataString");
        System.out.println(dataString);

//        BookServiceImplAuto bookServiceAuto = (BookServiceImplAuto) ioc.getBean("bookServiceAuto");
//        bookServiceAuto.BookServiceRun();
    }
}
