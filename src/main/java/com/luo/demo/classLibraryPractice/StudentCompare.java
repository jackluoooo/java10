package com.luo.demo.classLibraryPractice;

import java.util.Arrays;

/**
 * @author：罗金星 date 2018/11/26 13:09
 **/
public class StudentCompare {
    public static void main(String[] args) {
        String input = "张三:21:98|李四:22:89|王五:20:70";
        String result[]=input.split("\\|");
        Student students []=new Student[result.length];
        for (int i=0;i<result.length;i++){
            String[] temp=result[i].split(":");
            try {
                students[i] =new Student(temp[0],Integer.parseInt(temp[1]),Double.parseDouble(temp[2]));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }


}

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.score > o.score) {
            return 1;
        } else if (this.score == o.score) {
            if (this.age >= o.age) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}