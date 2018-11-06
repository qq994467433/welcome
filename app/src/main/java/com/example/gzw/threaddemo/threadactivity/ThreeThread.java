package com.example.gzw.threaddemo.threadactivity;

import android.util.Log;

public class ThreeThread extends Thread {
    private int ticket = 10;
    private String name;

    public ThreeThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (ticket > 0){
            ticket-- ;
            Log.e(name, "卖了一张票还剩" + ticket + "张票" );
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
