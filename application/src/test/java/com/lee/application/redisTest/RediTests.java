package com.lee.application.redisTest;

import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wei.li
 * @date 2018/9/23 11:03
 * @desc
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RediTests {

    @Autowired
    RedisTemplate<String,byte[]> template;

    @Test
    public void test1(){
        template.opsForValue().set("1","111".getBytes());
        final byte[] bytes = template.opsForValue().get("1");
        String s = new String(bytes);
        Assert.assertTrue("111".equals(  s));
    }

}
