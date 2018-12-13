package com.luo.demo.反射.反射与类;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author：罗金星 date 2018/12/13 10:54
 * 获取包名称
 * 获取父类
 * 获取继承父接口
 **/
public class Demo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = P.class;
        Package pack = cls.getPackage();
        // System.out.println(pack.getName());
        // System.out.println(cls.getSuperclass());//获取父类的信息
        Class<?> clazz[] = cls.getInterfaces();
        //System.out.println(clazz[0]+"\n"+clazz[1]);//获取父接口
        //实例化方法替代1.获取构造方法
        Constructor<?>[] constructors = cls.getDeclaredConstructors();//获取全部构造
        for (Constructor<?> cons : constructors) {
            System.out.println(cons);
        }
        //获取有参构造
        Constructor<?> constructor = cls.getConstructor(String.class, int.class);
        Object obj = constructor.newInstance("ljx", 23);//实例化对象
        System.out.println(obj);
        //获取类中的所有方法
        {
            Method[] methods = cls.getMethods();//包含父类中的方法。
            for (Method method : methods) {
                System.out.println(method);
            }
        }
        System.out.println("=====================================");
        //获取类中的方法
        {
            Method[] methods = cls.getDeclaredMethods();//包含父类中的方法。
            for (Method method : methods) {
                System.out.println(method);
            }
        }
        /**
         * end 288
         */
    }
}
