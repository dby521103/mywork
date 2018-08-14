package sysSingon;

/**
 * 单利模式 成熟写法
 * 解决性能及线程安全问题
 */
public class SysSingon {

    private  static  boolean synchronizeds = false;


    public  SysSingon() {

        synchronized (SysSingon.class)
        {
            if(synchronizeds==false)
            {
                synchronizeds=!synchronizeds;
            }else {
                throw new RuntimeException("想想就行了");
            }
        }

    }


    public static  SysSingon getinstance()
    {
       return  Neibulei.sysSingon;
    }



    private static  class  Neibulei
    {
       private static final SysSingon sysSingon = new SysSingon();

    }

}
