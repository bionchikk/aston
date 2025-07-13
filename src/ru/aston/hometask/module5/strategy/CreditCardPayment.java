package ru.aston.hometask.module5.strategy;

// Конкретная стратегия оплаты через карту
public class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " используя кредитную карту");

    }
}
