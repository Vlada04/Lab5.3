import decorator.PaperDecorator;
import decorator.RibbonDecorator;
import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.FlowerType;
import flowerstore.Item;

public class Main {
    public static void main(String[] args) {
        Item bucket = new FlowerBucket();
        bucket = new PaperDecorator(bucket);
        bucket = new RibbonDecorator(bucket);
        System.out.print(bucket.getPrice());
    }
}
