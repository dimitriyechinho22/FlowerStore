package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {


    List<FlowerBucket> flowerBuckets = new ArrayList<>();
    public boolean search(FlowerBucket bucket)
    {
        for (FlowerBucket f : flowerBuckets)
        {
            if(f.equals(bucket))
            {
                return true;
            }
        }
        return false;
    }


}
