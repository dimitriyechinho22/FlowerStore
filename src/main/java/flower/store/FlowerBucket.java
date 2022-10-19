package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {

    public List<FlowerPack> PackList = new ArrayList<FlowerPack>();
    public double getPrice()
    {
        double price = 0;
        for (FlowerPack flowerPack: PackList)
        {
            price+= flowerPack.getPrice();
        }
        return price;
    }


}
