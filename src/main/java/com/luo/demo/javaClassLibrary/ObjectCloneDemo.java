package com.luo.demo.javaClassLibrary;

/**
 * @author：罗金星 date 2018/11/14 21:44
 **/
class  M implements  Cloneable{
    private String name;
    private int age;
    public M(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return  "["+super.toString()+"]name="+this.name+",age="+this.age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ObjectCloneDemo {
    public static void main(String[] args) throws  Exception {
        M memberA=new M("ljx",30);
        M memberB=(M)memberA.clone();
        System.out.println(memberA);
        System.out.println(memberB);
    }

}
