package strategy.model;

import strategy.enums.PayType;
import strategy.pay.Pay;

public class Order {
    private String orderId;
    private String uId;

    public Order(String orderId, String uId) {
        this.orderId = orderId;
        this.uId = uId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }


    /**
     * 根据支付类型调用支付
     * @param payType
     * @return
     */
    public  PayState pay(PayType payType)
    {
        return payType.getPay().pay(this);
    }

}
