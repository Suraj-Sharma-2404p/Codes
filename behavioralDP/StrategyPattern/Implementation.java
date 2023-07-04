package behavioralDP.StrategyPattern;

import behavioralDP.StrategyPattern.ConcreteClasses.BankTransferPayment;
import behavioralDP.StrategyPattern.ConcreteClasses.CreditCardPayment;
import behavioralDP.StrategyPattern.ConcreteClasses.PaypalPayment;
import behavioralDP.StrategyPattern.Context.PaymentContext;
import behavioralDP.StrategyPattern.Strategy.PaymentStrategy;

public class Implementation {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        //use credit card payment strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890", "123", "09/25");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.processPayment(100);
        // Output: Paid 100.0 using credit card.

        // Use PayPal payment strategy
        PaymentStrategy payPalPayment = new PaypalPayment("example@example.com", "password");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.processPayment(50.0);
        // Output: Paid 50.0 using PayPal.

        // Use Bank Transfer payment strategy
        PaymentStrategy bankTransferPayment = new BankTransferPayment("123456789", "ABC");
        paymentContext.setPaymentStrategy(bankTransferPayment);
        paymentContext.processPayment(200.0);
        // Output: Paid 200.0 via bank transfer.
    }
}
