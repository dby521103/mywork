
package facaoryall;


import facaoryall.abstrator.AbstractFactory;
import facaoryall.abstrator.MilkFacoryImpl;

public class Test {



    public static void main(String[] args) {

//      MilkFactory milkFactroy = new MinkFactoryImp();
       AbstractFactory milkFacory = new MilkFacoryImpl();
        System.out.println(milkFacory.getTelunsu().getName());

        System.out.println(milkFacory.getMengniu().getName());



    }



}
