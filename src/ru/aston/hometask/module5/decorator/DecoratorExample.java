package ru.aston.hometask.module5.decorator;

// Клиентский код
// Показывает, как можно динамически "наслаивать" декораторы
public class DecoratorExample {
    public static void main(String[] args) {
        // Базовый компонент
        Notifier basicNotifier = new BasicNotifier();

        // Оборачиваем в Email-декоратор
        Notifier emailNotifier = new EmailDecorator(basicNotifier);

        // Оборачиваем в SMS-декоратор поверх Email
        Notifier smsEmailNotifier = new SmsDecorator(emailNotifier);

        // Отправляем уведомление
        System.out.println("=== Sending notification with Decorators ===");
        smsEmailNotifier.send("Hello, user!");
    }
}