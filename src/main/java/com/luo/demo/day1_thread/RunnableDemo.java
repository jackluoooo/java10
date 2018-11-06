package com.luo.demo.day1_thread;

/**
 * @author：罗金星 date 2018/11/5 14:57
 **/
class MyThread_2 implements Runnable {//线程主体类
    private String title;

    public MyThread_2(String title) {
        this.title = title;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.title + "运行，I=" + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        /**
         * 将runnabl接口对象，传入Thread构造方法
         * 消除单继承局限性
         */
//        Thread thread_a = new Thread(new MyThread_2("线程A"));
//        Thread thread_b = new Thread(new MyThread_2("线程A"));
//        Thread thread_c = new Thread(new MyThread_2("线程A"));
//        thread_a.start();
//        thread_b.start();
//        thread_c.start();

        /**
         * lambda表达式方法
         */
        for (int x = 0; x < 3; x++) {
            String title = "线程对象-" + x;
//            Runnable run = () -> {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(title + "运行，I=" + i);
//                }
//            };
            new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(title + "运行，I=" + i);
                }
            }).start();
        }
/**
 * 在进行Thread启动多线程时调用的是Start()方法，而后找到的是run方法
 *
 *
 */

    }

}
