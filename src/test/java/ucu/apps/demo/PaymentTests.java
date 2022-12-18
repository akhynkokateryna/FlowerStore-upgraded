package ucu.apps.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ucu.apps.demo.payments.CreditCardPaymentStrategy;
import ucu.apps.demo.payments.PayPalPaymentStrategy;

class PaymentTests {
    private final CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
    private final PayPalPaymentStrategy payPalPaymentStrategy = new PayPalPaymentStrategy();

    @Test
    public void testName(){
        Assertions.assertEquals(creditCardPaymentStrategy.getName(), "Credit card");
        Assertions.assertEquals(payPalPaymentStrategy.getName(), "PayPal");
    }

    @Test
    public void testDescription(){
        Assertions.assertEquals(creditCardPaymentStrategy.getDescription(), "Credit card payment");
        Assertions.assertEquals(payPalPaymentStrategy.getDescription(), "PayPal payment");
    }

    public void testPrice(){
        Assertions.assertEquals(creditCardPaymentStrategy.pay(100), "True");
        Assertions.assertEquals(payPalPaymentStrategy.pay(150), "True");
        Assertions.assertEquals(creditCardPaymentStrategy.pay(-5), "False");
        Assertions.assertEquals(payPalPaymentStrategy.pay(-10), "False");
    }

}