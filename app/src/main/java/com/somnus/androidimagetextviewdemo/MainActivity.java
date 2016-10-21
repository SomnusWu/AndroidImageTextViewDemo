package com.somnus.androidimagetextviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    LinearLayout activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_main = (LinearLayout) findViewById(R.id.activity_main);

        for (int i = 0; i < activity_main.getChildCount(); i++) {
            ImageTextView mImageTextView = (ImageTextView) activity_main.getChildAt(i);
            mImageTextView.setText("我是" + i + "段文字");
            mImageTextView.setIconText(this, i + "我是一段文字");
        }


    }
}
