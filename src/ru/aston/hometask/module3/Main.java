package ru.aston.hometask.module3;

import java.util.Scanner;

/**
 * Основной класс для демонстрации работы с FileWriterProcessor и
 * FileReaderProcessor.
 * Получает имя файла и текст для записи от пользователя через консоль.
 */
public class Main {
    public static void main(String[] args) {
        // Создаём Scanner для чтения пользовательского ввода
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();
        System.out.print("Введите текст для записи в файл: ");
        String message = scanner.nextLine();

        // Создаём процессоры для записи и чтения файла
        FileWriterProcessor writer = new FileWriterProcessor();
        FileReaderProcessor reader = new FileReaderProcessor();

        try {
            // Записываем текст в файл с помощью FileWriterProcessor
            writer.process(fileName, message);
            System.out.println("Данные успешно записаны в файл.");

            // Читаем текст из файла с помощью FileReaderProcessor
            System.out.println("Прочитанные данные из файла:");
            reader.process(fileName, null);
        } catch (MyCustomException e) {
            // Ловим и печатаем собственное исключение
            System.err.println("Произошла ошибка при работе с файлом:");
            e.printStackTrace();
        }
    }
}
