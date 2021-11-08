package User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    private Sender sender;
    private boolean status;
    private boolean status2;

    @BeforeEach
    void setUp() {
        sender = new Sender();
        status = true;
        status2 = false;
    }

    @Test
    void update() {
        assertTrue(sender.update(status));
        assertFalse(sender.update(status2));
    }
}
