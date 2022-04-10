package com.java.thread;

/**
 * @ClassName MyThread3
 * @Description TODO
 * @Author oldghoast
 * @Date 2022/3/24 16:56
 * @Version 1.0
 */
public class MyThread3 extends Thread{

    int count = 5;

    public MyThread3(String s){
        this.setName(s);
    }

    @Override
    synchronized public void run(){
        //while(count>0){
            count--;
            System.out.println(Thread.currentThread().getName()+"-count:"+count);
        //}
    }
}
