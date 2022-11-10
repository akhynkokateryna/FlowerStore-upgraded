package ucu.apps.demo.payments;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class PayPalPayment implements Payment {
    private String name;
    private String description;

    public PayPalPayment() {
        name = "PayPal";
        description = "PayPal payment";
    }

    @Override
    public boolean pay() {
        return true;
    }
}
