package com.lee.application.user.controller;


import com.lee.application.user.model.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wei.li
 * @date 2018/9/17 21:52
 * @desc
 */
@RestController
@RequestMapping("/user")

public class UserController {
    // 创建线程安全的Map

    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") String id) {

    }

    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
    public void addUser() {

    }

}
