package com.luo.demo.IOsupportDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author：罗金星 date 2018/12/2 18:23
 * BufferReader缓冲字符流，利用BufferReader很好的解决输入流读取问题
 * 读取一行数据：public String readLine() throws IOException
 **/
public class BufferReaderDemo {
    public static void main(String[] args) throws  Exception{
        BufferedReader input=new BufferedReader( new InputStreamReader(System.in));
        System.out.print("please input age:");
        String msg=input.readLine();
        if(msg.matches("\\d{1,3}")){//三位以内
            System.out.print("他今年多少岁："+msg);
        }
        input.close();
        //缓冲流，在以后实际的开发过程中。
    }

}
