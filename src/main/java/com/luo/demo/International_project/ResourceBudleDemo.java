package com.luo.demo.International_project;

import sun.plugin2.message.Message;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author：罗金星 date 2018/11/19 13:51
 * java.util.MissingResourceException
 **/
public class ResourceBudleDemo {
    public static void main(String[] args) throws  Exception{
        //指定区域的资源文件>默认本地资源文件>公共资源文件
        ResourceBundle resourceBundle=ResourceBundle.getBundle("Messages",Locale.US);
        String val=resourceBundle.getString("info");
        //解决乱码问题
       // System.out.println(new String(val.getBytes("ISO-8859-1"),"gbk"));
       // System.out.println(val);
        update();
    }

    /**MessageFormat进行占位符更改。
     *
     * @throws Exception
     */
    public  static  void update()throws  Exception{
        ResourceBundle resourceBundle=ResourceBundle.getBundle("Messages",Locale.CHINA);
        String val=resourceBundle.getString("info");
        System.out.println(new String(MessageFormat.format(val,"mldn").getBytes("ISO-8859-1"),"gbk"));
    }
}
