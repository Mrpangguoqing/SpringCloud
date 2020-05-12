package com.atguigu.cloud.controller;

import com.atguigu.cloud.IFace.IDept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class controller {

//    @Autowired
//    RestTemplate template;

    @Autowired
    private IDept iDept;

    @RequestMapping("/hello")
    public String hello(String name){
//        String result = template.getForObject("http://provider/hello?name="+name,String.class);
        String result =iDept.hello(name);
        return result;
    }
}
