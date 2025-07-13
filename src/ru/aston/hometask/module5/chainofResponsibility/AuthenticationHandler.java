package ru.aston.hometask.module5.chainofResponsibility;

// Конкретный обработчик — проверяет аутентификацию
public class AuthenticationHandler extends RequestHandler {
    @Override
    public void handle(String request) {
        if (request.equals("AUTH")) {
            System.out.println("AuthenticationHandler: Запрос аутентифицирован.");
        } else if (nextHandler != null) {
            // Передаём запрос дальше по цепочке
            nextHandler.handle(request);
        } else {
            System.out.println("AuthenticationHandler: Неизвестный запрос, цепочка завершена.");
        }
    }
}
