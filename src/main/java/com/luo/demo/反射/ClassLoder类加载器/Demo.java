package com.luo.demo.反射.ClassLoder类加载器;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author：罗金星 date 2018/12/16 20:44
 **/
class Message {
    public void send(){
        System.out.println("my name is ljx");
    }

    public Message() {
    }
}

class MyClassLoder extends ClassLoader {
    private static final String Message_CLASS_PATH="D:"+File.separator+"Message.class";
    /**
     * 进行指定类的加载
     *
     * @param className 类的完整名称“包.类”
     * @return 返回一个指定类的class对象
     * @throws Exception
     */
    public Class<?> loadData(String className) throws Exception {
        byte[] data = this.loadClassData();
        if (data != null) {
            return super.defineClass(className, data, 0, data.length);
        }
        return null;
    }

    private byte[] loadClassData() throws Exception {
        //通过文件进行类加载
        InputStream inputStream = null;
        //把数据加载到内存中
        ByteArrayOutputStream bos = null;
        try {
            bos=new ByteArrayOutputStream();
            //文件流加载
            inputStream = new FileInputStream(new File(Message_CLASS_PATH));
            //将所读到的字节全部取出
            //开辟一个缓冲区读取数据
            byte data[] = new byte[2048];
            int length = 0;
            while ((length = inputStream.read(data, 0, 2048)) > 0) {
                bos.write(data, 0, length);
            }
            byte[] result = bos.toByteArray();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (bos != null) {
                bos.close();
            }

        }
        return null;
    }

}

public class Demo {
    public static void main(String[] args) {
        //观察类加载器
        Class<?> clazz = Message.class;
        //获取当前类的加载器AppClassLoder(应用程序加载器)
        System.out.println(clazz.getClassLoader());
        //获取父类类加载器
        System.out.println(clazz.getClassLoader().getParent());
        //应该还有一个类加载器，但暂时无法看见
        System.out.println(clazz.getClassLoader().getParent().getParent());
        //自定义加载器，原因：系统类中的加载器都是根据ClassPath进行类加载的。
    }


}
