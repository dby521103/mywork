package strategy.model;

import strategy.pay.Pay;

/**
 * 支付状态
 */
public class PayState {

    private  String code;

    public PayState(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
