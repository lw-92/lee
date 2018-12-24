package com.lee.config;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author wei.li
 * @date 2018/12/23 20:49
 * @desc
 */
public class MyFactoryBean implements FactoryBean{
    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
