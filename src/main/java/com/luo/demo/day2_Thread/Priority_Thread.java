package com.luo.demo.day2_Thread;

/**
 * @author：罗金星 date 2018/11/7 16:53
 **/
public class Priority_Thread {
    public static void main(String[] args) {
        Runnable run=()->{
            for (int x=0;x<10;x++){
                System.out.println(Thread.currentThread().getName()+"执行");
            }
        };
        Thread threadA=new Thread(run,"线程对象A");
        Thread threadB=new Thread(run,"线程对象B");
        Thread threadC=new Thread(run,"线程对象C");
        threadA.setPriority(1);
        threadB.setPriority(5);
        threadC.setPriority(10);
        threadA.start();
        threadB.start();
        threadC.start();

        //线程优先级高的可能先执行而不是一定执行。

    }
}
