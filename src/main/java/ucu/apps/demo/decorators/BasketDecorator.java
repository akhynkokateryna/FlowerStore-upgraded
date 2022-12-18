package ucu.apps.demo.decorators;

import ucu.apps.demo.flower.Item;

public class BasketDecorator extends Item{
    private final Item item;
    public BasketDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double price() {
        return item.price() + 4;
    }

    @Override
    public String getDescription() {
        return "The item you chose is " +
                item.getClass().getSimpleName() +
                " and costs " +
                item.price();
    }
}
