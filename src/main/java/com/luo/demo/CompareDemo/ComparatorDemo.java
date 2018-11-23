package com.luo.demo.CompareDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author：罗金星 date 2018/11/22 11:13
 **/
class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

}

class PersonComparator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return o1.getAge() - o2.getAge();
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        People[] people = new People[]{
                new People("小花", 11),
                new People("小红", 12),
                new People("小九", 13),
        };
        Arrays.sort(people, new PersonComparator());
        System.out.println(Arrays.toString(people));
    }
}
