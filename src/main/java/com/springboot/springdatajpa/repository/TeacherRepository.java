package com.springboot.springdatajpa.repository;

import com.springboot.springdatajpa.pojo.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhx
 * @data 2023/4/10 16:16
 */
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
