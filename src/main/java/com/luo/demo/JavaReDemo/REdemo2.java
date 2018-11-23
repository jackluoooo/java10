package com.luo.demo.JavaReDemo;

/**
 * @author：罗金星 date 2018/11/16 14:44
 **/

/**
 * 1.任意字符匹配
 * 2.\\：匹配\
 * 3.\n:匹配换行
 * 4.\t:匹配制表符
 *
 * 1.[abc]:a,b,c中任何一个
 * 2.[^abc]:不存在于a,b,c
 * 3.[a-zA-Z]：表示由任意一个字母组成，不区分大小写
 * 4.[0-9]:数字组成
 * 5..:表示任意一个字符
 * 6.\d:等价于“[0-9]范围”
 * 7.\D:等价于不属于“[0-9]范围”
 * 8.\s:匹配任意一位空格，可能是换行、空格、制表符
 * 9.\S:匹配任意一位非空格
 * 10.\w:匹配字母，数字，下滑线
 * 11.\W:匹配非字母，数字，下滑线
 */
public class REdemo2 {
    public static void main(String[] args) {
        String str="a\n";
        String regex="\\D\\s";
        System.out.println(str.matches(regex));
    }
}
