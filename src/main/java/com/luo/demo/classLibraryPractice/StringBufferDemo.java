package com.luo.demo.classLibraryPractice;

/**
 * @author：罗金星 date 2018/11/26 9:56
 * 多线程最好用StringBuffer
 **/
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        for (int x = 'a'; x <= 'z'; x++) {
            buf.append((char)x);
        }
        buf.reverse().delete(0,5);
        System.out.println(buf);

    }
}
