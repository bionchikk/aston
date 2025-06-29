package ru.aston.hometask.module3;

public class Main {
    public static void main(String[] args) {
        CustomFileReader customFileReader = new CustomFileReader();
        String fileName = "testfile.txt";
        try {
            customFileReader.writeToFile(fileName, "Привет. Это проверка.");
            System.out.println("Данные успешно записаны в файл.");

            String content = customFileReader.readFromFile(fileName);
            System.out.println("Прочитанные данные из файла:");
            System.out.println(content);

        } catch (MyCustomException e) {
            System.err.println("Произошла ошибка при работе с файлом:");
            e.printStackTrace();
        }
    }
}
