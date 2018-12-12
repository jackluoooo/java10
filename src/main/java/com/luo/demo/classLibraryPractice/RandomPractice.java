package com.luo.demo.classLibraryPractice;

import java.util.Arrays;
import java.util.Random;

/**
 * @author：罗金星 date 2018/11/26 10:08
 **/
class  NumberFactory{
    private static Random random=new Random();
    /**
     * 通过随机数生成一个数组的内容
     */
    public  static  int[] creat(int len){
        int[] data=new int[len];
        int foot=0;
        while (foot<len){
            int num=random.nextInt(30);
            if(num!=0){
                data[foot++]=num;
            }

        }
        return data;
    }
}
public class RandomPractice {
    public static void main(String[] args) {
        int result []=NumberFactory.creat(5);
        System.out.println(Arrays.toString(result));

    }
}
