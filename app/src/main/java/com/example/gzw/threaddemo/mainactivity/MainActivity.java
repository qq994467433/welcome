package com.example.gzw.threaddemo.mainactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gzw.threaddemo.R;
import com.example.gzw.threaddemo.runnableactivity.RunnableActivity;
import com.example.gzw.threaddemo.threadactivity.ThreadActivity;
import com.example.gzw.threaddemo.threadpoolactivity.ThreadPoolActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonThread, buttonRunnable, buttonThreadPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonThread = findViewById(R.id.button_thread);
        buttonThread.setOnClickListener(this);
        buttonRunnable = findViewById(R.id.button_runnable);
        buttonRunnable.setOnClickListener(this);
        buttonThreadPool = findViewById(R.id.button_thread_pool);
        buttonThreadPool.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_thread:
                Intent threadIntent = new Intent(MainActivity.this,ThreadActivity.class);
                startActivity(threadIntent);
                break;
            case R.id.button_runnable:
                Intent runnableIntent = new Intent(MainActivity.this,RunnableActivity.class);
                startActivity(runnableIntent);
                break;
            case R.id.button_thread_pool:
                Intent threadPoolIntent = new Intent(MainActivity.this,ThreadPoolActivity.class);
                startActivity(threadPoolIntent);
                break;

        }
    }
}
