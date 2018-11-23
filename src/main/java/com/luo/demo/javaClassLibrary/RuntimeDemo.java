package com.luo.demo.javaClassLibrary;

/**
 * @author：罗金星 date 2018/11/14 13:44
 * Runtime
 **/
public class RuntimeDemo  {
    public static void main(String[] args) {
        Runtime run=Runtime.getRuntime();
        System.out.println(run.availableProcessors());
        System.out.println("[1]Max:"+run.maxMemory());
        System.out.println("[1]Total:"+run.totalMemory());
        System.out.println("[1]Free:"+run.freeMemory());
        String str="";
        for(int i=0;i<50000;i++){
            str+="www";
        }
        System.out.println("[2]Max:"+run.maxMemory());
        System.out.println("[2]Total:"+run.totalMemory());
        System.out.println("[2]Free:"+run.freeMemory());
        run.gc();
        System.out.println("[3]Max:"+run.maxMemory());
        System.out.println("[3]Total:"+run.totalMemory());
        System.out.println("[3]Free:"+run.freeMemory());

    }
}
