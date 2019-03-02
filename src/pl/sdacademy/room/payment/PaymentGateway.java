package pl.sdacademy.room.payment;

/**
 * A payment strategy
 */

public interface PaymentGateway {
    /**
     * Performs the payment
     *
     * @param ammount
     * @throws PaymentGatewayException if the underlying service failed
     */

    void pay(int ammount ) throws PaymentGatewayException;
}
