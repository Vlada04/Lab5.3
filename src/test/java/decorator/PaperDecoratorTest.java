package decorator;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {
    private FlowerPack flowers;
    private Flower rose;
    public Item flower;
    public Item bucket;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        ((Flower) flower).setPrice(15);
        flower = new PaperDecorator(flower);

        flowers = new FlowerPack();
        rose = new Flower(FlowerType.ROSE);
        rose.setPrice(20);
        flowers.setFlower(rose);
        flowers.setAmount(3);

        bucket = new FlowerBucket();
        ((FlowerBucket) bucket).flowerPacks.add(flowers);
        bucket = new PaperDecorator(bucket);
    }

    @Test
    void getPrice() {
        assertEquals(28, flower.getPrice());
        assertEquals(73, bucket.getPrice());
    }
}
