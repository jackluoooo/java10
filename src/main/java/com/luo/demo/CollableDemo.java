package com.luo.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author：罗金星 date 2018/11/5 16:26
 **/
class MyThread_03 implements Callable <String>{

    @Override
    public String call() throws Exception {
        for(int x=0;x<10;x++){
            System.out.println("****线程执行，x="+x);
            }
        return "线程执行完毕";
    }
}

public class CollableDemo  {
    public static void main(String[] args) throws Exception{
        FutureTask<String> task=new FutureTask<>(new MyThread_03());
        new Thread(task).start();
        System.out.println("[线程返回数据]"+task.get());
    }
}
