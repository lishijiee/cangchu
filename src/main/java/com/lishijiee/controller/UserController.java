package com.lishijiee.controller;

import com.lishijiee.pojo.User;
import com.lishijiee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           Model model) {
        List<User> allUser = userService.getAllUser();
        model.addAttribute("allUser", allUser);
        return "index";
    }

    // 传值的一种方式
    @GetMapping("/getAllUser2")
    public ModelAndView getUser2(){
        List<User> allUser = userService.getAllUser();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("allUser",allUser);
        modelAndView.setViewName("allUser");
        return modelAndView;
    }

}
