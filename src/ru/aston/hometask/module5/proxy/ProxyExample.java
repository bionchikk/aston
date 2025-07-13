package ru.aston.hometask.module5.proxy;

// Клиентский код, который работает через интерфейс Database
public class ProxyExample {
    public static void main(String[] args) {
        // Клиент ничего не знает о том, реальный это объект или прокси
        Database database = new DatabaseProxy();

        // Выполняем запрос через прокси
        database.query("SELECT * FROM users;");
    }
}