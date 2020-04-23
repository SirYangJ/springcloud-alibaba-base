package com.example.provider.service;

import com.example.provider.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 插入用户信息
     *
     * @param user
     * @return
     */
    int insertUserInfo(User user) throws Exception;

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    User queryUserInfoById(Integer id)throws Exception;
    /**
     * 根据name查询用户信息
     *
     * @param user
     * @return
     */
    List<User> getUserByName(User user)throws Exception;
}
