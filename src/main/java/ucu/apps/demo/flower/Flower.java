package ucu.apps.demo.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ucu.apps.demo.item.Item;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;

    private double price;
    @Getter
    private FlowerType flowerType;

    @Override
    public double price() {
        return price;
    }
}