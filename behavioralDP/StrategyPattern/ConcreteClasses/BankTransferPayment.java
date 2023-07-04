package behavioralDP.StrategyPattern.ConcreteClasses;

import behavioralDP.StrategyPattern.Strategy.PaymentStrategy;

public class BankTransferPayment implements PaymentStrategy {
    private String accountNumber;
    private String bankCode;

    public BankTransferPayment(String accountNumber, String bankCode) {
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via bank transfer.");
    }
}
