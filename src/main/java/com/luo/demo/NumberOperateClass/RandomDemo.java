package com.luo.demo.NumberOperateClass;

import java.util.Arrays;
import java.util.Random;

/**
 * @author：罗金星 date 2018/11/15 11:19
 * 产生不大于边界的随机数（自然数）
 **/
public class RandomDemo {
    public static void main(String[] args) throws Exception{
//        Random random=new Random();
//        for (int i=0;i<10;i++){
//            System.out.println(random.nextInt(10));
//        }
        int data[]=new int[7];
        Random rand=new Random();
        int foot=0;
        while (foot<7){
            int num=rand.nextInt(37);
            if(isUse(num,data)){
                data[foot++]=num;
            }
        }
        Arrays.sort(data);
        for(int x=0;x<data.length;x++){
        System.out.println(data[x]);
        }

    }
    public static  boolean isUse(int num, int temp[]){
        if(num==0){
            return  false;
        }
        for (int x=0;x<temp.length;x++){
            if (num==temp[x]){
                return false;
            }
        }
        return  true;

    }

}
