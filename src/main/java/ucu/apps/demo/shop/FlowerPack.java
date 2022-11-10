package ucu.apps.demo.shop;

import lombok.Getter;
import lombok.Setter;
import ucu.apps.demo.flower.Flower;

@Setter@Getter
public class FlowerPack extends Bundle {
    private Flower flower;
    private int amount;

    public FlowerPack (Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public double getPrice() {
        return amount * flower.getPrice();
    }
}
