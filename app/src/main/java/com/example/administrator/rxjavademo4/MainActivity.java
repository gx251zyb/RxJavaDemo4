package com.example.administrator.rxjavademo4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import JAVA_rx1.RxJavaUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        RxJavaUtils.invail();
    }

    public void show1(View view) {
        RxJavaUtils.just();
    }

    public void show2(View view) {
        RxJavaUtils.rang();
    }

    public void show3(View view) {
        RxJavaUtils.filter();
    }
}
