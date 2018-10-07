package com.lee.application.service.user.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.application.service.user.entity.SysUser;
import com.lee.application.service.user.mapper.SysUserMapper;
import com.lee.application.service.user.service.ISysUserService;
import com.lee.application.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * system mapper.user tables 服务实现类
 * </p>
 *
 * @author liwei
 * @since 2018-09-24
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
    @Autowired
    private SysUserMapper userMapper;

    @Override
    public long saveUser(SysUser user) {
        final long nextId = SnowFlake.getNextId();
        user.setId(nextId);
        userMapper.insert(user);
        return nextId;
    }

    @Override
    public IPage<SysUser> selectTenantPageVo(Page page, long tenantId) {
       /* final Integer integer = userMapper.selectTest();*/
        return userMapper.selectTenantPageVo(page,tenantId);
    }
}
