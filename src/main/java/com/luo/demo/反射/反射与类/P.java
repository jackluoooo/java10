package com.luo.demo.反射.反射与类;

/**
 * @author：罗金星 date 2018/12/12 11:25
 **/
public class P extends BaseAbstract implements  ImessageService,IChannnelService{
    private  String name;
    private  int age;
    public P(){}
    public P(String name,int age){
      this.name=name;
      this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "P{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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
