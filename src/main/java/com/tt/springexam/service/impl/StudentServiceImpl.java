package com.tt.springexam.service.impl;

import com.tt.springexam.dao.StudentRepository;
import com.tt.springexam.pojo.Student;
import com.tt.springexam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 学生业务接口实现类
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Student add(Student student) {
        return studentRepository.save(student);
    }
}
