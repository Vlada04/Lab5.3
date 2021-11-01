package flowerstore;


import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Flower> flowers = new ArrayList<Flower>();

    public double search(){
        double amount = 0;
        for (int i = 0; i < flowers.size(); i++){
            amount += 1;
        }
        return amount;
    }
}
