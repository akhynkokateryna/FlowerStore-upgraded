package ucu.apps.demo.delivery;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {
    public List<? extends Delivery> getDeliveries() {
        return List.of(new PostDeliveryStrategy(), new DHLDeliveryStrategy());
    }
}
