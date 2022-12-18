package ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ucu.apps.demo.delivery.DHLDeliveryStrategy;
import ucu.apps.demo.delivery.PostDeliveryStrategy;
import ucu.apps.demo.flower.Flower;
import ucu.apps.demo.flower.FlowerColor;
import ucu.apps.demo.flower.FlowerType;

import java.util.List;

public class DeliveryTests {
    private final PostDeliveryStrategy postDeliveryStrategy = new PostDeliveryStrategy();
    private final DHLDeliveryStrategy dhlDeliveryStrategy = new DHLDeliveryStrategy();

    @Test
    public void testName(){
        Assertions.assertEquals(postDeliveryStrategy.getName(), "Post");
        Assertions.assertEquals(dhlDeliveryStrategy.getName(), "DHL");
    }

    @Test
    public void testDescription(){
        Assertions.assertEquals(postDeliveryStrategy.getDescription(), "Post delivery");
        Assertions.assertEquals(dhlDeliveryStrategy.getDescription(), "DHL delivery");
    }

    public void testDelivery(){
        Flower flower1 = new Flower(1, 10, FlowerColor.BLUE, 50, FlowerType.CHAMOMILE);
        Flower flower2 = new Flower(2, 15, FlowerColor.PINK, 80, FlowerType.TULIP);

        Assertions.assertEquals(postDeliveryStrategy.deliver(List.of(flower1, flower2)),
                List.of(flower1, flower2) +  " were delivered by post delivery");
        Assertions.assertEquals(dhlDeliveryStrategy.deliver(List.of(flower1, flower2)),
                List.of(flower1, flower2) + " were delivered by DHL delivery");
    }
}
