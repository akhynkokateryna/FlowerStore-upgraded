package ucu.apps.demo.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Table
@Entity
public class Flower extends Item {
    @Id @GeneratedValue
    private int id;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    @Override
    public double price() {
        return price;
    }
}