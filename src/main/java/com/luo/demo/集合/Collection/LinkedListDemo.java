package com.luo.demo.集合.Collection;

import java.util.LinkedList;
import java.util.List;
/**
 * @author：罗金星 date 2018/12/22 12:10
 **/
public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> all = new LinkedList<String>();
        all.add("hello");
        all.add("hello");
        all.add("world");
        all.add("ljx");
        all.forEach((e) -> {
            System.out.println(e);
        });
    }
}
