package com.luo.demo.day5_Thread;

/**
 * @author：罗金星 date 2018/11/12 15:36
 **/
class MyThered implements Runnable {
    private volatile int ticket = 10;

    @Override
    public void run() {
        synchronized (this) {
            while (this.ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "还剩：" + --this.ticket);
            }
        }

    }
}

public class Thread_volatile {
    public static void main(String[] args) {
        MyThered mt = new MyThered();
        new Thread(mt, "票贩子A").start();
        new Thread(mt, "票贩子B").start();
        new Thread(mt, "票贩子C").start();
    }

}
