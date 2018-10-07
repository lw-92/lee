package com.lee.application.model;

import java.util.List;

/**
 * @author wei.li
 * @date 2018/9/24 18:31
 * @desc
 */
public class CommonHttpEntity<T> {

    private int status;
    private T data;
    private List<String> errorMsg;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<String> getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(List<String> errorMsg) {
        this.errorMsg = errorMsg;
    }

}
