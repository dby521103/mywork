package lazy;

/**
 * 单例--懒汉模式
 * 此写法线程不安全
 * 性能高
 */
public class Lazy {

    private static Lazy lazy = null;

    private  Lazy (){}

    public static Lazy GetIntence()
    {
        if (lazy==null)
        {
            lazy = new  Lazy();
        }

        return  lazy;
    }
}
