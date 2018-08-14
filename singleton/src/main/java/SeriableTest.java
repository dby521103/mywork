import seriable.Seriable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriableTest {


    public static void main(String[] args) {

        try {
            //序列化
            Seriable se = Seriable.getIntence();
            Seriable se2 = null;
            FileOutputStream fis = new FileOutputStream("ser.io");
            ObjectOutputStream oot = new ObjectOutputStream(fis);

            oot.writeObject(se);
            oot.flush();
            oot.close();

            //反序列化
            FileInputStream fs = new FileInputStream("ser.io");
            ObjectInputStream ois = new ObjectInputStream(fs);
            se2 = (Seriable) ois.readObject();

            ois.close();


            System.out.println(se==se2);

        } catch (Exception e) {

        }


    }
}
