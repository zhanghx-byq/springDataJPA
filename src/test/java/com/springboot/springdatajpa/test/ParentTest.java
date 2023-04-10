package com.springboot.springdatajpa.test;

import com.springboot.springdatajpa.config.JpaConfig;
import com.springboot.springdatajpa.pojo.Parent;
import com.springboot.springdatajpa.repository.ParentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhx
 * @data 2023/4/10 18:54
 */

@ContextConfiguration(classes = JpaConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ParentTest {
    @Autowired
    ParentRepository parentRepository;

    @Test
    public void testC(){
        Parent parent = new Parent();
        parent.setParentId(1L);
        parent.setParentName("小毕");

        parentRepository.save(parent);
    }
}
