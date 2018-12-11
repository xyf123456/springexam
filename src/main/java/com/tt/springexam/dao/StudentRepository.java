package com.tt.springexam.dao;

import com.tt.springexam.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 学生数据访问层的接口
 */
public interface StudentRepository extends JpaRepository<Student,String>{
}
