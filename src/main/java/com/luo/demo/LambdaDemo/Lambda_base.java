package com.luo.demo.LambdaDemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author：罗金星 date 2018/11/21 17:03
 * 1. 不需要参数,返回值为 5
 * () -> 5
 * /2. 接收一个参数(数字类型),返回其2倍的值
 * x -> 2 * x
 * /3. 接受2个参数(数字),并返回他们的差值
 * (x, y) -> x – y
 * /4. 接收2个int型整数,返回他们的和
 * (int x, int y) -> x + y
 * /5. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)
 * (String s) -> System.out.print(s)
 **/
public class Lambda_base {
    public static void main(String[] args) {
        lambda_for();
    }
    public static void lambda_for(){
        String []atp={"1","2","3","4","5","6","7","8","9","10"};
        List<String> numbers=Arrays.asList(atp);
//        for(String n:numbers){
//            System.out.println(n);
//        }
  //      numbers.forEach((n)->System.out.println(n));
        numbers.forEach(System.out::println);
    }
}
