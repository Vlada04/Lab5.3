package flowerstore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RomashkaFlower extends Item{
    public double price;

    @Override
    public String getDescription() {
        return "This is Romashka flower";
    }
}