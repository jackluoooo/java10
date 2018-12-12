package com.luo.demo.IOsupportDemo;

import java.io.*;

/**
 * @author：罗金星 date 2018/12/1 23:59
 * 比起用OutputStreamL类，使用PrintWriter,或者PrintStream更加方便
 *
 **/
public class PrintDemo {
    public static void main(String[] args) throws  Exception{
    File file=new File("d:"+File.separator+"20181202_2.txt");
    //PrintUtil printUtil=new PrintUtil(new FileOutputStream(file));
        PrintWriter printWriter=new PrintWriter(new FileOutputStream(file));
        printWriter.println("姓名：小强");
        printWriter.print("年龄：");
        printWriter.println(78);
        printWriter.close();

    }
}
class PrintUtil implements  AutoCloseable{//实现常用数据的输出
    private OutputStream outputStream;

    public PrintUtil(OutputStream outputStream) {
        this.outputStream = outputStream;
    }
    public void println(long num){
        this.println(String.valueOf(num));
    }
    public void print(long num){
        this.print(String.valueOf(num));
    }
    public  void print(String str){
        try {
            this.outputStream.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  void println(String str){
        this.print(str+"\r\n");
    }

    @Override
    public void close() throws Exception {
        this.outputStream.close();
    }
}

