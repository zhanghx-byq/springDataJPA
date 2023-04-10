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
@Table(name="teacher_info")
@EntityListeners(AuditingEntityListener.class)
public class Teacher {

    @Id
    @Column(name = "teacher_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;

    @Column(name = "tercher_name")
    private String teacherName;

    @Column(name = "teacher_email")
    private String teacherEmail;

    @Column(name = "teacher_pwd")
    private String teacherPwd;

    @Column(name = "subject")
    private String subject;

    @Column(name = "teacher_tel")
    private String teacherTel;



}
