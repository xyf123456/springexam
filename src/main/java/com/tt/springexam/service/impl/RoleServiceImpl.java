package com.tt.springexam.service.impl;

import com.tt.springexam.dao.RoleRepository;
import com.tt.springexam.pojo.Role;
import com.tt.springexam.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }
}
