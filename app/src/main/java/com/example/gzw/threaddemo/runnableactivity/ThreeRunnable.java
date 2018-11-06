package com.example.gzw.threaddemo.runnableactivity;

import android.util.Log;

public class ThreeRunnable implements Runnable {
    private int ticket = 10;
    @Override
    public void run() {
        while (ticket > 0){
            ticket--;
            Log.e(Thread.currentThread().getName(), "卖了1张还剩" + ticket + "张" );
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
