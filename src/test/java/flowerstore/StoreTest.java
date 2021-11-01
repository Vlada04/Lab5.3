package flowerstore;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Flower rose;
    private Flower tulip;
    private Store store, store2;

    @BeforeEach
    void setUp() {
        rose = new Flower(FlowerType.ROSE);
        tulip = new Flower(FlowerType.TULIP);
        store = new Store();
        store2 = new Store();
        store.flowers.add(rose);
        store.flowers.add(tulip);

        store2.flowers.add(rose);
        store2.flowers.add(rose);
        store2.flowers.add(rose);
        store2.flowers.add(rose);
    }

    @Test
    void search() {
        assertEquals(2, store.search());
        assertEquals(4, store2.search());
    }
}