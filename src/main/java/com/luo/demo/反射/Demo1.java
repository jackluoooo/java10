package com.luo.demo.反射;

import java.util.Date;

/**
 * @author：罗金星 date 2018/12/3 9:45
 **/
public class Demo1 {
    public static void main(String[] args) {
        /**
         * Object类获取对象信息
         */
        Date date=new Date();
        System.out.println(date.getClass());
    }
}
