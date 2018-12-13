package com.luo.demo.反射.反射与类;

import java.lang.reflect.Field;

/**
 * @author：罗金星 date 2018/12/13 17:56
 **/
public class Demo3 {
    /**
     * 获取类中的成员
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("com.luo.demo.反射.反射与类.P");//获取指定类的Class对象
        {   //取得父类public成员信息
            Field fileds[] = cls.getFields();
            for (Field fie : fileds) {
                System.out.println(fie);
            }
        }
        System.out.println("========");
        {//获取子类中的成员
            Field fileds[] = cls.getDeclaredFields();
            for (Field fie : fileds) {
                System.out.println(fie);
            }
            //Field类
            //set设置属性内容，获取属性内容
            Object obj = cls.getConstructor().newInstance();
            Field nameField = cls.getDeclaredField("name");
            nameField.setAccessible(true);//解除封装
            nameField.set(obj, "番茄强");//等价于：Person对象.name=""
            System.out.print(nameField.getName());
            //获取成员类型
            System.out.println(nameField.getType().getName());
            System.out.println(nameField.getType().getSimpleName());

        }
    }
}
