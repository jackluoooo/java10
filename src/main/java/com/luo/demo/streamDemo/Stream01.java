package com.luo.demo.streamDemo;

import java.io.*;

/**
 * @author：罗金星 date 2018/11/29 10:35
 * 字节处理流;OutputStream(输出字节流)，inputStream(输入字节流)
 * 字符处理流：Writer(输出字符流)，Reader(输入字符流)
 * 全是abstract类，所以实例化他们的子类
 * 流是资源操作，资源操作必须关闭
 **/

public class Stream01 {
    public static void main(String[] args) throws Exception{
        //outputStream();
        //inputStream();
       // writerDemo();
        readerDemo();

    }
    /**
     *  OutputStream implements Closeable, Flushable
     */
    public static  void outputStream() throws Exception{
        File file=new File("D:"+File.separator+"hello"+File.separator+"ljx.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();//创建父目录
        }
       try ( OutputStream output=new FileOutputStream(file,true))//通过子类实例化)
              {
                  String str="www.ljx.com\r\n";//要输出文件的内容
                  output.write(str.getBytes());//将字符串变成字节数组，从内存输出到txt
                  output.close();//关闭资源,如果没关闭，任然可以正常输出
              }catch (IOException e){

       }
        //output.close();//关闭资源
    }
    /**
     *  inputStream 将文件内容读入到内存
     */
    public static  void inputStream() throws Exception{
        File file=new File("D:"+File.separator+"hello"+File.separator+"ljx.txt");
        InputStream inputStream=new FileInputStream(file);
        byte data []=new byte[2048];//开辟一个缓冲区读取数据
        int length=inputStream.read(data);
        System.out.println("["+new String(data,0,length)+"]");
        inputStream.close();
    }
    /**
     *  Writer 字符输出流，将文件内容读入到内存,输出以char为主
     */
    public static  void writerDemo() throws Exception{
        File file=new File("D:"+File.separator+"hello"+File.separator+"writer.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();//创建父目录
        }
        Writer writer=new FileWriter(file,true);
        String str="this.writer\r\n";
        writer.write(str);
        writer.append("my name is ljx\r\n");//追加输出
        writer.flush();//强制输出缓冲区内容
      //  writer.close();//没有关闭则无法进行输出//因为writer使用了缓冲区
    }
    /**
     * reader字符输入流
     */
    public static  void readerDemo() throws  Exception{
        File file=new File("D:"+File.separator+"hello"+File.separator+"writer.txt");
        if(file.exists()){
            Reader in=new FileReader(file);
            char data[]=new char[1024];
           int len= in.read(data);
            System.out.println("读取内容："+new String(data ,0,len));
            in.close();
        }
    }

}
