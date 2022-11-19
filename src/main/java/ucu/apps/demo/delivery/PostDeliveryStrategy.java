package ucu.apps.demo.delivery;

import lombok.Getter;
import lombok.Setter;
import ucu.apps.demo.flower.Item;

import java.util.List;

@Getter
@Setter
public class PostDeliveryStrategy extends Delivery{
    private String name;
    private String description;

    public PostDeliveryStrategy() {
        name = "Post";
        description = "Post delivery";
    }
    @Override
    public String deliver(List<Item> items) {
        return items + " were delivered by post delivery";
    }
}
