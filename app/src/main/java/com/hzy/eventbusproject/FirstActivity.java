package com.hzy.eventbusproject;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class FirstActivity extends BaseAcivity {

    private static final String TAG ="FirstActivity";


    private TextView mTvContent;

    @Override
    protected int getLayout() {
        return R.layout.activity_first;
    }

    @Override
    protected void initView() {
        mTvContent=findViewById(R.id.tv_content);
        EventBus.getDefault().register(this);
    }


    public void onClicked(View view) {
        startActivity(new Intent(this, SecondActivty.class));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void PersonEvent(Person person) {
        Log.e(TAG, person.toString());
        mTvContent.setText(person.toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
