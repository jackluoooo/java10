package com.luo.demo.SupportlibraryDemo;

import java.util.Base64;

/**
 * @author：罗金星 date 2018/11/21 16:11
 * Base64.Encoder
 * Base64.Decoder
 **/
class StringUtils {
    private static final String SALT = "{WOW}";
    private static final int REPEAT = 5;

    public static String encode(String str) {
        String encStr = str + SALT;
        byte data[] = encStr.getBytes();
        for (int i = 0; i < REPEAT; i++) {
            data = Base64.getEncoder().encode(data);
        }
        return new String(data);
    }
    public static String deCode(String str){
        byte []data=str.getBytes();
        for (int i=0;i<REPEAT;i++){
            data=Base64.getDecoder().decode(data);
        }
        //return new String(data).replaceAll("\\{\\w+\\}","");
        return  new String(data).replace(SALT,"");
    }
}

public class Base64Demo {
    public static void main(String[] args) {
//        String salt ="wow";
//        String msg="www.baidu.com"+"{"+salt+"}";
//        System.out.println(msg.getBytes());
//        String encMsg=new String(Base64.getEncoder().encode(msg.getBytes()));
//        System.out.println(encMsg) ;
//        String oldMsg=new String(Base64.getDecoder().decode(encMsg));
//        System.out.println(oldMsg) ;
        System.out.println(StringUtils.encode("www.baidu.com"));
        System.out.println(StringUtils.deCode(StringUtils.encode("www.baidu.com")));
    }
}
