package com.lee.application.service.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lee.application.service.user.entity.SysUser;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * system mapper.user tables Mapper 接口
 * </p>
 *
 * @author liwei
 * @since 2018-09-24
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    IPage<SysUser> selectTenantPageVo(Page page, @Param("tenantId") long tenantId);


}
