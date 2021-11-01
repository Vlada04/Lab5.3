package delivery;

import flowerstore.CactusFlower;
import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    private DHLDeliveryStrategy dhl;
    private List<Item> items;
    private Item rose;
    private Item tulip;
    private Item cactus;

    @BeforeEach
    void setUp() {
        dhl = new DHLDeliveryStrategy();

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
        assertTrue(dhl.deliver(items));
    }
}