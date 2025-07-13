package ru.aston.hometask.module5.decorator;

// Интерфейс компонента
// Определяет общий контракт для отправки уведомлений
interface Notifier {
    void send(String message);
}