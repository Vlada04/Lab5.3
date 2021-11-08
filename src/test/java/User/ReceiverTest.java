package User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.CreditCardPaymentStrategy;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    private Receiver receiver;
    private boolean status;
    private boolean status2;

    @BeforeEach
    void setUp() {
        receiver = new Receiver();
        status = true;
        status2 = false;
    }

    @Test
    void update() {
        assertTrue(receiver.update(status));
        assertFalse(receiver.update(status2));
    }
}
