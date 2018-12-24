package com.luo.demo.反射.反射与简单JAVA类;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author：罗金星 date 2018/12/14 17:41
 **/
public class SimpleClassDemo1 {
    public static void main(String[] args) throws Exception {
        /**
         * 属性自动赋值实现思想
         */
        String value = "eno:172763|ename:Smith|job:clerk|hireDate:2018-12-16|salary:15000|";

        Emp empObject = ClassInstanceFactory.create(Emp.class, value);
        System.out.println(empObject);
    }
}

class ClassInstanceFactory {
    private ClassInstanceFactory() {
    }

    /**
     * 实例化对象的创建方法
     *
     * @param clazz 要进行反射的对象
     * @param value 设置对象属性的内容
     * @param <T>   要设置属性内容的对象
     * @return 一个设置好属性内容的对象
     */
    public static <T> T create(Class<?> clazz, String value) {
        //如果要进行简单java类对象设置，类中必须要有无参构造方法
        try {
            Object obj = clazz.getDeclaredConstructor().newInstance();
            BeanUtils.setValue(obj, value);
            return (T) obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}


class BeanUtils {//进行bean处理的类

    private BeanUtils() {
    }

    /**
     * 实现指定对象的属性设置
     *
     * @param obj
     * @param value
     */
    public static void setValue(Object obj, String value) {
        String results[] = value.split("\\|");
        for (int x = 0; x < results.length; x++) {
            //循环设置属性内容
            String attval[] = results[x].split(":");//获取属性名称与内容
            try {
                Field field = obj.getClass().getDeclaredField(attval[0]);
                Method setMethod = obj.getClass().getDeclaredMethod("set" + StringUtils.initcap(attval[0]), field.getType());
                Object val = BeanUtils.convertAttributeValue(field.getType().getName(), attval[1]);
                setMethod.invoke(obj, val);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    private static Object convertAttributeValue(String type, String value) {
        if ("long".equals(type) || "java.lang.Long".equals(type)) {
            return Long.parseLong(value);
        } else if ("int".equals(type) || "java.lang.Integer".equals(type)) {
            return Integer.parseInt(value);
        } else if ("double".equals(type) || "java.lang.Double".equals(type)) {
            return Double.parseDouble(value);
        } else if ("java.util.Date".equals(type)) {
            if (value.matches("\\d{4}-\\d{2}-\\d{2}")) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    return sdf.parse(value);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            } else {
                return new Date();
            }

        } else {
            return value;
        }
        return null;
    }
}

class StringUtils {
    public static String initcap(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.length() == 1) {
            return str.toUpperCase();
        } else {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
    }
}

class Emp {
    private long eno;
    private String ename;
    private String job;
    private Date hireDate;
    private double salary;

    public long getEno() {
        return eno;
    }

    public void setEno(long eno) {
        this.eno = eno;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eNo=" + eno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                '}';
    }
}
