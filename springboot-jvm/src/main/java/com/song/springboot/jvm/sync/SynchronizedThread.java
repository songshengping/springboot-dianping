package com.song.springboot.jvm.sync;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Jeremy
 * @Description //TODO
 * @Date 2020-11-24 16:36
 **/
public class SynchronizedThread implements Runnable{
    @Override
    public void run() {

    }

    private void 普通方法(){
        System.out.println(Thread.currentThread().getName() + new SimpleDateFormat("hh:MM:ss").format(new Date()));
    }

    private void 锁住对象(){
        synchronized (this){
            System.out.println(Thread.currentThread().getName() + new SimpleDateFormat("hh:MM:ss").format(new Date()));
        }
    }
    private synchronized void 锁住方法(){
        synchronized (this){
            System.out.println(Thread.currentThread().getName() + new SimpleDateFormat("hh:MM:ss").format(new Date()));
        }
    }
}
