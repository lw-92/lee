package com.lee.config;

import com.lee.MyTypeFilter;
import com.lee.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author wei.li
 * @date 2018/12/23 19:12
 * @desc
 */
@ComponentScan(value = "com.lee",
includeFilters={@ComponentScan.Filter(type=FilterType.CUSTOM,classes = {MyTypeFilter.class})} )
@Configuration
public class MainConfig {
    @Bean("p1")
    public Person getPerson(){
        return new Person("11",11);
    }
}
