package com.lee.config;

import com.lee.bean.Rainbow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author wei.li
 * @date 2018/12/23 20:19
 * @desc
 * 可以手动注册
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean person = registry.containsBeanDefinition("person");
        if(person){
            RootBeanDefinition df=new RootBeanDefinition(Rainbow.class);
            registry.registerBeanDefinition("rainbow",df);
        }
    }
}
