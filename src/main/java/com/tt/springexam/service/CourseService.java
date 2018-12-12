package com.tt.springexam.service;

import com.tt.springexam.pojo.Course;


/**
 * 课程业务接口
 */
public interface CourseService {

    /**
     * @ Description:添加课程
     * @params:  * @Param: course
     * @return:com.tt.springexam.pojo.Course
     **/
    Course add(Course course)throws Exception;

    /**
     * @ Description: 删除课程
     * @params:  * @Param: course
     * @return:void
     **/
    void delete(Course course)throws Exception;

    /**
     * @ Description:通过课程名称查找到课程信息
     * @params:  * @Param:
     * @return:com.tt.springexam.pojo.Course
     **/
    Course findByName(String name) throws Exception;
}
