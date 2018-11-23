package com.luo.demo.javaClassLibrary;

/**
 * @author：罗金星 date 2018/11/14 15:31
 * Cleaner提供对象清理操作，jdk1.9后不建议使用finalize，建议使用Cleaner与AutoCloseAble
 **/
class  Member{
    public Member(){
        System.out.println("[构造]他诞生了");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("[回收]最终你一定要死");
        throw new Exception("我还要再活500年。。。");
    }
}
public class CleanerDemo {
    public static void main(String[] args) {
        Member mem=new Member();//诞生
        mem=null;//成为垃圾
        System.gc();
        System.out.println("地球照常转动");
    }
}
