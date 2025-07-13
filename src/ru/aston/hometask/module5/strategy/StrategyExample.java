package ru.aston.hometask.module5.strategy;

// Демонстрация работы паттерна Strategy
public class StrategyExample {
    public static void main(String[] args) {
        Order order = new Order();

        // Устанавливаем стратегию оплаты — Credit Card
        order.setPaymentMethod(new CreditCardPayment());
        order.processPayment(150);

        // Устанавливаем стратегию оплаты — ApplePay
        order.setPaymentMethod(new ApplePayPayment());
        order.processPayment(300);
    }
}
