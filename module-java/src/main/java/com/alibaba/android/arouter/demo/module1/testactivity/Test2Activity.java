package com.alibaba.android.arouter.demo.module1.testactivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.demo.module1.R;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/test/activity2")
public class Test2Activity extends AppCompatActivity {

    @Autowired
    String key1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        String value = getIntent().getStringExtra("key1");

        Log.i("alias",""+getIntent().getStringExtra(ARouter.LAST_PAGE_NAME));
        if (!TextUtils.isEmpty(value)) {
            Toast.makeText(this, "exist param :" + value, Toast.LENGTH_LONG).show();
        }

        setResult(999);
    }
}
