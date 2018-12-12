package com.luo.demo.fileDemo;

import java.io.File;

/**
 * @author：罗金星 date 2018/11/27 11:58
 **/
public class FileUpdate {
    public static void main(String[] args) {
        File file = new File("d:" + File.separator);
        renameDir(file);
    }

    public static void renameDir(File file) {
        if (file.isDirectory()) {
            File results[] = file.listFiles();
            if (results != null) {
                for (int x = 0; x < results.length; x++) {
                    renameDir(results[x]);
                    //System.out.println(results[x]);
                }
            }
        } else {
            if (file.isFile()) {
                //    System.out.println(file);
                String fileName = null;
                if (file.getName().contains(".")) {
                    fileName = file.getName().substring(0, file.getName().lastIndexOf(".")) + ".txt";
                } else {
                    fileName = file.getName() + ".txt";
                }
                File newFile = new File(file.getParent(), fileName);
                file.renameTo(newFile);
            }
        }

    }
}
