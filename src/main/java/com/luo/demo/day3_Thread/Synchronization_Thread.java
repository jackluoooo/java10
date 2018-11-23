package com.luo.demo.day3_Thread;

/**
 * @author：罗金星 date 2018/11/7 17:11
 **/
class MyThread implements  Runnable{
    int ticket=10;
    @Override
    public void run() {
        while (true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"ticket="+ticket--);
            }else {
                System.out.println("没票了");
                break;
            }
        }

    }
}
public class Synchronization_Thread {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        new Thread(mt,"A").start();
        new Thread(mt,"B").start();
        new Thread(mt,"C").start();
    }

}
