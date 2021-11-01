package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    public List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public double getPrice(){
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++){
            price += flowerPacks.get(i).getPrice();
        }
        return price;
    }

    @Override
    public String getDescription() {
        String result = "It's a bucket with: ";
        for (int i = 0; i < flowerPacks.size(); i++) {
            result += flowerPacks.get(i).getFlower().getFlowertype();
            result += "; ";
        }
        return result;
    }
}
