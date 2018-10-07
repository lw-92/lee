package com.lee.application.user.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lee.application.model.CommonHttpEntity;
import com.lee.application.service.user.entity.SysUser;
import com.lee.application.service.user.service.ISysUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wei.li
 * @date 2018/9/17 21:52
 * @desc
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ISysUserService userService;

    @ApiOperation(value = "add mapper.user", notes = "")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public CommonHttpEntity addUser(@RequestBody SysUser user) {
        final CommonHttpEntity commonHttpEntity = new CommonHttpEntity();
        userService.saveUser(user);
        return commonHttpEntity;
    }

    @ApiOperation(value = "add mapper.user", notes = "")
    @RequestMapping(value = "/get/{tenantId}", method = RequestMethod.GET)
    public CommonHttpEntity< IPage<SysUser>> selectByTenant(@PathVariable long tenantId) {
        final CommonHttpEntity commonHttpEntity = new CommonHttpEntity();
        Page page=new Page(1,10);
        final IPage<SysUser> sysUserIPage = userService.selectTenantPageVo(page, tenantId);
        commonHttpEntity.setData(sysUserIPage);
        return commonHttpEntity;
    }

}
