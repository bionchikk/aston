package ru.aston.hometask.module3;

/**
 * Основной класс для демонстрации работы с CustomFileReader.
 */

public class Main {
    public static void main(String[] args) {
        CustomFileReader customFileReader = new CustomFileReader();
        String fileName = "testfile.txt";
        try {
            // Записываем текст в файл
            customFileReader.writeToFile(fileName, "Привет. Это проверка.");
            System.out.println("Данные успешно записаны в файл.");

            // Читаем текст из файла
            String content = customFileReader.readFromFile(fileName);
            System.out.println("Прочитанные данные из файла:");
            System.out.println(content);

        } catch (MyCustomException e) {
            // Ловим и печатаем собственное исключение
            System.err.println("Произошла ошибка при работе с файлом:");
            e.printStackTrace();
        }
    }
}
