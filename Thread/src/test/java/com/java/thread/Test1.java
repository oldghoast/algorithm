package com.java.thread;

/**
 * @ClassName Test
 * @Description TODO
 * @Author oldghoast
 * @Date 2022/3/24 09:19
 * @Version 1.0
 */
public class Test1 {

//    public static void main(String[] args) throws InterruptedException {
//        MyThread1 myThread = new MyThread1();
//        myThread.start();
//        Thread.sleep(200);
//        System.out.println("结束");
//    }

//    public static void main(String[] args) {
//        for(int i=0;i<5;i++){
//            new Thread(){
//                @Override
//                public void run() {
//                    try {
//                        Thread.sleep(500000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }.start();
//        }
//    }

//    public static void main(String[] args) {
//        MyThread1 myThread = new MyThread1();
//        myThread.setName("my");
//        myThread.start();
//        for (int i = 0;i<10000;i++){
//            System.out.println(Thread.currentThread().getName());
//        }
//    }

//    public static void main(String[] args) {
//        MyThread2 myThread2 = new MyThread2();
//        Thread thread = new Thread(myThread2);
//        thread.start();
//        System.out.println("结束");
//        System.out.println(Thread.currentThread().getName());
//    }

    public static void main(String[] args) {
//        MyThread3 myThread1 = new MyThread3("A");
//        MyThread3 myThread2 = new MyThread3("B");
//        MyThread3 myThread3 = new MyThread3("C");
//        myThread1.start();
//        myThread2.start();
//        myThread3.start();
        MyThread3 myThread = new MyThread3("A");
        Thread thread1 = new Thread(myThread,"A");
        Thread thread2 = new Thread(myThread,"B");
        Thread thread3 = new Thread(myThread,"C");
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
