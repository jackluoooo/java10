package com.luo.demo.NumberOperateClass;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author：罗金星 date 2018/11/15 22:00
 * BigInterger
 * BigDecimal
 **/
public class BignumberDemo {
    public static void main(String[] args) {
        BigInteger bigA=new BigInteger("234567234567234567234567234567234567234567");
        BigInteger bigB=new BigInteger("23456723456723456");
        System.out.println("加法操作"+bigA.add(bigB));
        System.out.println("减法操作"+bigA.subtract(bigB));
        System.out.println("除法操作"+bigA.multiply(bigB));
        System.out.println("除法操作"+bigA.divide(bigB));
//        System.out.println(bigA.pow(Integer.MAX_VALUE));//乘方计算过程非常缓慢
        BigInteger result []=bigA.divideAndRemainder(bigB);
        System.out.println("商："+result[0]+" 余数："+result[1]);
        //BigDecimal big_A=new BigDecimal("2234444");
    }


}
