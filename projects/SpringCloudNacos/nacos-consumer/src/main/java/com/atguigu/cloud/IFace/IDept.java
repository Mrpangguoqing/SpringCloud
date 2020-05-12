package com.atguigu.cloud.IFace;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("provider")
public interface IDept {

    @RequestMapping("/hello")
    String hello(@RequestParam(name="name") String name);
}
