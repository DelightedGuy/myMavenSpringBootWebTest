package com.jgzn.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @Controller 处理请求
 */
@RestController
public class HelloController {
    /**
     * 接收来自浏览器的hello请求
     * @return
     */
//    @ResponseBody
    @Autowired
    private DataSource dataSource;
    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld!这是用Maven搭建的Web空间";
    }
}
