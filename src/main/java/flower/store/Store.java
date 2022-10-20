package flower.store;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Store {


    private List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void add(final FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }
    public boolean search(FlowerBucket bucket)
    {
        for (FlowerBucket f : flowerBuckets)
        {
            if (f.equals(bucket))
            {
                return true;
            }
        }
        return false;
    }


}
