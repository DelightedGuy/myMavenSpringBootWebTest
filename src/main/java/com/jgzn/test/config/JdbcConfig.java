package com.jgzn.test.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**Configuration注解声明此类为配置类*/
//@Configuration
//@PropertySource("classpath:jdbc.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
    @RestController
public class JdbcConfig {
    /**属性注入方式*/
//    @Value("${jdbc.DriverClassName}")
//    String driverClassName;
//    @Value("${jdbc.url}")
//    String url;
//    @Value("${jdbc.userName}")
//    String userName;
//    @Value("${jdbc.passWord}")
//    String passWord;
    /**Bean代表bean标签*/
/*  SpringBoot属性注入方式2
    @Bean
    public DataSource dataSource(JdbcProperties properties){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(properties.getDriverClassName());
        dataSource.setUrl(properties.getUrl());
        dataSource.setUsername(properties.getUserName());
        dataSource.setPassword(properties.getPassWord());
        return dataSource;
    }*/
//    SpringBoot属性注入方式3
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
        return new DruidDataSource();
    }
}
