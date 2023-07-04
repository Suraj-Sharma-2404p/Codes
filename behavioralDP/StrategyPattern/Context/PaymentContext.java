package behavioralDP.StrategyPattern.Context;

import behavioralDP.StrategyPattern.Strategy.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount){
        paymentStrategy.pay(amount);
    }
}
