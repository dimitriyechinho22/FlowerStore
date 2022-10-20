package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {

    private List<FlowerPack> PackList = new ArrayList<FlowerPack>();

    public void add(final FlowerPack flowerPack) {
        PackList.add(flowerPack);
    }
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
