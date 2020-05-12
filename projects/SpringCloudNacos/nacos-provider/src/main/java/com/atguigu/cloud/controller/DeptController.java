package com.atguigu.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DeptController {

    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println(name);
        return "say hello to"+name;
    }
}
