package com.example.test.Application.service;


import com.example.test.Domain.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Student)表服务接口
 *
 * @author makejava
 * @since 2023-09-07 18:11:08
 */
public interface StudentService {

    /**
     * 通过ID查询单条数据
     *
     * @param stuno 主键
     * @return 实例对象
     */
    Student queryById(String stuno);

    /**
     * 找出所有学生
     * @return
     */
    List<Student> list();


    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param stuno 主键
     * @return 是否成功
     */
    boolean deleteById(String stuno);

}
