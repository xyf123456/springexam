package com.tt.springexam.service;

import com.tt.springexam.pojo.Student;
import com.tt.springexam.pojo.User;

/**
 * 学生业务接口
 */
public interface StudentService {

    /**
     * @ Description: 添加学生
     * @params: * @Param: student
     * @return:com.tt.springexam.pojo.Student
     **/
    Student add(Student student) throws Exception;

    /**
     * @ Description:删除学生
     * @params:  * @Param: student
     * @return:void
     **/
    void delete(Student student) throws Exception;

    /**
     * @ Description: 根据名称查找到学生
     * @params:  * @Param: name
     * @return:com.tt.springexam.pojo.Student
     **/
    Student findByName(String name) throws Exception;

}