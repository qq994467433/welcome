package com.example.gzw.threaddemo.threadactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.gzw.threaddemo.R;

public class ThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);
        findViewById(R.id.one_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyThread t1 = new MyThread("第一个窗口");
                MyThread t2 = new MyThread("第二个窗口");
                t1.start();
                t2.start();
            }
        });
        findViewById(R.id.one_three_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyThread t1 = new MyThread("第一个窗口");
                ThreeThread t2 = new ThreeThread("第二个窗口");
                t1.start();
                t2.start();
            }
        });
    }
}
