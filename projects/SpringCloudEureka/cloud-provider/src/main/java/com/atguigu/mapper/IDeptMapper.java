package com.atguigu.mapper;

import com.atguigu.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface IDeptMapper {

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
     * 添加记录
     * @param dept
     */
    int addInfo(Dept dept);

}
