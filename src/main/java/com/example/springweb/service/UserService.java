package com.example.springweb.service;

import com.example.springweb.entity.User;

public interface UserService {
    User selectByPrimaryKey(Integer id);

}
