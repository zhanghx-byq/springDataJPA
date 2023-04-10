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
@Table(name = "admin_info")
@EntityListeners(AuditingEntityListener.class)
public class Admin {
    @Id
    @Column(name = "admin_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminID;


}
