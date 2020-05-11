package com.atguigu.service.service.impl;

import com.atguigu.entity.Dept;
import com.atguigu.mapper.IDeptMapper;
import org.springframework.stereotype.Service;
import com.atguigu.service.IDeptService;
import javax.annotation.Resource;
import java.util.List;

@Service
public class IDeptServiceImpl implements IDeptService {

    @Resource
    private IDeptMapper mapper;

    @Override
    public List<Dept> findAll() {
        return mapper.findAll();
    }

    @Override
    public Dept findById(String id) {
        return mapper.findById(id);
    }

    @Override
    public int addDeptInfo(Dept dept) {
        return mapper.addInfo(dept);
    }
}
