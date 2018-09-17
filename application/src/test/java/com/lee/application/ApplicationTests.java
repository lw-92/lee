package com.lee.application;

import com.lee.application.user.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
	private StringRedisTemplate template;

    @Autowired
	private TestMapper testMapper;

	@Test
	public void redisHealthCheck() {
		template.opsForValue().set("111","111",6000);
	}

	@Test
	public void mysqlHealthCheck() {
		final int byName = testMapper.findByName();
		System.out.println(byName);
	}
}
