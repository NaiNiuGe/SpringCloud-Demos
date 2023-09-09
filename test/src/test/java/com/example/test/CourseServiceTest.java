package com.example.test;

import com.example.test.Application.service.CourseService;
import com.example.test.Domain.Entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseServiceTest {


    @Autowired
    CourseService courseService;

    @Test
    void queryById() {
        System.out.printf("", courseService.queryById("1"));
    }

    Course course=new Course("9","马克思主义理论","1");

    @Test
    void insert() {
        courseService.insert(course);
    }

    @Test
    void update() {
        courseService.update(course);
    }

    @Test
    void deleteById() {
        courseService.deleteById(course.getCno());
    }
}