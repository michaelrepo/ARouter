package com.alibaba.android.arouter.facade.callback;


import com.alibaba.android.arouter.exception.ServiceException;

public interface ServiceCallback {
     void result(ServiceDataWrapper<String> serviceDataWrapper);
}