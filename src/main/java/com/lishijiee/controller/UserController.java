package com.lishijiee.controller;

import com.lishijiee.pojo.User;
import com.lishijiee.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.Objects;

@Slf4j
@Controller
public class UserController {
    @Autowired
    UserService userService;

    public String dologin(User user, Map<String, Object> map, HttpSession session){
        User loginUser = userService.getUser(user);
        if(Objects.nonNull(loginUser)){
            session.setAttribute("loginUser", loginUser);
            log.info("登陆成功，用户名：" + loginUser.getUserName());
            //防止重复提交使用重定向
            return "redirect:/main.html";
        }else{
            map.put("msg", "用户名或密码错误");
            log.error("登陆失败");
            return "login";
        }
    }
}
