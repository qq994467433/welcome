package com.example.gzw.threaddemo.runnableactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.gzw.threaddemo.R;

public class RunnableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runnable);
        findViewById(R.id.one_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyRunnable r1 = new MyRunnable();
                MyRunnable r2 = new MyRunnable();
                Thread t1 = new Thread(r1,"第一个窗口");
                Thread t2 = new Thread(r2,"第二个窗口");
                t1.start();
                t2.start();
            }
        });
        findViewById(R.id.one_three_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyRunnable r1 = new MyRunnable();
                ThreeRunnable r2 = new ThreeRunnable();
                Thread t1 = new Thread(r1,"第一个窗口");
                Thread t2 = new Thread(r2,"第二个窗口");
                t1.start();
                t2.start();
            }
        });
        findViewById(R.id.same_task).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyRunnable r1 = new MyRunnable();
                Thread t1 = new Thread(r1,"第一个窗口");
                Thread t2 = new Thread(r1,"第二个窗口");
                t1.start();
                t2.start();
            }
        });
    }
}
