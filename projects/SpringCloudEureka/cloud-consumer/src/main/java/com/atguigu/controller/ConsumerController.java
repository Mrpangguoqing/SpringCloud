package com.atguigu.controller;

import com.atguigu.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class ConsumerController {

    // 服务提供者的URL地址
    private static final String PROVIDERURL="http://localhost:8080";

    @Autowired
    private RestTemplate restTemplate;//使用模板调用服务即可

    @RequestMapping("/add")
    public int add(Dept dept){
        return restTemplate.postForObject(PROVIDERURL+"/dept/add",dept,Integer.class);
    }

    @RequestMapping("/get/{id}")
    public Dept get(@PathVariable String id){
        return restTemplate.getForObject(PROVIDERURL+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping("/list")
    public List<Dept> list(){
        return restTemplate.getForObject(PROVIDERURL+"/dept/list",List.class);
    }

}