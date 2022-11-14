package ucu.apps.demo.item;

import lombok.Getter;

@Getter
abstract public class Item {
    private String description;

    public abstract double price();
}
