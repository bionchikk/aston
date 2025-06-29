package ru.aston.hometask.module3;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CustomFileReader {

    public void writeToFile(String fileName, String message) throws MyCustomException {
        try(FileWriter fw = new FileWriter(fileName)) {
            fw.write(message);
        }catch (IOException e){
            throw new MyCustomException("Ошибка при записи в файл: " + fileName, e );
        }


    }

    public String readFromFile(String fileName) throws MyCustomException {
        StringBuilder sb = new StringBuilder();
        try(FileReader fr = new FileReader(fileName)){
            int c;
            while((c = fr.read()) != -1){
                sb.append((char)c);
            }
        }catch (IOException e){
            throw new MyCustomException("Ошибка при чтении файла: "+ fileName, e);

        }
        return sb.toString();
    }
}
