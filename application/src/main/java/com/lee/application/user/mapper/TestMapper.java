package com.lee.application.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author wei.li
 * @date 2018/9/17 22:11
 * @desc
 */
@Mapper
public interface TestMapper {
    @Select("select  1 from DUAL")
    int findByName();
}
