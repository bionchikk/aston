package ru.aston.hometask.module5.chainofResponsibility;

// Клиентский код — демонстрирует использование цепочки обязанностей
public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        // Создаём обработчики
        RequestHandler authHandler = new AuthenticationHandler();
        RequestHandler loggingHandler = new LoggingHandler();

        // Строим цепочку: authHandler -> loggingHandler
        authHandler.setNextHandler(loggingHandler);

        // Пытаемся обработать разные запросы
        System.out.println("=== Пример запроса LOG ===");
        authHandler.handle("LOG");  // Обработает LoggingHandler

        System.out.println("\n=== Пример запроса AUTH ===");
        authHandler.handle("AUTH"); // Обработает AuthenticationHandler

        System.out.println("\n=== Пример неизвестного запроса ===");
        authHandler.handle("UNKNOWN"); // Не обработает никто
    }
}
