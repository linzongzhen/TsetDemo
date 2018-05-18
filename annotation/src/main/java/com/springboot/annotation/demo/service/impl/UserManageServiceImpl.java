package com.springboot.annotation.demo.service.impl;

import com.springboot.annotation.demo.dao.UserMapper;
import com.springboot.annotation.demo.entity.User;
import com.springboot.annotation.demo.exception.DescribeException;
import com.springboot.annotation.demo.service.UserManageService;
import com.springboot.annotation.demo.view.ExceptionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserManageServiceImpl implements UserManageService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public void innerSave(int maxId) {
        try {
            //i=5 ca会出现异常
            for (int i = 0; i < maxId; i++) {
                int a = 1 / (i - 5);
                User user = new User();
                user.setName("test" + i);
                user.setPassword("password");
                user.setPhone("password");
                userMapper.insertUser(user);
            }
        }catch (Exception e) {
            throw new DescribeException(ExceptionEnum.ARITHMETIC);
        }
    }

    @Transactional
    public List<User> listUsersInfo() {
        List<User> listUsersInfo = new ArrayList<> ();
        listUsersInfo = userMapper.listUsersInfo();
        return listUsersInfo;
    }

    @Override
    public void insertUserList(List<User> userList) {
        userMapper.insertUserList(userList);
    }


}
