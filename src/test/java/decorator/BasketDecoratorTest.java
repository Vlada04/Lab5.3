package decorator;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    private FlowerPack flowers;
    private Flower rose;
    public Item flower;
    public Item bucket;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        ((Flower) flower).setPrice(10);
        flower = new BasketDecorator(flower);

        flowers = new FlowerPack();
        rose = new Flower(FlowerType.ROSE);
        rose.setPrice(5);
        flowers.setFlower(rose);
        flowers.setAmount(5);

        bucket = new FlowerBucket();
        ((FlowerBucket) bucket).flowerPacks.add(flowers);
        bucket = new BasketDecorator(bucket);
    }

    @Test
    void getPrice() {
        assertEquals(14, flower.getPrice());
        assertEquals(29, bucket.getPrice());
    }
}