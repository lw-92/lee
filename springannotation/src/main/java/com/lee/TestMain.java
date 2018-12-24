package com.lee;

import com.lee.bean.Person;
import com.lee.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wei.li
 * @date 2018/12/23 19:17
 * @desc
 */
public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = context.getBean(Person.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
    }
}
