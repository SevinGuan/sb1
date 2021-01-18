package com.xc.sb1.service.impl;

import com.xc.sb1.entity.User;
import com.xc.sb1.mapper.UserMapper;
import com.xc.sb1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(long id) {
        return userMapper.selectById(id);
    }
}
