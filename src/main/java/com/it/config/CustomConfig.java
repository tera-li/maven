package com.it.config;

import com.it.dao.impl.BookDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

public class CustomConfig {
    /**
     * @author : surprise
     * @describe : 自动装配Bean
     * @date : 2022/11/1 22:05
     */
    @Bean
    public String dataString(BookDaoImpl BookDaoImpl) {
        System.out.println(BookDaoImpl);
        return "dataString custom";
    }
}
