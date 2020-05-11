package com.atguigu.service;

import com.atguigu.entity.Dept;
import java.util.List;

public interface IDeptService {

    /**
     * 查询所有结果集
     * @return
     */
    List<Dept> findAll();

    /**
     * 根据ID查询一条记录
     * @param id
     * @return
     */
    Dept findById(String id);

    /**
     * 增加记录
     * @param dept
     */
    int addDeptInfo(Dept dept);

}
