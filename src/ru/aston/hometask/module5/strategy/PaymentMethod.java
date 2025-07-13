package ru.aston.hometask.module5.strategy;

// Стратегия — интерфейс, который определяет общий метод оплаты
public interface PaymentMethod {
    void pay(int  amount);
}
