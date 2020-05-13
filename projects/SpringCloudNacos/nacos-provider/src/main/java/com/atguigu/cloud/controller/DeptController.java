package com.atguigu.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RefreshScope
public class DeptController {

    @Value("${basic.url}")
    private String url;

    @Value("${basic.port}")
    private int port;

    @Value("${basic.username}")
    private String userName;

    @Value("${basic.password}")
    private String password;

    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println(name);
        return "say hello to"+name;
    }
}
