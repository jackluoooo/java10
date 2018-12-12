package com.luo.demo.classLibraryPractice;

/**
 * @author：罗金星 date 2018/11/26 10:23
 **/
class Validator{//定义一个专门验证Email的程序类
    private Validator(){}
    public  static  boolean isEmail(String email){
        if(email==null||"".equals(email)){
          return  false;
        }
        String regex="\\w+@\\w+\\.\\w+";
        return  email.matches(regex);
    }

}
public class EmailTest {
    public static void main(String[] args) {
//        if(args.length!=1){
//            System.out.println("没有输入初始化参数");
//            System.exit(1);
//        }
        String email = "18434369264@qq.com";
        if(Validator.isEmail(email)){
            System.out.println("输入的eamil正确");
        }else {
            System.out.println("输入的eamil错误");
        }
    }
}

