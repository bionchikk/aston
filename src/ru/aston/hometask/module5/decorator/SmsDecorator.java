package ru.aston.hometask.module5.decorator;

// Конкретный декоратор, добавляющий SMS-уведомление
class SmsDecorator extends NotifierDecorator {
    public SmsDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message); // Сначала базовое уведомление
        sendSms(message);    // Потом дополнительное поведение
    }

    private void sendSms(String message) {
        System.out.println("Also sending SMS: " + message);
    }
}