package pl.sdacademy.room.payment;

public class CreditCardPaymentGateway implements PaymentGateway {
    @Override
    public void pay(int ammount) throws PaymentGatewayException {
        System.out.printf("Client pays %d using credit card payment service\n",ammount);
    }
}
