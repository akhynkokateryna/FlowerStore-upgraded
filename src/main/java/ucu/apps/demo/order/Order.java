package ucu.apps.demo.order;

import lombok.Getter;
import lombok.Setter;
import ucu.apps.demo.delivery.Delivery;
import ucu.apps.demo.item.Item;
import ucu.apps.demo.payments.Payment;

import java.util.List;

@Getter
@Setter
public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calcuateTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < items.size(); i++) {
            totalPrice += items.get(i).price();
        }
        return totalPrice;
    }

    public String processOrder() {
        return "In your order are "+items.toString()+", payment: "+getPayment()+", and delivery type is" + getDelivery();
    }

    public void addItem(Item new_item) {
        items.add(new_item);
    }

    public void removeItem(Item to_remove) {
        items.remove(to_remove);
    }
}
