package com.java.thread;

/**
 * @ClassName MyThread2
 * @Description TODO
 * @Author oldghoast
 * @Date 2022/3/24 14:49
 * @Version 1.0
 */
public class MyThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("运行中"+Thread.currentThread().getName());
    }
}
