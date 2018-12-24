package com.lee.config;

import com.lee.BeanPostProcessor.BeanPostProcessor01;
import com.lee.BeanPostProcessor.BeanPostProcessor02;
import com.lee.BeanPostProcessor.BeanPostProcessor03;
import com.lee.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wei.li
 * @date 2018/12/23 21:00
 * @desc
 */
@Configuration
public class IOCLifeCycleConfig {
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }
    @Bean
    public BeanPostProcessor01 bp01(){
        return new BeanPostProcessor01();
    }
    @Bean
    public BeanPostProcessor02 bp02(){
        return new BeanPostProcessor02();
    }
    @Bean
    public BeanPostProcessor03 bp03(){
        return new BeanPostProcessor03();
    }

}
