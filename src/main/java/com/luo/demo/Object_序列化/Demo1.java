package com.luo.demo.Object_序列化;

import java.io.*;

/**
 * @author：罗金星 date 2018/12/2 21:28
 * transient关键字更改属性序列化
 **/
@SuppressWarnings("serial")
class Person implements Serializable {//Person可以被序列化
    private transient String name;//transient不序列化，并设置为null
    private int age;

    public Person(String name, int age) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Demo1 {
    private static final File SAVE_FILE = new File("d:" + File.separator + "ljx.person");

    public static void main(String[] args) throws  Exception{
//    saveObject(new Person("ljx",23));
    System.out.println(loadObject());
    }

    public static void saveObject(Object obj) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVE_FILE));
        oos.writeObject(obj);//序列化
        oos.close();
    }

    public static Object loadObject() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SAVE_FILE));
        Object obj = ois.readObject();//反序列化
        ois.close();
        return obj;

    }
}
