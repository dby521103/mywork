package hungry;

/**
 * 单例模式--饿汉模式--线程安全
 * 优点：线程安全
 * 缺点：资源浪费
 *
 */
public class Hungry {
    private static final  Hungry hungry = new Hungry();

    private Hungry() {

    }

    public  static Hungry  getHungryInstance()
    {

//        if(hungry==null)
//        {
//            hungry = new Hungry();
//        }

        return  hungry;
    }

}
