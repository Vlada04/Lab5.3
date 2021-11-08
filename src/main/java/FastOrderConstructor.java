import flowerstore.*;

class FastOrderConstructor {
    public int createOrder() {
        FlowerBucket order = new FlowerBucket();
        Flower rose = new Flower(FlowerType.ROSE);
        rose.setPrice(5);

        FlowerPack roses = new FlowerPack();
        roses.setFlower(rose);
        roses.setAmount(100);

        order.flowerPacks.add(roses);
        return (int) order.getPrice();
    }
}