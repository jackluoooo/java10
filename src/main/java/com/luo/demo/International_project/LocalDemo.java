package com.luo.demo.International_project;


import java.util.Locale;

/**
 * @author：罗金星 date 2018/11/19 13:36
 * Local类
 * 构造方法
 *
 **/
public class LocalDemo {
    public static void main(String[] args) {
        Locale local=new Locale("zh","CN");
      //  System.out.println(local);
      //  getDefaultLocale();
        System.out.println(Locale.CHINA);//根据常量获得Locale
    }
    public static  void getDefaultLocale(){
        Locale locale=Locale.getDefault();
        System.out.println(locale);
    }

}
