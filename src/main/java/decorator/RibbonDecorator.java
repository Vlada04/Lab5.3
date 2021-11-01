package decorator;

import flowerstore.Item;

public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(Item item) {
        super(item);
    }
    @Override
    public double getPrice() {
        return item.getPrice() + 40;
    }
}