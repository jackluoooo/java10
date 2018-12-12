package com.luo.demo.网络编程;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author：罗金星 date 2018/12/5 22:47
 **/
public class EchoServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server=new ServerSocket(9999);//设置服务器端监听端口
        System.out.println("等待客户端连接。。。。。。。");
        Socket client=server.accept();//有客户端连接
        //1.首先需要接收客户端发送来的信息，而后可以将信息处理发送回客户端
        Scanner scanner=new Scanner(client.getInputStream());//客户端输入流
        scanner.useDelimiter("\n");
        PrintWriter out=new PrintWriter(client.getOutputStream());//客户端输出流
        boolean flag=true;
        while (flag){
           if(scanner.hasNext()){
               String val=scanner.next();
               if("byebye".equalsIgnoreCase(val)){
                   out.print("ByeByeBye......");
               }else {
                   out.println("[ECHO]"+val);
               }
           }

        }
        scanner.close();
        client.close();
        server.close();

    }
}
