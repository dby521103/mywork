package facaoryall.abstrator;


import facaoryall.model.Mengniu;
import facaoryall.model.Milk;
import facaoryall.model.Telusu;

/**
 * 抽象工厂实现类
 */
public class MilkFacoryImpl extends AbstractFactory {

    @Override
    public Milk getTelunsu() {
        return new Telusu();
    }

    @Override
    public Milk getMengniu() {
        return new Mengniu();
    }


}
