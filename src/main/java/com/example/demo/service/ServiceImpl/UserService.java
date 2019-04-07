package com.example.demo.service.ServiceImpl;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YanQing Gao
 * @date 2018/11/28 14:48
 * Goals determine what you are going to be!
 */
@Service("userService")
public class UserService implements com.example.demo.service.UserService {

    @Resource
    private UserMapper userMapper;
    /**
     * 获取全部用户
     *
     * @return
     */
    @Override
    public List<User> getList() {
        List<User> list = userMapper.getList();
        return list;
    }

}
