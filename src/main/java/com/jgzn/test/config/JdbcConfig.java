package com.jgzn.test.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**Configuration注解声明此类为配置类*/
@Configuration
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {

    /**属性注入方式*/
    @Value("${jdbc.DriverClassName}")
    String driverClassName;
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.userName}")
    String userName;
    @Value("${jdbc.passWord}")
    String passWord;
    /**Bean代表bean标签*/
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(passWord);
        return dataSource;
    }
}
