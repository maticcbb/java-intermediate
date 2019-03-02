package pl.sdacademy.room.payment;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = choosePaymentGateway();
        ShoppingCart cart = makeAnOrder();
    }

    private static ShoppingCart makeAnOrder() {
        return new ShoppingCart(new OrderLine("tea",50,10));
    }

    private static PaymentGateway choosePaymentGateway() {
        Scanner scanner = new Scanner(System.in);
        String strategy = scanner.next();
        if("CreditCard".equals(strategy)){
            return  new CreditCardPaymentGateway();
        }
        return null;

    }
}
