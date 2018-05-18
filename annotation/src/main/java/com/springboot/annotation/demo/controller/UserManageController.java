package com.springboot.annotation.demo.controller;

import com.springboot.annotation.demo.exception.DescribeException;
import com.springboot.annotation.demo.exception.ExceptionHandle;
import com.springboot.annotation.demo.entity.User;
import com.springboot.annotation.demo.service.UserManageService;
import com.springboot.annotation.demo.utils.ResultUtil;
import com.springboot.annotation.demo.view.ExceptionEnum;
import com.springboot.annotation.demo.view.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usermanage")
public class UserManageController {

    @Autowired
    private UserManageService userManageService;

    @Autowired
    private ExceptionHandle exceptionHandle;

    @GetMapping(value = "/listUsersInfo")
    public ResponseEntity listUsersInfo() {

        List<User> result = userManageService.listUsersInfo();
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @PostMapping(value = "/insertUser")
    public ResponseEntity insertUser(int i) {
        userManageService.innerSave(i);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value = "/insertUserList")
    public ResponseEntity insertUserList(@RequestBody List<User> userList) {
        userManageService.insertUserList(userList);
        return new ResponseEntity(HttpStatus.OK);
    }
}
