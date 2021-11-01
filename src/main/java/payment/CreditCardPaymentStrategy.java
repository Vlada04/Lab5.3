package payment;

public class CreditCardPaymentStrategy implements Payment{

    @Override
    public boolean pay(double price) {
        System.out.format("Payed %f by Credit Card", price);
        return true;
    }
}
