package com.luo.demo.fileDemo;

import java.io.File;
import java.io.IOException;

/**
 * @author：罗金星 date 2018/11/27 10:09
 * 构造方法
 * public File(String pathname)
 * public File(File parent,String child)
 * 创建方法
 * public boolean creatNewFile()
 * 2. 程序-->JVM-->操作系统函数-->文件处理，可能出现延迟创建情况
 * 3.创建文件必须存在父目录 public File  getParentFile();
 *   创建目录：public boolean mkdirs();
 **/
public class File01 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:" + File.separator +"wow"+ File.separator +"ljx.txt");//File.separator文件分隔符，跨平台
        if(!file.getParentFile().exists()){
            file.mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        } else {
            file.delete();
        }

    }


}
