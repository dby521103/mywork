package facaoryall;
public class Order {

    private  String orderNo;
    private  String orderName;

    public Order() {
    }

    public Order(String orderNo, String orderName) {
        this.orderNo = orderNo;
        this.orderName = orderName;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }




}
