package ru.aston.hometask.module3;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Класс для записи текста в файл.
 * Реализует интерфейс FileProcessor.
 */
public class FileWriterProcessor implements FileProcessor {
    /**
     * Записывает переданный текст в указанный файл.
     * 
     * @param fileName имя файла
     * @param message  текст для записи
     * @throws MyCustomException если имя файла некорректно или произошла ошибка
     *                           записи
     */
    @Override
    public void process(String fileName, String message) throws MyCustomException {
        // Проверяем валидность имени файла
        if (fileName == null || fileName.isEmpty()) {
            throw new MyCustomException("Имя файла не может быть пустым или null", new IllegalArgumentException());
        }
        try (FileWriter fw = new FileWriter(fileName)) {
            // Записываем текст в файл
            fw.write(message);
        } catch (IOException e) {
            // Оборачиваем IOException в кастомное исключение
            throw new MyCustomException("Ошибка при записи в файл: " + fileName, e);
        }
    }
}