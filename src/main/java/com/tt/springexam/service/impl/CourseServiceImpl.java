package com.tt.springexam.service.impl;

import com.tt.springexam.dao.CourseRepository;
import com.tt.springexam.pojo.Course;
import com.tt.springexam.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 课程业务接口实现类
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Course add(Course course) throws Exception {
        return courseRepository.save(course);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Course course) throws Exception {
        courseRepository.delete(course);
    }

    @Override
    public Course findByName(String name) throws Exception {
        return courseRepository.findCourseByCName(name);
    }
}
