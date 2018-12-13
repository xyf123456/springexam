package com.tt.springexam.dao;

import com.tt.springexam.pojo.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: com.tt.springexam.dao.ClassRepository
 * @Description:  班级的数据访问接口
 * @Author:      Administrator
 * @CreateDate: 2018/12/13 15:09
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
public interface ClassRepository extends JpaRepository<ClassEntity,String>{

    ClassEntity findClassEntityByCName(String name);
}


