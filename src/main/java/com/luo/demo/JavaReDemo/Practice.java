package com.luo.demo.JavaReDemo;

/**
 * @author：罗金星 date 2018/11/16 14:28
 *
 **/
public class Practice {
    public static void main(String[] args) {
   String str="123";
   if(isNumber(str)){
       int num=Integer.parseInt(str);
       System.out.println(num*2);
   }
    }
    public  static boolean isNumber(String str){
        char data[]=str.toCharArray();
        for(int x=0;x<data.length;x++){
            if(data[x]>'9'||data[x]<'0'){
                return false;
            }
        }
        return  true;
    }

}
