package ucu.apps.demo.delivery;

import ucu.apps.demo.item.Item;

import java.util.List;

abstract public class Delivery {
    public abstract String deliver(List<Item> items);
}
