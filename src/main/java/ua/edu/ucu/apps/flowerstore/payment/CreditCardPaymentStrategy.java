package ua.edu.ucu.apps.flowerstore.payment;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double price) {
        System.out.println("Paying...");
    }

}
