package com.lishijiee.controller;

import com.lishijiee.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxTestController {
    @RequestMapping("/api/getUser")
    public List<User> getJson(){
        User user1 = new User(1, "zhangsan", 13);
        User user2 = new User(2, "lisi", 14);
        User user3 = new User(3, "wangwu", 15);
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }
}
