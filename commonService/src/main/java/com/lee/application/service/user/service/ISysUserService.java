package com.lee.application.service.user.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.application.service.user.entity.SysUser;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * system mapper.user tables 服务类
 * </p>
 *
 * @author liwei
 * @since 2018-09-24
 */
public interface ISysUserService extends IService<SysUser> {


     long saveUser(SysUser user);

     IPage<SysUser> selectTenantPageVo(Page page, long tenantId);
}
