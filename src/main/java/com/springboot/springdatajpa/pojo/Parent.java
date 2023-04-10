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
@Table(name="parent_info")
@EntityListeners(AuditingEntityListener.class)
public class Parent {

    @Id
    @Column(name = "parent_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long parentId;

    @Column(name = "parent_name")
    private String parentName;

    @Column(name = "parent_email")
    private String parentEmail;

    @Column(name = "parent_pwd")
    private String parentPwd;

    @Column(name = "parent_tel")
    private String parentTel;

//    //是否绑定孩子
//    @Column(name = "is_children")
//    private Boolean isChildren;
//
//    @Column(name = "children_name")
//    private String childrenName;
}
