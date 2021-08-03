package com.alibaba.android.arouter.demo.module1.testservice;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;


import androidx.annotation.NonNull;

import com.alibaba.android.arouter.demo.service.HelloService;
import com.alibaba.android.arouter.exception.ServiceException;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.ServiceCallback;
import com.alibaba.android.arouter.facade.callback.ServiceDataWrapper;

/**
 * TODO feature
 *
 * @author Alex <a href="mailto:zhilong.lzl@alibaba-inc.com">Contact me.</a>
 * @version 1.0
 * @since 2017/1/3 10:26
 */
@Route(path = "/yourservicegroupname/hello")
public class HelloServiceImpl implements HelloService {
    Context mContext;


    /**
     * Do your init work in this method, it well be call when processor has been load.
     *
     * @param context ctx
     */
    @Override
    public void init(Context context) {
        mContext = context;
        Log.e("testService", HelloService.class.getName() + " has init.");
    }

    @Override
    public void sayHello(String name, ServiceCallback<String> serviceCallback) {
        if (serviceCallback != null)
            serviceCallback.result(new ServiceDataWrapper<>(new ServiceException("调用错误")));
//        serviceCallback.result(new ServiceDataWrapper<>("成功"));
    }
}
