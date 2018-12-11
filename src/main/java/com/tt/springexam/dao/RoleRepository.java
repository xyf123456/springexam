package com.tt.springexam.dao;

import com.tt.springexam.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer>{
}
