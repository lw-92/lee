package com.lee.application.callback;

/**
 * @author wei.li
 * @date 2018/9/18 23:10
 * @desc
 */
public class RedisData<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
