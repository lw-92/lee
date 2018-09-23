package com.lee.application.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author wei.li
 * @date 2018/9/23 11:02
 * @desc
 */
@Configuration
@ConfigurationProperties(prefix = "app.redis")
public class RedisConfiguration {

    private String host;
    private int port;
    private String password;
    private int maxActive;
    private int maxIdle;


    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setHostName(host);
        jedisConnectionFactory.setPort(port);
        JedisPoolConfig pool = new JedisPoolConfig();
        jedisConnectionFactory.setPoolConfig(pool);
//        pool.setMaxTotal(maxActive);
//        pool.setMaxIdle(maxActive);
        return jedisConnectionFactory;
    }

    @Bean
    public RedisTemplate<String, byte[]> redisTemplate(JedisConnectionFactory factory) {
        RedisTemplate<String, byte[]> template = new RedisTemplate<String, byte[]>();
        template.setConnectionFactory(factory);
        return template;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }
}
