package delivery;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    private PostDeliveryStrategy pds;
    private List<Item> items;
    private Item rose;
    private Item tulip;
    private Item cactus;

    @BeforeEach
    void setUp() {
        pds = new PostDeliveryStrategy();

        rose = new Flower(FlowerType.ROSE);
        ((Flower) rose).setPrice(10);
        tulip = new Flower(FlowerType.TULIP);
        ((Flower) tulip).setPrice(5);
        cactus = new CactusFlower();
        items = new ArrayList<>();
        items.add(rose);
        items.add(tulip);
        items.add(cactus);
    }

    @Test
    void deliver() {
        assertTrue(pds.deliver(items));
    }
}