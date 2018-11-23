package com.luo.demo.javaClassLibrary;

/**
 * @author：罗金星 date 2018/11/14 11:01
 * CharSequence描述字符串的结构
 * 他的三个子类String;StringBuilder;StringBuffer
 **/

public class CharSequenceDemo {
    public static void main(String[] args) {
        CharSequence str="www.mldn.cn";//子类实例向父接口转型
        System.out.println(str.subSequence(0,4));
    }
}
