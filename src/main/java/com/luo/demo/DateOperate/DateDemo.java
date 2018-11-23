package com.luo.demo.DateOperate;

import java.util.Date;

/**
 * @author：罗金星 date 2018/11/15 22:42
 **/
public class DateDemo {
    public static void main(String[] args) {
        Date date=new Date();
        /**
         * 将long转成日期Date(long time)
         * 将Date转成long gettime
         */
        long current=date.getTime();
        current+=864000000;
        System.out.println(new Date(current));

    }
}
