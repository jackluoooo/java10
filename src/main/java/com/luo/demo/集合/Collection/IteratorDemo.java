package com.luo.demo.集合.Collection;

import java.util.*;

/**
 * @author：罗金星 date 2018/12/22 15:28
 **/
public class IteratorDemo {
    public static void main(String[] args) {
        //Iterator输出
        Set<String> all=new HashSet<>();
        all.add("hello");
        all.add("world!");
        all.add("ljx");
//        Iterator<String> iter=all.iterator();
//        while (iter.hasNext()){
//            String str=iter.next();
//            if("world!".equals(str)){
//               //all.remove("world!");
//                iter.remove();
//            }else {
//            System.out.println(str);}
//        }

        //ListIterator对象，专门为List准备的
        List<String> allList=new ArrayList<>();
        allList.add("hello");
        allList.add("world!");
        allList.add("ljx");
        ListIterator<String> iterator=allList.listIterator();
        System.out.println("由前向后输出");
        while (iterator.hasNext()){
         System.out.println(iterator.next());
        }
        System.out.println("由后向前输出");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    //枚举输出Enumeration 只为Vector类服务
        Vector<String>  stringVector=new Vector<>();
        stringVector.add("hello");
        stringVector.add("world!");
        stringVector.add("ljx");
        Enumeration<String> enumeration=stringVector.elements();
        while (enumeration.hasMoreElements()){
            String str=enumeration.nextElement();
            System.out.println(str);
        }

    }
}
