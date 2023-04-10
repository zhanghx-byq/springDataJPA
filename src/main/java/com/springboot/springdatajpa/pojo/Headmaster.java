package com.springboot.springdatajpa.pojo;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * @author zhx
 * @data 2023/4/9 18:55
 */

@Data
@Entity
@Table(name = "headmaster_info")
@EntityListeners(AuditingEntityListener.class)
public class Headmaster{

    @Id
    @Column(name = "headmaster_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long headmasterId;




}
