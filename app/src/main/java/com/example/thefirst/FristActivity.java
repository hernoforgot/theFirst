package com.example.thefirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FristActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);     //调用该方法来给当前活动加载一个布局
    }
}
