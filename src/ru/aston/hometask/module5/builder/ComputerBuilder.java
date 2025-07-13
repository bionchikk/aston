package ru.aston.hometask.module5.builder;

// Строитель (Builder) — пошагово собираем объект Computer
class ComputerBuilder {
    private Computer computer = new Computer();

    // Добавляем CPU
    public ComputerBuilder addCpu(String cpu) {
        computer.setCpu(cpu);
        return this; // Возвращаем самого себя для цепочки вызовов
    }

    // Добавляем GPU
    public ComputerBuilder addGpu(String gpu) {
        computer.setGpu(gpu);
        return this;
    }

    // Добавляем RAM
    public ComputerBuilder addRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    // Возвращаем собранный объект
    public Computer build() {
        return computer;
    }
}