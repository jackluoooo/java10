package com.luo.demo.day1_thread;

/**
 * @author：罗金星 date 2018/11/5 13:57
 **/
class MyThread extends Thread {//线程主体类
    private String title;

    public MyThread(String title) {
        this.title = title;
    }

    /*
    多线程需要实现的方法在方法中定义
     */

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.title + "运行，I=" + i);
        }
        super.run();
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        /**
         * run并没有实现多线程，start实现了
         */
        new MyThread("线程A").start();
        new MyThread("线程B").start();
        new MyThread("线程C").start();
       //重复start，抛异常
    }


}
