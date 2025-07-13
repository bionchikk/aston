package ru.aston.hometask.module3;

import java.io.IOException;

/**
 * Кастомное исключение для ошибок при работе с файлами.
 * Наследуется от IOException для явной обработки ошибок ввода-вывода.
 * Используется для оборачивания стандартных IO-исключений и передачи более
 * информативных сообщений.
 */
public class MyCustomException extends IOException {
    /**
     * Конструктор исключения с сообщением и причиной.
     * 
     * @param message описание ошибки
     * @param cause   причина ошибки (оригинальное исключение)
     */
    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
