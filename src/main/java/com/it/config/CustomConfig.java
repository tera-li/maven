package com.it.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

public class CustomConfig {
    @Bean
    public String dataString() {
        return "dataString custom";
    }
}
