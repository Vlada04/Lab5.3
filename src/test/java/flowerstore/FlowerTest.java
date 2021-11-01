package flowerstore;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower1, flower2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.CHAMOMILE);
        flower1.setPrice(10);

        flower2 = new Flower(FlowerType.ROSE);
        flower2.setPrice(30);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(10, flower1.getPrice());
        assertEquals(30, flower2.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flower1.getFlowertype());
        assertEquals(FlowerType.ROSE, flower2.getFlowertype());
    }
}