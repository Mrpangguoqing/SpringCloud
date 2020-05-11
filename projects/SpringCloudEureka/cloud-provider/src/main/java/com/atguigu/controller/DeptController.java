package com.atguigu.controller;

import com.atguigu.entity.Dept;
import com.atguigu.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private IDeptService service;

    @RequestMapping("/list")
    public List<Dept> getList(){
        return service.findAll();
    }

    @RequestMapping("/get/{id}")
    public Dept get(@PathVariable String id){
        return service.findById(id);
    }

    @RequestMapping("/add")
    public int add(@RequestBody Dept dept){
        return service.addDeptInfo(dept);
    }

}
