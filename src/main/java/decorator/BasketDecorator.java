package decorator;

import flowerstore.Item;

public class BasketDecorator extends ItemDecorator{
    public BasketDecorator(Item item) {
        super(item);
    }
    @Override
    public double getPrice() {
        return item.getPrice() + 4;
    }
}
