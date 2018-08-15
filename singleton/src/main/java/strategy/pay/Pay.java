package strategy.pay;

import strategy.model.Order;
import strategy.model.PayState;

public interface Pay {

    public PayState pay(Order order);
}
