package com.luo.demo.day5_2_Thread;

import java.util.Calendar;

/**
 * @author：罗金星 date 2018/11/13 14:45
 **/
class Producer implements Runnable {
    private Resource2 resource;

    public Producer(Resource2 resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int x = 0; x < 50; x++) {
            try {
                this.resource.make();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Resource2 resource;

    public Consumer(Resource2 resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int x = 0; x < 50; x++) {
            try {
                this.resource.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Computer {
    private static int count = 0;
    private String name;
    private double price;

    public Computer(String name, double price) {
        this.name = name;
        this.price = price;
        count++;
    }

    @Override
    public String toString() {
        return "【第" + count + "台电脑】" + "电脑名字;" + this.name + ";电脑价格：" + this.price;
    }
}

class Resource2 {
    private Computer computer;

    public synchronized void make() throws Exception {
        if (this.computer != null) {
            super.wait();
        }
        Thread.sleep(100);
        this.computer = new Computer("lenovo", 1.1);
        System.out.println("生产第"+this.computer);
        super.notifyAll();
    }

    public synchronized void get() throws Exception {
        if (this.computer == null) {
            super.wait();
        }
        System.out.println(this.computer.toString());
        this.computer = null;
        super.notifyAll();
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        Resource2 resource2=new Resource2();
        new Thread(new Producer(resource2)).start();
        new Thread(new Consumer(resource2)).start();
    }
}
