package seriable;

import java.io.Serializable;

/**
 * 序列化
 * 序列化 将对象专成字节 写入到磁盘IO流中进行传输
 * 反序列化 将序列化的IO流专成对象进行操作
 *
 */
public class Seriable  implements Serializable  {

    public  final  static Seriable seriable = new Seriable();

    public  static  Seriable getIntence()
    {
        return  seriable;
    }


    private Object readResolve(){
        System.out.println("read resolve");
        return seriable;
    }
}
