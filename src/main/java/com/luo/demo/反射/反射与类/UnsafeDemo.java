package com.luo.demo.反射.反射与类;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author：罗金星 date 2018/12/13 21:42
 **/
public class UnsafeDemo {
    public static void main(String[] args) throws Exception{
        Field field=Unsafe.class.getDeclaredField("theUnsafe");
         field.setAccessible(true);//解除封装
       Unsafe unsafe= (Unsafe) field.get(null);//static属性不需要
       //利用了Unsafe类绕过了JVM管理机制，可以在没有实例化对象的情况下获得一个Singleton对象
        Singleton instance= (Singleton)unsafe.allocateInstance(Singleton.class);
        instance.print();

    }
}

class Singleton{
    private Singleton(){
        System.out.print("构造");
    }
     public void print(){
        System.out.print("wow====wow");
    }
}
