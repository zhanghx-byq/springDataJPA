package com.springboot.springdatajpa.repository;

import com.springboot.springdatajpa.pojo.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhx
 * @data 2023/4/10 18:55
 */
public interface ParentRepository extends JpaRepository<Parent,Long> {
}
