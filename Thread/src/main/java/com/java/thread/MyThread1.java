package com.java.thread;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author oldghoast
 * @Date 2022/3/24 10:18
 * @Version 1.0
 */
public class MyThread1 extends Thread{

    @Override
    public void run() {
        for(int i=0;i<10000;i++)
        System.out.println(Thread.currentThread().getName());
    }
}
