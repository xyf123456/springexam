package com.tt.springexam.service.impl;

import com.tt.springexam.dao.UserRepository;
import com.tt.springexam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public boolean login(String name, String pwd) {
        boolean flag = false;
        if (userRepository.findByUserNameAndAndUserPassword(name, pwd) != null) {
            flag = true;
        }
        return flag;
    }
}
