package facaoryall.abstrator;


import facaoryall.model.Milk;

public  abstract class AbstractFactory {

    /**
     * 获取特仑苏
     * @return
     */
    public abstract Milk getTelunsu();

    /**
     * 蒙牛
     * @return
     */
    public abstract  Milk getMengniu();



}
