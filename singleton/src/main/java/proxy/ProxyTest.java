package proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {


    public static void main(String[] args) {

        //初始化被代理类
        Poson f=new Kevin();

        //初始化代理类
        ProxyHander hander = new ProxyHander(f);

        Class<?> taber = f.getClass();

        //通过jdk Proxy实现动态代理
        Poson proxy = (Poson)Proxy.newProxyInstance(taber.getClassLoader(),taber.getInterfaces(),hander);
        proxy.findWork();

    }
}
