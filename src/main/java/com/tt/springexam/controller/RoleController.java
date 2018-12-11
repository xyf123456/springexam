package com.tt.springexam.controller;

import com.tt.springexam.pojo.Role;
import com.tt.springexam.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;


    @RequestMapping("/index")
    public String index(Model model){
        //调用获取所有角色信息的业务方法
        List<Role> roleList = roleService.findAllRoles();
        model.addAttribute("roleList",roleList);
        return "index";
    }

}
