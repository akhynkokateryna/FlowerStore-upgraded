package ucu.apps.demo.flower;

import lombok.Getter;
import lombok.Setter;


@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;

    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public double getPrice() {
        return price;
    }
}