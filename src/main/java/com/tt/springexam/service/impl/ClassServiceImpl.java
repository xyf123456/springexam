package com.tt.springexam.service.impl;

import com.tt.springexam.dao.ClassRepository;
import com.tt.springexam.pojo.ClassEntity;
import com.tt.springexam.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: com.tt.springexam.service.impl.ClassServiceImpl
 * @Description:  班级业务接口实现类
 * @Author:      Administrator
 * @CreateDate: 2018/12/13 15:08
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
@Service
public class ClassServiceImpl implements ClassService{

    @Autowired
    private ClassRepository classRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ClassEntity add(ClassEntity classEntity) throws Exception {
        return classRepository.save(classEntity);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ClassEntity findByName(String name) throws Exception {
        return classRepository.findClassEntityByCName(name);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(ClassEntity classEntity) throws Exception {
        classRepository.delete(classEntity);
    }
}
