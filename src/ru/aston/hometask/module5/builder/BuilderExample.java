package ru.aston.hometask.module5.builder;

// Демонстрация использования паттерна Builder
public class BuilderExample {
    public static void main(String[] args) {
        // Создаём компьютер через цепочку вызовов билдера
        Computer gamingPc = new ComputerBuilder()
                .addCpu("Intel Core i9")
                .addGpu("NVIDIA RTX 4080")
                .addRam("32GB")
                .build();

        // Выводим результат
        System.out.println(gamingPc);
    }
}