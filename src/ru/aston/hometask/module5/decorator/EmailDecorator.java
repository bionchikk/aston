package ru.aston.hometask.module5.decorator;

// Конкретный декоратор, добавляющий Email-уведомление
class EmailDecorator extends NotifierDecorator {
    public EmailDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message); // Сначала базовое уведомление
        sendEmail(message);  // Потом дополнительное поведение
    }

    private void sendEmail(String message) {
        System.out.println("Also sending Email: " + message);
    }
}