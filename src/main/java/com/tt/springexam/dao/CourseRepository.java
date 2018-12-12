package com.tt.springexam.dao;

import com.tt.springexam.pojo.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 课程数据访问接口
 */
public interface CourseRepository extends JpaRepository<Course,String> {

    Course findCourseByCName(String name);
}
