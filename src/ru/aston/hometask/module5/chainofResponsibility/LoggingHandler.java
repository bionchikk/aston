package ru.aston.hometask.module5.chainofResponsibility;

// Конкретный обработчик — выполняет логирование
public class LoggingHandler extends RequestHandler {
    @Override
    public void handle(String request) {
        if (request.equals("LOG")) {
            System.out.println("LoggingHandler: Запрос залогирован.");
        } else if (nextHandler != null) {
            // Передаём запрос дальше по цепочке
            nextHandler.handle(request);
        } else {
            System.out.println("LoggingHandler: Неизвестный запрос, цепочка завершена.");
        }
    }
}
