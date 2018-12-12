package com.luo.demo.streamDemo;

import java.io.*;

/**
 * @author：罗金星 date 2018/11/30 10:49
 **/
public class StreamTransform {
    public static void main(String[] args) throws  Exception{
        File file=new File("D:"+File.separator+"hello"+File.separator+"writer.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();//创建父目录
        }
       OutputStream outputStream=new FileOutputStream(file,true);
        Writer out=new OutputStreamWriter(outputStream);//输出字节流转化为字符流
        out.write("我是 ljx");
        out.close();
    }

}
