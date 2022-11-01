package com.it.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.it")
@PropertySource("classpath:outProperties.properties")
public class SpringConfig { }
