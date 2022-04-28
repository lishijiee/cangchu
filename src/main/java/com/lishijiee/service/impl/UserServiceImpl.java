package com.lishijiee.service.impl;

import com.lishijiee.mapper.UserMapper;
import com.lishijiee.pojo.User;
import com.lishijiee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
