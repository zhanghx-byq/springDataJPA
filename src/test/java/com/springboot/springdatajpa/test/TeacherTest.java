package com.springboot.springdatajpa.test;

import com.springboot.springdatajpa.SpringDataJpaApplication;
import com.springboot.springdatajpa.pojo.Teacher;
import com.springboot.springdatajpa.repository.TeacherRepository;
import jdk.nashorn.internal.runtime.options.Option;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import com.springboot.springdatajpa.config.*;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

/**
 * @author zhx
 * @data 2023/4/10 16:49
 */
@ContextConfiguration(classes = JpaConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TeacherTest {

    @Autowired
    TeacherRepository teacherRepository;

    @Test
    public void testR(){
        Optional<Teacher> byId = teacherRepository.findById(6L);
        Teacher teacher = byId.get();
        System.out.println(teacher);
    }

    @Test
    public void testC(){
        Teacher teacher = new Teacher();
        teacher.setTeacherName("byq");
        teacher.setTeacherId(1L);

        teacherRepository.save(teacher);
    }


}
