package ru.aston.hometask.module5.decorator;

// Базовая реализация компонента
// Просто отправляет базовое уведомление
class BasicNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending basic notification: " + message);
    }
}