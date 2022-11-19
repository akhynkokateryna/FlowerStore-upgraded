package ucu.apps.demo.decorators;

import ucu.apps.demo.flower.Item;

public class PaperDecorator extends AbstractDecorator{
    private Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double price() {
        return item.price() + 13;
    }

    @Override
    public String getDescription() {
        return "The item you chose is " +
                item.getClass().getSimpleName() +
                " and costs " +
                item.price();
    }
}
