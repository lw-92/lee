package com.lee;

import com.lee.aop.MathCalculator;
import com.lee.bean.Car;
import com.lee.bean.Person;
import com.lee.bean.Rainbow;
import com.lee.config.IOCLifeCycleConfig;
import com.lee.config.MainConfig;
import com.lee.config.MainConfig2;
import com.lee.config.MainConfigOfAOP;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wei.li
 * @date 2018/12/23 20:01
 * @desc
 */
public class IocTest2 {

    @Test
    public void test02(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        Person bean1 = context.getBean(Person.class);
        Person bean2 = context.getBean(Person.class);
        System.out.println(bean1.equals(bean2));
        Assert.assertNotNull(context.getBean(Rainbow.class));

    }


    @Test
    public void testLifeCycle(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IOCLifeCycleConfig.class);
        Car bean = context.getBean(Car.class);
        System.out.println(bean.getColor());
        context.close();

    }
    @Test
    public void testAop(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
        MathCalculator bean = context.getBean(MathCalculator.class);
        System.out.println(bean.div(1,1));
        context.close();

    }

}
