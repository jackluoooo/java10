package com.luo.demo.DateOperate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author：罗金星 date 2018/11/16 13:07
 **/
public class FormatDemo {
    /**
     * 将日期格式化：public final String format(Date date)
     * 将字符串转为日期: public Date prase(String souce)throws Exception
     * 构造方法：public SimpleDateFormat(String pattern)
     * 年（yyyy）月(MM)日(dd)时（HH）分(mm)秒(ss)毫秒(SS)
     */
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String str=sdf.format(date);//format获得字符串
        System.out.println(str);
        try {
            /**
             * prase获取date
             */
            Date date2=sdf.parse("2019-11-16 13:19:07.198");
            System.out.println(date.getTime());
            System.out.println(date2.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
