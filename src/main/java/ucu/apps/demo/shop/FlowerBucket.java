package ucu.apps.demo.shop;

import lombok.Getter;
import lombok.Setter;
import ucu.apps.demo.item.Item;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    @Getter@Setter
    private List<FlowerPack> flowPacks = new ArrayList<FlowerPack>();

    public void addFlower(FlowerPack flowPack) {
        flowPacks.add(flowPack);
    }

    public double price() {
        double price = 0.0;
        for (FlowerPack flowp: flowPacks) {
            price += flowp.price();
        }
        return price;
    }

    public boolean searchFlower(Item toSearch) {
        for (FlowerPack pack : flowPacks) {
            if (pack.getFlower().equals(toSearch)) {
                System.out.println("Flower is in store");
                return true;
            }
        }
        return false;
    }
}
