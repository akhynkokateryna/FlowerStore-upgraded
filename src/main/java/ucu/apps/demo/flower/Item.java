package ucu.apps.demo.flower;

abstract public class Item {
    private String description;

    public abstract double price();

    public String getDescription() {
        return description;
    }
}
