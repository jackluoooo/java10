package com.luo.demo.JavaReDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author：罗金星 date 2018/11/19 11:23
 * 1.Pattern提供正则表达式的编译（）split------拆分
 * 2.Matcher 类，实现正则匹配处理类--------匹配；替换
 **/
public class RegexDemo {
    public static void main(String[] args) {
//    String str="jjjkjKKHK$#%^$%$%#%%^^&%()^Fyguggug";
//    String regex="[^a-zA-Z]+";
//    Pattern pat=Pattern.compile(regex);
//    String reault []=pat.split(str);//拆分
//        for (int x=0;x<reault.length;x++){
//            System.out.println(reault[x]);
//        }
       // testMatcher();
       // test1();
        test2();
    }
     public static  void testMatcher(){
        String str="101";
        String regex="\\d+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(str);
        System.out.println(matcher.matches());
     }

    /**
     * 匹配分组取值
     */
    public static void  test1(){
        String str="INSERT INTO dept(deptno,dname,loc) values (#{deptno},#{dname},#{loc})";
        String regex="#\\{\\w+\\}";
        Pattern pattern=Pattern.compile(regex);
        Matcher mat= pattern.matcher(str);
        while(mat.find()){//是否匹配成功的内容
          System.out.println(mat.group(0).replaceAll("#|\\{|\\}",""));
        }
    }
     public static  void test2(){
        String j="[{\"jd\":100.0,\"wd\":200.0}," +
                "{\"jd\":100.0,\"wd\":200.0}," +
                "{\"jd\":100.0,\"wd\":200.0}," +
                "{\"jd\":100.0,\"wd\":200.0}]";
        String regex="([0-9]+.[0-9]+)";
        Pattern pattern=Pattern.compile(regex);
        Matcher mat=pattern.matcher(j);
        while (mat.find()){
            System.out.println(mat.group(0));
        }
//        String[] coords=pattern.split(j);
//        for (int i=0;i<coords.length;i++){
//            System.out.println(coords[i]);
//        }
     }


}
