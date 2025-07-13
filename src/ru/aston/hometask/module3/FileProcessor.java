package ru.aston.hometask.module3;

/**
 * Интерфейс для обработки файловых операций.
 * Определяет общий контракт для классов, выполняющих различные действия с
 * файлами (например, чтение или запись).
 */
public interface FileProcessor {
    /**
     * Выполняет обработку файла (например, чтение или запись).
     * 
     * @param fileName имя файла для обработки
     * @param message  текст для обработки (может быть не использован, зависит от
     *                 реализации)
     * @throws MyCustomException если произошла ошибка при обработке файла
     */
    void process(String fileName, String message) throws MyCustomException;
}
