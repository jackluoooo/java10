package com.luo.demo.javaClassLibrary;

/**
 * @author：罗金星 date 2018/11/14 11:12
 * AutoCloseable资源处理；实现资源关闭及释放（文件，数据库。。。）
 **/
interface IMessage extends AutoCloseable {
    public void send();
}

class NetMessage implements IMessage {
    private String msg;

    public NetMessage(String msg) {
        this.msg = msg;
    }

    public boolean open() {
        System.out.println("[OPEN]获取消息发送连接资源");
        return true;
    }

    @Override
    public void close() throws Exception {
        System.out.println("关闭消息发送通道");
    }

    @Override
    public void send() {
        System.out.println("[***发送消息***]" + this.msg);
    }
}

public class AutoCloseableDemo {
    public static void main(String[] args) throws Exception {//AutoCloseable 必须结合异常
        try (IMessage nm = new NetMessage("www.baidu.com")) {
            nm.send();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
