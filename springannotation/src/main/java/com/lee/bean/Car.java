package com.lee.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author wei.li
 * @date 2018/12/23 20:58
 * @desc
 */
public class Car implements InitializingBean,BeanPostProcessor{

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void init(){
        System.out.println("car init");
    }
    public void destory(){
        System.out.println("car destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.setColor("red");
        System.out.println("InitializingBean --初始化逻辑---afterPropertiesSet");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization   "+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization   "+beanName);
        return bean;
    }
}
