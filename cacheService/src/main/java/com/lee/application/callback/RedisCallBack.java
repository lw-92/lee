package com.lee.application.callback;

/**
 * @author wei.li
 * @date 2018/9/18 22:33
 * @desc
 */
public interface RedisCallBack<T> {

    public <T> RedisData<T> execute(String str);
}
