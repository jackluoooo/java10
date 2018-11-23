package com.luo.demo.javaClassLibrary;

/**
 * @author：罗金星 date 2018/11/13 16:09
 **/
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer strb=new StringBuffer("hello");//可接收String
        change(strb);
       // System.out.println(strb);
        String strA="www.baidu.com";
        System.out.println(System.identityHashCode(strA));
        String strB="www."+"baidu."+"com";//这种初始化，首先找内存空间是否存在该字符串，若有则获取，若没有，则开辟空间
        System.out.println(System.identityHashCode(strB));
        System.out.println(strA==strB);
        System.out.println(strA.equals(strB));
    }
    public static void change( StringBuffer temp){
        temp.append("world!");
    }
    //StringBuilder 方法与StringBuffer功能相同
    //但StringBuilder方法不存在synchronized所以线程不安全
}
