package ru.aston.hometask.module3;

/**
 * Кастомное исключение для ошибок при работе с файлами
 * Используется для оборачивания IOException
 */

public class MyCustomException extends Exception {
    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
