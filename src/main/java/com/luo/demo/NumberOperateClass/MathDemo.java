package com.luo.demo.NumberOperateClass;

/**
 * @author：罗金星 date 2018/11/15 10:54
 * Math中提供的是基本的数学公式；需要自己重新整合Math类
 **/
class  MathUtil{
    private MathUtil() {
    }
    public static double round(double num,int scale){
        return Math.round(num * Math.pow(10,scale))/Math.pow(10,scale);
    }
}
public class MathDemo {

    public static void main(String[] args) {
//        System.out.println(Math.abs(-10.1));
//        System.out.println(Math.max(10,9));
        System.out.println(MathUtil.round(19.86273,2));
        System.out.println(Math.round(19.86273));
        System.out.println(Math.round(19.49));
        System.out.println(Math.round(19.51));

    }
}
