package com.luo.demo.反射;

/**
 * @author：罗金星 date 2018/12/3 10:14
 * newInstance 代替 new 关键字
 **/

interface IMessage {
    public void send();//消息发送
}

class NetMessage implements IMessage {
    @Override
    public void send() {
        System.out.println("网络消息发送");
    }
}

class CloudMessage implements IMessage {
    @Override
    public void send() {
        System.out.println("云消息发送");
    }
}

/**
 * 反射与工厂设计模式
 */
class Factory {
    private Factory() {
    }//构造方法私有化

    /**
     * 获取接口实例化对象
     *
     * @param className 接口的子类
     * @param clazz     描述一个接口类型
     * @param <T>
     * @return 如果子类存在则返回指定接口实例化对象
     */
    public static <T> T getInstance(String className, Class<T> clazz) {
//        if("netmessage".equalsIgnoreCase(className)){
//          return  new NetMessage();
//        }else if("cloudmessage".equalsIgnoreCase(className)){
//            return  new CloudMessage();
//        }
        T instance = null;
        try {
            instance = (T) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }

}

/**
 * 反射与单例设计模式-----懒汉式 Runtime,Spring
 */
class Singleton {
    private static volatile Singleton instance = null;//取得主内存中数据

    private Singleton() {
        System.out.println("构造方法实例化");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {//实例化过后，？？？？？？？
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void println() {
        System.out.println("www.ljx.cn");
    }
}

public class Practice1 {
    public static void main(String[] args) throws Exception {
//    Class<?> cls=Class.forName("com.luo.demo.反射.Person0");
//    Object obj=cls.newInstance();//Jdk1.9后被废除，因为只能调用无参构造，所以开发者描述得不准确
//        System.out.println(obj);//输出对象调用toString
//        testFactory();
        Singleton sinA = Singleton.getInstance();
        sinA.println();
    }

    public static void testFactory() {
        IMessage msg = Factory.getInstance("com.luo.demo.反射.NetMessage", IMessage.class);
        msg.send();
    }
}
