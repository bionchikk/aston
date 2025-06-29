package ru.aston.hometask.module3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Сервис для записи и чтения текстовых данных из файла
 * Использует FileWriter и FileReader
 */

public class CustomFileReader {
    /**
     * Записывает переданный текст в файл.
     *
     * @param fileName имя файла
     * @param message  текст для записи
     * @throws MyCustomException если произошла ошибка при записи
     */
    public void writeToFile(String fileName, String message) throws MyCustomException {
        try (FileWriter fw = new FileWriter(fileName)) {
            // Пишем весь текст в файл
            fw.write(message);
        } catch (IOException e) {
            // Оборачиваем IOException в кастомное исключение
            throw new MyCustomException("Ошибка при записи в файл: " + fileName, e);
        }


    }

    /**
     * Читаем текст из файла в строку
     *
     * @param fileName имя файла
     * @return содержимое файла в виде одной строки
     * @throws MyCustomException если произошла ошибка при чтение
     */

    public String readFromFile(String fileName) throws MyCustomException {
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(fileName)) {
            int c;
            // Читаем файл посимвольно
            while ((c = fr.read()) != -1) {
                sb.append((char) c);
            }
        } catch (IOException e) {
            // Оборачиваем IOException в кастомное исключение
            throw new MyCustomException("Ошибка при чтении файла: " + fileName, e);

        }
        return sb.toString();
    }
}
