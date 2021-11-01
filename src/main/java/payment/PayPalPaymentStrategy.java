package payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.format("Payed %f by PayPal", price);
        return true;
    }
}
