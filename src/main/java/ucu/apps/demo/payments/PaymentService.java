package ucu.apps.demo.payments;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    public List<? extends Payment> getPayments() {
        return List.of(new PayPalPaymentStrategy(), new CreditCardPaymentStrategy());
    }
}
