package facaoryall.factory;


import facaoryall.model.Mengniu;
import facaoryall.model.Milk;
import facaoryall.model.Telusu;
import facaoryall.factory.*;

public class MinkFactoryImp implements MilkFactory {
    public Milk getTelunsu() {
        return new Telusu();
    }

    public Milk getMengniu() {
        return new Mengniu();
    }
}
