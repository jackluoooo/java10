package com.luo.demo.JavaReDemo;

import java.text.SimpleDateFormat;

/**
 * @author：罗金星 date 2018/11/16 15:28
 * 正则表达式只能判断格式与范围
 **/
public class REtoStringDemo {
    public static void main(String[] args) throws  Exception {
        String str="JHGFhgfg@$$%%7JHHF*&&GHJJHGGJ767897kjgjjf";
        String regex="[^a-zA-Z0-9]+";//正则表达式
      //  System.out.println(str.replaceAll(regex,""));
     //   split();
      //  testDouble();
        //testDate();
        //testTelNo();
        testEmail();
    }
    public static void split(){
        String str="a1b22c333d4444e55555f666666g";
        String regex="\\d+";//正则表达式
        String result[]=str.split(regex);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+"、");
        }

    }
    public  static  void testDouble(){
        String str="100.32";
        String regex ="\\d+(\\.\\d+)?";
        if(str.matches(regex)){
           System.out.println(Double.parseDouble(str));
        }

    }

    public  static  void testDate() throws  Exception{
        String str="1981-10-15";
        String regex="\\d{4}-\\d{2}-\\d{2}";
        if(str.matches(regex)){
            System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse(str));
        }

    }

    public static void testTelNo() throws Exception{
        String str="(010)-51289946";
        String regex = "((\\d{3,4})|(\\(\\d{3,4}\\)-))?\\d{7,8}";
        System.out.println( str.matches(regex));
    }

    public static  void testEmail(){
        String email="2451652673@qq.com";
        String regex="[a-zA-Z0-9]\\w+@\\w+\\.(com|cn|net|com.cn|gov)";//\\w+字母数字下划线
        System.out.println( email.matches(regex));
    }
}
