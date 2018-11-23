package com.luo.demo.javaClassLibrary;

/**
 * @author：罗金星 date 2018/11/14 15:12
 **/
public class SystemDemo {
    public static void main(String[] args) {
        String str="";
        for (int i=0;i<40000;i++){
            str+="a";
        }
        System.gc();//等同于runtime 里的GC

    }
}
