package com.lee.config;

import com.lee.bean.Person;
import org.springframework.context.annotation.*;
import sun.java2d.pipe.OutlineTextRenderer;

/**
 * @author wei.li
 * @date 2018/12/23 20:00
 * @desc
 */
@Configuration
@Import({MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {
    @Bean()
    public Person person(){
        return new Person("11",11);
    }
}
