package com.luo.demo.集合.Map;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author：罗金星 date 2018/12/22 21:19
 **/
public class TreeMapDemo {
    //可以根据key进行排序。key不允许为空，value可为空
    public static void main(String[] args) {
        Map<String,Integer> map=new TreeMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        System.out.println(map);

    }
}
