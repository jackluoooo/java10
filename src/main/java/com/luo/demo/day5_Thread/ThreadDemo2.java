package com.luo.demo.day5_Thread;

/**
 * @author：罗金星 date 2018/11/12 15:18
 **/
public class ThreadDemo2 {
    public static void main(String[] args) throws Exception{
        Thread userThread=new Thread(()->{
            for (int x=0;x<10;x++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在运行x="+x);
            }
        },"用户线程");
        //守护线程,跟随其他线程执行而执行
        Thread daemonThread=new Thread(()->{
            for (int x=0;x<Integer.MAX_VALUE;x++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在运行x="+x);
            }
        },"守护线程");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
    }
}
