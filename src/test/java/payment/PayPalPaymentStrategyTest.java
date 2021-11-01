package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    private PayPalPaymentStrategy paypal;
    private double price;

    @BeforeEach
    void setUp() {
        paypal = new PayPalPaymentStrategy();
        price = 50;
    }

    @Test
    void pay() {
        assertTrue(paypal.pay(price));
    }
}