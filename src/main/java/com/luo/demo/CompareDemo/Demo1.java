package com.luo.demo.CompareDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author：罗金星 date 2018/11/22 10:33
 * 自定义排序
 **/

class Person implements Comparable<Person> {
    private  String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(this.age<o.age){
            return  -1;
        }else if(this.age>o.age){
            return  1;
        }else {
            return 0;}

    }
}

public class Demo1 {
    public static void main(String[] args) {
//        Integer data[]=new Integer[]{10,9,5,2,20};
//        String data[]=new String[]{"c","b","a"};
      Person  []persons=new Person[]{
              new Person("小花",11),
              new Person("小红",12),
              new Person("小九",13),
      };
        Arrays.sort(persons);
       System.out.println(Arrays.toString(persons));
    }
}
