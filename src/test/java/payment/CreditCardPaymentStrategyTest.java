package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    private CreditCardPaymentStrategy credit;
    private double price;

    @BeforeEach
    void setUp() {
        credit = new CreditCardPaymentStrategy();
        price = 50;
    }

    @Test
    void pay() {
        assertTrue(credit.pay(price));
    }
}