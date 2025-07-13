package ru.aston.hometask.module5.strategy;


// Контекст — использует выбранную стратегию
public class Order {
    private PaymentMethod paymentMethod;

    // Позволяет установить стратегию оплаты во время выполнения
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Выполняет оплату с использованием текущей стратегии
    public void processPayment(int amount) {
        if (paymentMethod == null) {
            System.out.println("Способ оплаты не выбран");
            return;
        }
        paymentMethod.pay(amount);

    }
}
