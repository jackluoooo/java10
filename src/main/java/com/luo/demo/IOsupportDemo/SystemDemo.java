package com.luo.demo.IOsupportDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author：罗金星 date 2018/12/2 17:50
 * System系统类
 **/
public class SystemDemo {
    public static void main(String[] args)  throws  Exception{
//        System.err.println("xxxxxx");//是用红色字体输出
        System.setErr(new PrintStream(new FileOutputStream(new File("d:"+File.separator+"System.txt"))));
        try{
            Integer.parseInt("a");
        }catch (Exception e){
            System.out.println(e);
            System.err.println(e);//输出到文件中
        }
    }
}
