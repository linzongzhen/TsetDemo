package com.springboot.annotation.demo.service;

import com.springboot.annotation.demo.entity.User;

import java.util.List;

public interface UserManageService {

    /**
     * 新增多个可变的测试用户（测试）
     * @param i 用户数
     */
    void innerSave(int i);

    /**
     * 查询所有用户信息
     * @return List<User>用户实体集
     */
    List<User> listUsersInfo();

    /**
     * 新增一个用户集
     * @param userList 用户实体集
     */
    void insertUserList(List<User> userList);
}
