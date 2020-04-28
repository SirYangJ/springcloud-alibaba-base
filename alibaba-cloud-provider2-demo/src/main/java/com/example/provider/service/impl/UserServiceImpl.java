package com.example.provider.service.impl;

import com.example.provider.dao.UserMapper;
import com.example.provider.pojo.User;
import com.example.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUserInfo(User user){
        return userMapper.insert(user);
    }

    @Override
    public User queryUserInfoById(Integer id) throws Exception{
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getUserByName(User user)throws Exception {
        return userMapper.getUserByName(user);
    }
}
