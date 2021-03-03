package com.alibaba.android.arouter.exception;

/*
 * 组件通信service异步回调异常
 */
public class ServiceException extends RuntimeException {

    public int code;
    public String msg = "";


    public ServiceException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public ServiceException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public ServiceException(Throwable throwable) {
        super(throwable);
    }

    public ServiceException(Throwable throwable, int code) {
        super(throwable);
        this.code = code;
    }
}
