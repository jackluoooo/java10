package com.luo.demo.streamDemo;

import java.io.*;

/**
 * @author：罗金星 date 2018/11/30 11:27
 * 实现文件的拷贝操作
 * 拷贝一部分，输出一部分，读取一部分
 **/
public class CopyDemo {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        String src = "D:" + File.separator + "OneKeyBak";
        String des = "D:" + File.separator + "hello" ;
        FileUtil fu = new FileUtil(src, des);
        if (new File(src).isFile()) {//文件拷贝
            System.out.println(fu.copy() ? "文件拷贝成功" : "文件拷贝失败");
        } else {//目录拷贝
            System.out.println(fu.copyDir() ? "目录拷贝成功" : "目录拷贝失败");
        }
        long end = System.currentTimeMillis();
        System.out.println("文件拷贝时间：" + (end - start));
    }
}

class FileUtil {
    private File srcFile;
    private File desFile;

    public FileUtil(String src, String des) {
        this(new File(src), new File(des));
    }

    public FileUtil(File srcFile, File desFile) {
        this.srcFile = srcFile;
        this.desFile = desFile;
    }

    public boolean copyDir() throws  Exception{
        try{
            this.copyImpl(this.srcFile);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    private void copyImpl(File file) throws Exception {
        if (file.isDirectory()) {//是目录
            File result[] = file.listFiles();
            if (result != null) {
                {
                    for (File r : result
                            ) {
                        copyImpl(r);

                    }
                }
            }
        }else {//是文件
             System.out.println(file.getPath().replace(this.srcFile.getPath()+File.separator,""));
             String newFilepath=file.getPath().replace(this.srcFile.getPath()+File.separator,"");
             File newFile=new File(this.desFile,newFilepath);
             this.copyFileImpl(file,newFile);
        }
    }

    /**
     *空文件夹没有copy
     */
    private boolean copyFileImpl(File srcFile, File desFile) throws Exception {
        if (!desFile.getParentFile().exists()) {
            desFile.getParentFile().mkdirs();//创建父目录
        }
        byte data[] = new byte[1024];//开辟一个拷贝的缓冲区
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(srcFile);
            output = new FileOutputStream(desFile);
            int len = 0;
//            while (len!=-1){
//                len=input.read(data);
//                if(len!=-1){
//                    output.write(data,0,len);
//                }
//            }
            while ((len = input.read(data)) != -1) {
                output.write(data, 0, len);
            }
            return true;
        } catch (Exception e) {
            throw e;
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }

        }
    }


    public boolean copy() throws Exception {//文件拷贝处理
        if (!this.srcFile.exists()) {
            System.out.println("拷贝的源文件不存在");
            return false;
        }
        return this.copyFileImpl(this.srcFile, this.desFile);
    }
}