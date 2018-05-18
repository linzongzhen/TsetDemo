package com.springboot.annotation.demo.dao;

import com.springboot.annotation.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 获取所有用户
     *
     * @return List<User>用户实体集
     */
    List<User> listUsersInfo();

    /**
     * 根据id获取用户信息
     *
     * @return User 用户实体
     */
    User getUser(int id);

    /**
     * 修改用户信息
     *
     * @param user 用户实体
     */
    void updateUser(User user);

    /**
     * 删除用户
     *
     * @param id 用户id
     */
    void deleteUser(int id);

    /**
     * 新增一条用户信息
     *
     * @param user 用户实体
     */
    void insertUser(User user);

    /**
     * 新增一个用户集
     * @param userList 用户实体集
     */
    void insertUserList(List<User> userList);




}
