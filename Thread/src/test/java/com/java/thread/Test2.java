package com.java.thread;

/**
 * @ClassName Test2
 * @Description TODO
 * @Author oldghoast
 * @Date 2022/3/25 10:44
 * @Version 1.0
 */
public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        MyThread4 myThread4 = new MyThread4();
        myThread4.start();
        myThread4.interrupt();
        Thread.sleep(2000);
        //Thread.currentThread().interrupt();
        System.out.println("是否停止"+Thread.interrupted());
        System.out.println("是否停止"+Thread.interrupted());
    }

}
