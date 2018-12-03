package com.lee.application.controllers;

import com.lee.application.user.form.LoginForm;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author wei.li
 * @date 2018/10/9 21:54
 * @desc
 */
@RestController
@RequestMapping("/user")
public class LoginController {

    @ApiOperation(value = "登录", notes = "登录接口")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public void deleteUser(@RequestBody LoginForm form) {

    }

}
