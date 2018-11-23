package com.luo.demo.SupportlibraryDemo;

import java.util.Arrays;

/**
 * @author：罗金星 date 2018/11/21 10:05
 * 1.二分查找
 * 2.数组比较
 * 3.数组相等判断
 * 4.数组填充
 * 5.排序
 * 6.转为字符串
 **/
public class ArraysDemo {
    public static void main(String[] args) {
//      int data[]=new int[10];
//      Arrays.fill(data,3);
//      System.out.println(Arrays.toString(data));
        binaray();
    }
    public static void sortDemo(){
        int dataA[]=new int[]{1,2,3};
        int dataB[]=new int[]{1,2,3};
        System.out.println(Arrays.equals(dataA,dataB));
    }
    /**
     * 二分查找
     *
     */
    public static void binaray(){
        int data[] =new int[]{1,5,44,5,5,6,82,8,3,4};
        Arrays.sort(data);//数组必须采用升序排序
        System.out.println(Arrays.binarySearch(data,5));
    }
}
