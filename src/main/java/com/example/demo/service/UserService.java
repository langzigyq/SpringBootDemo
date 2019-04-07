package com.example.demo.service;

import com.example.demo.bean.User;

import java.util.List;

/**
 * @author YanQing Gao
 * @date 2018/11/28 14:45
 * Goals determine what you are going to be!
 */
public interface UserService {

    /**
     * 获取全部用户
     * @return
     */
     List<User> getList();

}
