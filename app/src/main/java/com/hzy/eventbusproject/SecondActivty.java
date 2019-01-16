package com.hzy.eventbusproject;

import android.view.View;

import org.greenrobot.eventbus.EventBus;

public class SecondActivty extends BaseAcivity {


    @Override
    protected int getLayout() {
        return R.layout.activity_second;
    }

    @Override
    protected void initView() {

    }


    public void onClicked(View view) {
        Person person = new Person("hzy", 2, 2019);
        EventBus.getDefault().post(person);
        finish();
    }


}
