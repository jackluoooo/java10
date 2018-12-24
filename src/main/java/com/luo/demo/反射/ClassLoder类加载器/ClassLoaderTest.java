package com.luo.demo.反射.ClassLoder类加载器;

import java.lang.reflect.Method;

/**
 * @author：罗金星 date 2018/12/16 22:05
 **/
public class ClassLoaderTest {
    public static void main(String[] args) throws  Exception{
        MyClassLoder classLoder=new MyClassLoder();
        Class<?> cls=classLoder.loadData("com.luo.demo.反射.ClassLoder类加载器.Message");
        System.out.println(cls);
        Object object=cls.getDeclaredConstructor().newInstance();
        Method method=cls.getDeclaredMethod("send");
        method.setAccessible(true);
        method.invoke(object);

    }
}
