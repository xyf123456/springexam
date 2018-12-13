package com.tt.springexam.service;

import com.tt.springexam.pojo.ClassEntity;
import com.tt.springexam.pojo.Course;

/**
 * @ClassName: com.tt.springexam.service.ClassService
 * @Description:  班级业务接口
 * @Author:      Administrator
 * @CreateDate: 2018/12/13 15:08
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
public interface ClassService {

    /**
     * @ Description: 添加班级
     * @params:  * @Param: classEntity
     * @return:com.tt.springexam.pojo.ClassEntity
     **/
    ClassEntity add(ClassEntity classEntity)throws Exception;

    /**
     * @ Description: 通过名称查找到班级
     * @params:  * @Param: name
     * @return:com.tt.springexam.pojo.ClassEntity
     **/
    ClassEntity findByName(String name)throws Exception;

    /**
     * @ Description: 删除班级
     * @params:  * @Param: classEntity
     * @return:void
     **/
    void delete(ClassEntity classEntity)throws Exception;

}
