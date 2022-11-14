package ucu.apps.demo.payments;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class PayPalPaymentStrategy implements Payment {
    private String name;
    private String description;

    public PayPalPaymentStrategy() {
        name = "PayPal";
        description = "PayPal payment";
    }

    @Override
    public boolean pay(double price) {
        return price > 0;
    }
}
