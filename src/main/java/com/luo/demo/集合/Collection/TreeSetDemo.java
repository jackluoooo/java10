package com.luo.demo.集合.Collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author：罗金星 date 2018/12/22 15:00
 **/
public class TreeSetDemo {
    {  //自动排序
        Set<String> all=new TreeSet<>();
        all.add("hello");
        all.add("hello");
        all.add("world!");
        all.add("ljx");
        all.forEach(System.out::println);
    }
}
