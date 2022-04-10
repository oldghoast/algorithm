package com.java.thread;

/**
 * @ClassName MyThread4
 * @Description TODO
 * @Author oldghoast
 * @Date 2022/3/25 10:43
 * @Version 1.0
 */
public class MyThread4 extends Thread{

    @Override
    public void run(){
        System.out.println("开始");
        for(int i = 0;i<50000;i++){
            System.out.println(i);
        }
       // Thread.currentThread().interrupt();
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
        System.out.println("结束");
    }

}
