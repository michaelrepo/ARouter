package com.alibaba.android.arouter.demo;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.DegradeService;

// 实现DegradeService接口，并加上一个Path内容任意的注解即可
@Route(path = "/degrade/deg")
public class DegradeServiceImpl implements DegradeService {
    @Override
    public void onLost(Context context, Postcard postcard) {
        Toast.makeText(context, "没找到呢", Toast.LENGTH_LONG).show();
    }

    @Override
    public void init(Context context) {

    }
}