package com.luo.demo.集合.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：罗金星 date 2018/12/17 21:23
 * List允许重复
 * ArrayList,LinkedList,Vector
 **/
public class ArrayListDemo {
    //ArrayList源代码
    public static void main(String[] args) {
        //最好加上长度，避免重复及指向----性能是一点点省出来的。
        List<String> all=new ArrayList<String>(100);
        all.add("hello");
        all.add("hello");
        //重复数据
        all.add("world");
        all.add("ljx");
//        System.out.println(all);
        all.forEach((e)->{
            System.out.println(e);
        });
    }




}
