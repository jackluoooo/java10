package com.luo.demo.classLibraryPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author：罗金星 date 2018/11/26 11:49
 **/
public class HtmlSplitDemo {
    public static void main(String[] args) {
        String str="<font face=\"Arial,Serif\" size=\"+2\" color=\"red\">";
        String regex="\\w+=\"[a-zA-Z0-9,\\+,]+\"";
        Matcher matcher=Pattern.compile(regex).matcher(str);
        while(matcher.find()){
            String temp =matcher.group(0);
            String result []=temp.split("=");
            System.out.println(result[0]+" "+result[1].replaceAll("\"",""));
        }

    }
}
