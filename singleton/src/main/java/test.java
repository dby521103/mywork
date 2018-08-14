import hungry.Hungry;
import lazy.Lazy;
import sysSingon.SysSingon;

import java.security.Signature;
import java.util.concurrent.CountDownLatch;

public class test {

    public static void main(String[] args) {
//
//        System.out.println(Hungry.getHungryInstance());
//        System.out.println(Hungry.getHungryInstance());

        int count = 100;
        final CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i <= count; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {

                        latch.await();
                        System.out.println(SysSingon.getinstance());
                    } catch (Exception e) {

                    }

                }

            }.start();

            latch.countDown();
        }


    }
}
