package com.luo.demo.JavaReDemo;

/**
 * @author：罗金星 date 2018/11/16 14:36
 * matchesString对正则提示
 **/
public class REdemo {
    public static void main(String[] args) {
        String str="123";
        if(str.matches("\\d+")){
            int num=Integer.parseInt(str);
            System.out.println(num*2);
        }
    }
}
