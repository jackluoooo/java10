package com.luo.demo.反射;

/**
 * @author：罗金星 date 2018/12/3 9:49
 **/
public class Demo2 {
    public static void main(String[] args) throws Exception {
        /**
         * 反射的所有操作都通过Class类
         */
//        Person person=new Person();
//        Class<? extends  Person> cls=person.getClass();
//        Class<? extends  Person> cls=Person.class;//JVM所支持-----2
        Class<?> cls = Class.forName("com.luo.demo.反射.Person0");//----3
        System.out.println(cls.getName());
    }
}

class Person {

}
