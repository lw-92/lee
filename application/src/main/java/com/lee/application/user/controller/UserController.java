package com.lee.application.user.controller;


import com.lee.application.user.dao.UserMapper;
import com.lee.application.user.domain.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wei.li
 * @date 2018/9/17 21:52
 * @desc
 */
@RestController
@RequestMapping("/user")
public class UserController {
    // 创建线程安全的Map
    @Autowired
    private UserMapper userMapper;

    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") String id) {
        System.out.println("q111111");
    }

    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
    public void addUser() {
        User user = userMapper.selectByPrimaryKey(222433982057418752L);
        if(user!=null) System.out.println(user.getCreateTime());

    }

}
