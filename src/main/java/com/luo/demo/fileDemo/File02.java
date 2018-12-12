package com.luo.demo.fileDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * @author：罗金星 date 2018/11/27 10:09
 **/
class MathUtil{
    private MathUtil(){}
    public static double round(double num,int scale){
        return  Math.round(Math.pow(10,scale)*num)/Math.pow(10,scale);//round四舍五入取整
    }
}
public class File02 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:" + File.separator +"wen.jpg");//File.separator文件分隔符，跨平台
        System.out.println("文件是否可读："+file.canRead());
        System.out.println("文件是否可写："+file.canWrite());
        System.out.println("文件大小："+MathUtil.round(file.length()/(double)1024/1024,2));
        System.out.println("最后修改时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified()));
        System.out.println("是否为文件"+file.isFile());
        System.out.println("是否为目录"+file.isDirectory());
        File file2=new File("D:"+File.separator);
        if(file2.isDirectory()){
            File result []=file2.listFiles();
            for (int x =0;x< result.length;x++){
                System.out.println(result[x]);
            }
        }
    }


}
