package com.luo.demo.day5_2_Thread;

/**
 * @author：罗金星 date 2018/11/12 16:09
 **/
class AddThread implements Runnable {
    private Resource resource;

    public AddThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int x = 0; x < 50; x++) {
            try {
                this.resource.add();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class DelThread implements Runnable {
    private Resource resource;

    public DelThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int x = 0; x < 50; x++) {
            try {
                this.resource.delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Resource {
    private int num = 0;
    private boolean flag = true;

    //flag=true,表示可以进行加法操作,不能进行减法操作
    //flag=false，表示可以进行减法操作，不能进行加法操作
    public synchronized void add() throws Exception {
        if (flag == false) {
            super.wait();
        }
        Thread.sleep(100);
        this.num++;
        System.out.println("加法操作-" + Thread.currentThread().getName() + "num=" + num);
        this.flag = false;
        super.notify();
    }

    public synchronized void delete() throws Exception {
        if (flag == true) {
            super.wait();
        }
        Thread.sleep(200);
        this.num--;
        System.out.println("减法操作-" + Thread.currentThread().getName() + "num=" + num);
        this.flag = true;
        super.notify();
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        Resource resource = new Resource();
        AddThread at = new AddThread(resource);
        DelThread dt = new DelThread(resource);
        new Thread(at, "加法操作—A").start();
        new Thread(at, "加法操作—B").start();
        new Thread(dt, "减法操作—X").start();
        new Thread(dt, "减法操作—Y").start();
    }
}
