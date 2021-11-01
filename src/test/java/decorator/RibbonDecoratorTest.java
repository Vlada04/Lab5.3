package decorator;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    private FlowerPack flowers;
    private Flower rose;
    public Item flower;
    public Item bucket;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        ((Flower) flower).setPrice(10);
        flower = new RibbonDecorator(flower);

        flowers = new FlowerPack();
        rose = new Flower(FlowerType.ROSE);
        rose.setPrice(10);

        flowers.setFlower(rose);
        flowers.setAmount(5);

        bucket = new FlowerBucket();
        ((FlowerBucket) bucket).flowerPacks.add(flowers);
        bucket = new RibbonDecorator(bucket);
    }

    @Test
    void getPrice() {
        assertEquals(50, flower.getPrice());
        assertEquals(90, bucket.getPrice());
    }
}