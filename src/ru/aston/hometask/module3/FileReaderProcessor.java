package ru.aston.hometask.module3;

import java.io.FileReader;
import java.io.IOException;

/**
 * Класс для чтения текста из файла.
 * Реализует интерфейс FileProcessor.
 */
public class FileReaderProcessor implements FileProcessor {
    /**
     * Читает текст из указанного файла и выводит его в консоль.
     * 
     * @param fileName имя файла
     * @param message  не используется (требование интерфейса)
     * @throws MyCustomException если имя файла некорректно или произошла ошибка
     *                           чтения
     */
    @Override
    public void process(String fileName, String message) throws MyCustomException {
        // Проверяем валидность имени файла
        if (fileName == null || fileName.isEmpty()) {
            throw new MyCustomException("Имя файла не может быть пустым или null", new IllegalArgumentException());
        }
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(fileName)) {
            // Читаем файл посимвольно
            int c;
            while ((c = fr.read()) != -1) {
                sb.append((char) c);
            }
            // Выводим содержимое файла в консоль
            System.out.println(sb.toString());
        } catch (IOException e) {
            // Оборачиваем IOException в кастомное исключение
            throw new MyCustomException("Ошибка при чтении файла: " + fileName, e);
        }
    }
}