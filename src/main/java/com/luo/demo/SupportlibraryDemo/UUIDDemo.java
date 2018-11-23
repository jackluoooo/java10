package com.luo.demo.SupportlibraryDemo;

import java.util.UUID;

/**
 * @author：罗金星 date 2018/11/21 10:40
 * UUID生成无重复操作字符串，根据时间戳，重复概率千亿分之一
 * 主键生成
 * 文件进行自动命名处理
 **/
public class UUIDDemo {
    public static void main(String[] args) {
        UUID uid=UUID.randomUUID();
        System.out.println(uid.toString());
    }
}
