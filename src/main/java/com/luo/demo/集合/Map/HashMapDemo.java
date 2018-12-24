package com.luo.demo.集合.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author：罗金星 date 2018/12/22 20:04
 **/
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String, Integer>(100) ;
        map.put("one",1);
        map.put("two",2);
        map.put("one",101);
        map.put(null,0);
        map.put("zero",null);
//        System.out.println(map.get("one"));
//        System.out.println(map.get(null));
//        System.out.println(map.get("ten"));
        //将map集合变成Set集合
        Set<Map.Entry<String,Integer>> set=map.entrySet();
//        Iterator<Map.Entry<String,Integer>> iterator=set.iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String,Integer> me=iterator.next();
//            System.out.println(me.getKey()+"->"+me.getValue());
//        }
        //foreach遍历
        for(Map.Entry<String,Integer> entry:set){
          System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
