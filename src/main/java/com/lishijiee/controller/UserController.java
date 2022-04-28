package com.lishijiee.controller;

import com.lishijiee.pojo.User;
import com.lishijiee.service.UserService;
import com.lishijiee.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
