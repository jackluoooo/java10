package com.luo.demo.集合.Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author：罗金星 date 2018/12/22 14:40
 **/
public class HashSetDemo {
    public static void main(String[] args) {
        //自动去重
        Set<String> all=new HashSet<>();
         all.add("hello");
         all.add("hello");
         all.add("world!");
         all.add("ljx");
         all.forEach(System.out::println);
    }
}
