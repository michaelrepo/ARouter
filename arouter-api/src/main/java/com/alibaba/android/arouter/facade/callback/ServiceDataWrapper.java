package com.alibaba.android.arouter.facade.callback;

import com.alibaba.android.arouter.exception.ServiceException;

/**
 * 组件通信service异步回调接口
 *
 * @param <T> 回调数据类型
 */
public class ServiceDataWrapper<T> {
    public T data = null;
    public ServiceException exception = null;

    public ServiceDataWrapper(T data) {
        this.data = data;
    }

    public ServiceDataWrapper(ServiceException exception) {
        this.exception = exception;
    }

    public boolean isSuccess() {
        return null == exception;
    }
}
