package com.luo.demo.SupportlibraryDemo;

/**
 * @author：罗金星 date 2018/11/21 14:40
 * 核心资源多线程并发访问
 **/
public class ThreadLocalDemo {
    public static void main(String[] args) {
        new Thread(()->{
            Message message = new Message();
            message.setInfo("第一个线程Hello ！！！！！！");
            Channel.setMessage(message);
            Channel.send();
        },"senderA").start();
        new Thread(()->{
            Message message = new Message();
            message.setInfo("第二个线程Hello ！！！！！！");
            Channel.setMessage(message);
            Channel.send();
        },"senderB").start();
        new Thread(()->{
            Message message = new Message();
            message.setInfo("第三个线程Hello ！！！！！！");
            Channel.setMessage(message);
            Channel.send();
        },"senderC").start();

    }
}

/**
 * ThreadLocal对线程设置对应空间，你设置什么，则对应取什么。
 * 每个线程通过ThreadLocal只允许保存一个数据。
 */
class Channel {//消息发送通道
    private static final ThreadLocal<Message>  THREAD_LOCAL=new ThreadLocal<>();

    public  static void  setMessage(Message m) {
         THREAD_LOCAL.set(m);
    }

    public  static void send() {//发送消息
        System.out.println("[消息发送:]" + THREAD_LOCAL.get().getInfo());
    }
}

class Message {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}