package com.luo.demo.反射.反射与类;

/**
 * @author：罗金星 date 2018/12/12 11:25
 **/
public class P extends BaseAbstract implements  ImessageService,IChannnelService{
    @Override
    public boolean connect() {
        return true;
    }

    @Override
    public void send() {
      if(this.connect()){
          System.out.println("发送信息");
      }
    }
}
