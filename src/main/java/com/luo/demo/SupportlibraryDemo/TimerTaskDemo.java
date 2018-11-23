package com.luo.demo.SupportlibraryDemo;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author：罗金星 date 2018/11/21 15:42
 * 定时器
 **/
class MyTask extends TimerTask{
    @Override
    public void run() {
     System.out.println(Thread.currentThread().getName()+"、定时任务执行，当前时间"+System.currentTimeMillis());
    }
}
public class TimerTaskDemo {
    public static void main(String[] args) throws  Exception{
        Timer timer=new Timer();
        timer.scheduleAtFixedRate(new MyTask(),100,1000);
        timer.schedule(new MyTask(),1000);
    }
}
