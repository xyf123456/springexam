package com.tt.springexam.dao;

import com.tt.springexam.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{

    User findByUserNameAndAndUserPassword(String name,String pwd);
}
