package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author YanQing Gao
 * @date 2018/11/28 14:38
 * Goals determine what you are going to be!
 */
@Mapper
public interface UserMapper {

    List<User> getList();

}
