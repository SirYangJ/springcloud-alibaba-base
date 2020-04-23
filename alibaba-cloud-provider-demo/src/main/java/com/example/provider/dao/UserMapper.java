package com.example.provider.dao;

import com.example.provider.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
    List<User> getUserByName(User user);
}
