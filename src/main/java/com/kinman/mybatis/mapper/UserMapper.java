package com.kinman.mybatis.mapper;

import com.kinman.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 谨漫Kinman
 * @version 1.0
 */
public interface UserMapper {
    int updateUser();

    //@Select("SELECT * FROM table1 ")
    List<User> selectAll();

    //注释传参法
    List<User> selectUser(@Param("id") int id, @Param("name") String name);

    List<User> selectUser(User user);


}
