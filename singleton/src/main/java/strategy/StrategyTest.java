package strategy;


import strategy.enums.PayType;
import strategy.model.Order;
import strategy.model.PayState;

public class StrategyTest {
    public static void main(String[] args) {


        String payType="WX_PAY";

        Order order = new Order("00258","sbbb");

        System.out.println(order.pay(PayType.valueOf(payType)).toString());

    }
}
