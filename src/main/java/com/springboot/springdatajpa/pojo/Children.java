package com.springboot.springdatajpa.pojo;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * @author zhx
 * @data 2023/4/9 18:54
 */

@Data
@Entity
@Table(name = "children_info")
@EntityListeners(AuditingEntityListener.class)
public class Children {

    @Id
    @Column(name = "children_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long childrenID;
}
