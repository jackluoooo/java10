package com.luo.demo.SupportlibraryDemo;

import java.util.Optional;

/**
 * @author：罗金星 date 2018/11/21 10:49
 * Optional对空的控制
 * 要么用orElse
 * 要么用of设置；get获取
 **/
public class OptionnalDemo {
    public static void main(String[] args) {

   // MessageUtil.useMessage(MessageUtil.getMessage().get());//获取;get获取报错No value present
        MessageUtil.useMessage(MessageUtil.getMessage().orElse(new MessageImpl()));

    }
}
class  MessageUtil{
    public static Optional<Imessage> getMessage(){
     //   return  Optional.of(new MessageImpl()) ;//of设置时则名令要求不能为空
        return  Optional.ofNullable(null);
    }
     public static void useMessage(Imessage msg){
        //在接收的时候判空
        if (msg!=null){
            System.out.println(msg.getContent());
        }

     }
}

interface  Imessage{
    public String getContent();
}
class MessageImpl implements Imessage{
    @Override
    public String getContent() {
        return "www.baidu.com";
    }
}