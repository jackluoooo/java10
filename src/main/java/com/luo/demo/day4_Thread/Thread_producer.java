package com.luo.demo.day4_Thread;

/**
 * @author：罗金星 date 2018/11/12 10:28
 **/
class Message {
    private String title;
    private String content;
    private boolean flag;//表示生产或消费的形式

    //true 表示允许生产，不允许消费
    //false 表示允许消费，不允许生产
    public synchronized void set(String title, String content) {
        if (!this.flag) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.title = title;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
        this.flag = false;//已近生产过了
        super.notify();
    }

    public synchronized String get() {
        if (this.flag == true) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            return this.title + "--" + this.content;
        } finally {
            this.flag = true;//消费完生产
            super.notify();//唤醒等待
        }
    }
}

class Producer implements Runnable {
    private Message msg;

    public Producer(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                this.msg.set("王建", "最帅");
            } else {
                this.msg.set("小高", "猥琐");
            }
        }

    }
}

class Consumer implements Runnable {
    private Message msg;

    public Consumer(Message msg) {
        this.msg = msg;
    }


    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println(this.msg.get());
        }
    }
}

/**
 * 存在问题为什么第一条数据为空
 */
public class Thread_producer {
    public static void main(String[] args) {
        Message msg = new Message();
        new Thread(new Producer(msg)).start();
        new Thread(new Consumer(msg)).start();

    }

}
