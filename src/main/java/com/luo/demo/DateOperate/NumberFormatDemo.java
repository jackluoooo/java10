package com.luo.demo.DateOperate;

import java.text.NumberFormat;

/**
 * @author：罗金星 date 2018/11/16 13:29
 **/
public class NumberFormatDemo {
    public static void main(String[] args) {
        double money=222277777.35;
        String str=NumberFormat.getInstance().format(money);
        System.out.println(str);
    }
}
