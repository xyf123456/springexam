package com.tt.springexam.controller;

import com.tt.springexam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        return "login";
    }


    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam("loginName") String name, @RequestParam("password") String pwd) {
        if (userService.login(name, pwd)) {
            return "redirect:/role/index";
        }
        return "redirect:/login/";
    }
}
