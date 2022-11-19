package ucu.apps.demo.delivery;

import lombok.Getter;
import lombok.Setter;
import ucu.apps.demo.flower.Item;

import java.util.List;

@Getter
@Setter
public class DHLDeliveryStrategy extends Delivery{
        private String name;
        private String description;

        public DHLDeliveryStrategy() {
            name = "DHL";
            description = "DHL delivery";
        }

    @Override
    public String deliver(List<Item> items) {
        return items + " were delivered by DHL delivery";
    }
}
