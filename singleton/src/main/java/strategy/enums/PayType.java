package strategy.enums;

import strategy.model.Order;
import strategy.model.PayState;
import strategy.pay.AliPay;
import strategy.pay.Pay;
import strategy.pay.WxPay;

import java.sql.Statement;

public enum PayType {


    WX_PAY(new WxPay()),ALI_PAY(new AliPay());

    private Pay pay;

    private PayType(Pay pay) {
        this.pay = pay;
    }

    public Pay getPay() {
        return pay;
    }




}
