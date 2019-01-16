package com.hzy.eventbusproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by hzy on 2019/1/16
 **/
public abstract class BaseAcivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initView();
    }

    protected abstract int getLayout();

    protected abstract void initView();
}
