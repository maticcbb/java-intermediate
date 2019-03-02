package pl.sdacademy.room.payment;

import java.util.Arrays;
import java.util.List;

public class ShoppingCart {

    private List<OrderLine> orderItems;

    public ShoppingCart(OrderLine... orderItems) {
        this.orderItems = Arrays.asList(orderItems);
    }

    void payForOrder(PaymentGateway paymentGateway) throws PaymentGatewayException {
            paymentGateway.pay(totalCost());
        }

    private int totalCost() {
       int sum = 0;
       for (OrderLine item: orderItems){
            sum+= item.cost();
       }
       return sum;
    }
}
