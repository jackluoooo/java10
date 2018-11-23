package com.luo.demo.day5_Thread;

/**
 * @author：罗金星 date 2018/11/12 14:43
 **/
public class ThreadDemo {
    public static  boolean flag=true;
    public static void main(String[] args) throws Exception {
        new Thread(()->{
            long num=0;
            while (flag){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在运行，num="+num++);
            }
        },"执行线程").start();
        Thread.sleep(200);
        flag=false;
    }
}
