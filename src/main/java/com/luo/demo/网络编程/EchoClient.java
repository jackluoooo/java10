package com.luo.demo.网络编程;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author：罗金星 date 2018/12/5 23:06
 **/
public  class EchoClient {
    private static final BufferedReader KEYBOARD_INPUT = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost", 9999);//定义服务端的连接信息
        //客户端需要输入与输出操作
        Scanner scan = new Scanner(client.getInputStream());//接受服务器端的接受内容
        PrintWriter out = new PrintWriter(client.getOutputStream());//向服务器段发送内容
        boolean flag = true;
        while (flag) {
            String input = getString("请输入要发送的内容");
            out.println(input);
            if (scan.hasNext()) {//服务器端有回应
                System.out.println(scan.next());
            }
            if (input.equalsIgnoreCase("byebye")) {
                flag = false;
            }
        }
        scan.close();
        out.close();
        client.close();
    }

    public static String getString(String prompt) throws Exception {
        System.out.println(prompt);
        String str = KEYBOARD_INPUT.readLine();
        return str;
    }


}
