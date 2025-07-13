package ru.aston.hometask.module5.decorator;

// Абстрактный класс-декоратор
// Имплементирует интерфейс Notifier и содержит ссылку на другой Notifier
abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappee;

    public NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        wrappee.send(message); // Делегирует вызов обёрнутому объекту
    }
}