package com.luo.demo.day2_Thread;

/**
 * @author：罗金星 date 2018/11/6 11:19
 **/
public class sonThread {
    public static void main(String[] args) {
        System.out.println("thread1");
        new Thread(()->{
            int temp=0;
            for(int i=0;i<Integer.MAX_VALUE;i++){
                temp+=i;
            }
        });//子线程不影响子线程的执行，执行比较复杂的流程
        System.out.println("thread2");
        System.out.println("thread3");
    }
}
