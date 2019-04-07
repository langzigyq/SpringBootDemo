package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author YanQing Gao
 * @date 2018/11/28 14:30
 * Goals determine what you are going to be!
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取全部用户
     * @return user集合
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<User> getList(){

        List<User> list = userService.getList();

        return list;
    }

    /**
     * 根据姓名获取用户
     * @param na
     * @return
     */
    @RequestMapping("/name")
    @ResponseBody
    public User getListByName(@RequestParam(name="name",required=false,defaultValue="") String na){

        return null;
    }

    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/list/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User getListById(@PathVariable String id){

        return null;
    }

}
