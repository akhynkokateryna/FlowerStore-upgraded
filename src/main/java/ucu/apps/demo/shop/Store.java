package ucu.apps.demo.shop;

import ucu.apps.demo.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<FlowerBucket> flowBuckets = new ArrayList<FlowerBucket>();
    public Store() { }

    public void add(FlowerBucket flowerBucket) {
        flowBuckets.add(flowerBucket);
    }

    public boolean search(Item toSearch) {
        if (toSearch instanceof FlowerBucket) {
            for (FlowerBucket bucket : flowBuckets) {
                if (bucket.equals(toSearch)) {
                    System.out.println("Bucket is in store");
                    return true;
                }
            }
        } else {
            for (FlowerBucket bucket : flowBuckets) {
                for (FlowerPack pack: bucket.getFlowPacks()) {
                    if (pack.equals(toSearch)) {
                        System.out.println("The flower is in one of the buckets");
                        return true;
                    }
                }
                }
            }
        return false;
    }
}