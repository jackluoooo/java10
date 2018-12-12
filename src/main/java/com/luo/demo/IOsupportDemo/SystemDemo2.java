package com.luo.demo.IOsupportDemo;

import java.io.InputStream;

/**
 * @author：罗金星 date 2018/12/2 18:12
 **/
public class SystemDemo2 {
    public static void main(String[] args) throws  Exception{
        InputStream inputStream=System.in;
        System.out.print("请输入信息:");
        byte []data=new byte[1024];
        int len=inputStream.read(data);
        //可能出现data长度不足；也可能出现中文情况
        System.out.println("输入内容为："+new String(data,0,len));
    }
}
