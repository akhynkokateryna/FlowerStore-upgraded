package ucu.apps.demo.shop;

import lombok.Getter;
import lombok.Setter;
import ucu.apps.demo.flower.Flower;
import ucu.apps.demo.flower.Item;

@Setter@Getter
public class FlowerPack extends Item {
    private Flower flower;
    private int amount;

    public FlowerPack (Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public double price() {
        return amount * flower.getPrice();
    }
}
