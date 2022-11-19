package ucu.apps.demo.decorators;

import ucu.apps.demo.flower.Item;

public class RibbonDecorator extends Item {
    private Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double price() {
        return item.price() + 40;
    }

    @Override
    public String getDescription() {
        return "The item you chose is " +
                item.getClass().getSimpleName() +
                " and costs " +
                item.price();
    }
}
