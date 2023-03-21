package com.kinman.mybatis.mapper;

import com.kinman.mybatis.pojo.User;

import java.util.List;

/**
 * @author 谨漫Kinman
 * @version 1.0
 */
public interface UserMapper {
    int updateUser();

    //@Select("SELECT * FROM table1 ")
    List<User> selectAll();
}
