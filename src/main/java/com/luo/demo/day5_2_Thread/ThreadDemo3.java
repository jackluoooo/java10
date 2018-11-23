package com.luo.demo.day5_2_Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author：罗金星 date 2018/11/13 15:34
 **/
class Mythread implements Callable <String>{
    private boolean flag=false;
    @Override
    public String call() throws Exception {
        synchronized (this){
            if(this.flag==false){
                this.flag=true;
                return  Thread.currentThread().getName()+"抢答成功";
            }
            else {
                return  Thread.currentThread().getName()+"抢答失败";
            }
        }
    }
}
public class ThreadDemo3 {
    public static void main(String[] args) throws  Exception{
        Mythread mt=new Mythread();
        FutureTask<String > taskA=new FutureTask<String>(mt);
        FutureTask<String > taskB=new FutureTask<String>(mt);
        FutureTask<String > taskC=new FutureTask<String>(mt);
        new Thread(taskB,"抢答者B").start();
        new Thread(taskC,"抢答者C").start();
        new Thread(taskA,"抢答者A").start();

        System.out.println(taskA.get());
        System.out.println(taskB.get());
        System.out.println(taskC.get());
    }
}
