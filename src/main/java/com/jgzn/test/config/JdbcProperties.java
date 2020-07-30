package com.jgzn.test.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

//提供该注解将配置文件的值映射到类上使用。prefix表示配置文件属性的前缀声明
@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {
    String driverClassName;
    String url;
    String userName;
    String passWord;
}
