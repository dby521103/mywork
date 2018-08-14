package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 实现动态代理
 * 被代理类必须是接口
 * 才能实现Proxy的字节流实现生存class文件
 */
public class ProxyHander implements InvocationHandler {

    //     * 获取被代理对象引用
    private  Object ob;

    public ProxyHander(Object o) {
        ob =  o;
    }

//    /**
//     * 获取被代理对象引用
//     * @param ob
//     * @return
//     */
//    public  Object getIntence(Object ob)
//    {
//         ob = ob;
//
//         return ob;
//    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        System.out.println("开始代理：请问需要什么？");

        method.invoke(ob,args);
        System.out.println("稍等,请你先登记下");
        return null;
    }
}
