package com.luo.demo.IOsupportDemo;

import java.util.Scanner;

/**
 * @author：罗金星 date 2018/12/2 20:57
 * 实际中，如果程序需要输出数据则使用打印流，输入数据使用Scanner(BufferReader)
 **/
public class ScannnerDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("please scan your name:");
        if(scanner.hasNextInt()){//是否有整数输入.可进行正则匹配
            System.out.println("age:"+scanner.nextInt());
        }
        scanner.close();
    }
}
