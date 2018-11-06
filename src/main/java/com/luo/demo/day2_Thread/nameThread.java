package com.luo.demo.day2_Thread;

/**
 * @author：罗金星 date 2018/11/6 11:37
 **/
 class myThread_n implements Runnable {

    @Override
    public void run() {
       System.out.println(Thread.currentThread().getName());
    }
}

public class nameThread {
    public static void main(String[] args) {
      myThread_n mt=new myThread_n();
      new Thread(mt,"线程1").start();
      new Thread(mt,"线程2").start();
      new Thread(mt).start();

    }

}
