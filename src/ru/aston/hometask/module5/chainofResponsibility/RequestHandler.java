package ru.aston.hometask.module5.chainofResponsibility;

// Абстрактный обработчик — определяет интерфейс для обработки запроса
// и содержит ссылку на следующий обработчик в цепочке
abstract class RequestHandler {
    protected RequestHandler nextHandler;

    // Устанавливает следующий обработчик в цепочке
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    // Абстрактный метод обработки запроса
    public abstract void handle(String request);
}
