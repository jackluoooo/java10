package com.luo.demo.反射.反射与类;

import java.lang.reflect.Method;

/**
 * @author：罗金星 date 2018/12/13 17:28
 **/
public class Demo2 {
    public static void main(String[] args) throws  Exception{
        //Class<?> cls =P.class;
        Class<?> cls=Class.forName("com.luo.demo.反射.反射与类.P");
        String attribute="name";//要操作的属性
        String value="小强子";//要设置的属性内容
       Object obj=cls.getDeclaredConstructor().newInstance();//调用无参构造方法实例化
        String methodName ="setName";
       Method method=cls.getDeclaredMethod(methodName,String.class);//获取指定的方法(方法名，形参类型)
       method.invoke(obj,value);//等价于：Person对象.setName("")
        String getMethodName="getName";
        Method getMethod = cls.getDeclaredMethod(getMethodName);
        System.out.print(getMethod.invoke(obj));//等价于：Person对象.getName()
    }
}
