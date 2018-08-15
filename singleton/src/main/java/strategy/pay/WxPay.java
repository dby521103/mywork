package strategy.pay;

import strategy.model.Order;
import strategy.model.PayState;

public class WxPay implements Pay {


    @Override
    public PayState pay(Order order) {
        System.out.println("正在查询！");
        System.out.println("支付成功！");
        PayState state = new PayState("001");
        return state ;
    }


}
