package com.example.springweb.service.impl;

import com.example.springweb.entity.User;
import com.example.springweb.mapper.UserMapper;
import com.example.springweb.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
