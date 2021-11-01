package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private Flower rose;
    private FlowerPack flowers;

    @BeforeEach
    void setUp() {
        flowers = new FlowerPack();
        rose = new Flower(FlowerType.ROSE);
        rose.setPrice(15);
        flowers.setFlower(rose);
        flowers.setAmount(3);
    }

    @Test
    void getPrice() {
        assertEquals(45, flowers.getPrice());
    }
    @Test
    void Flower() {
        assertEquals(rose, flowers.getFlower());
    }

    @Test
    void getAmount() {
        assertEquals(3, flowers.getAmount());
    }
}