package com.luo.demo.javaClassLibrary;



/**
 * @author：罗金星 date 2018/11/14 16:04
 **/
class Member2 implements  Runnable{
    public Member2() {
        System.out.println("[构造]，诞生");
    }

    @Override
    public void run() {//执行清除的时候执行的是次操作
        System.out.println("[回收]最终你一定要死");
    }
}

class MemberCleaning implements AutoCloseable{
//    private static final Cleaner cleaner=Cleaner.create(); java.lang.ref .Cleaner 自JDK1.9起已将finalize替代
    @Override
    public void close() throws Exception {

    }
}
public class AutoCloseAbleDemo2 {
}
