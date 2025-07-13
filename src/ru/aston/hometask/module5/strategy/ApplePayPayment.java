package ru.aston.hometask.module5.strategy;

// Конкретная стратегия оплаты через ApplePay
public class ApplePayPayment implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " используя ApplePay");
    }
}
