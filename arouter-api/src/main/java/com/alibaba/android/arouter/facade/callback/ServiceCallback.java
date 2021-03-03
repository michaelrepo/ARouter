package com.alibaba.android.arouter.facade.callback;


public interface ServiceCallback<T> {
     void result(ServiceDataWrapper<T> serviceDataWrapper);
}