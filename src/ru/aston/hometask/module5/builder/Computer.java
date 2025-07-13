package ru.aston.hometask.module5.builder;

// Продукт, который мы хотим построить
class Computer {
    private String cpu;
    private String gpu;
    private String ram;

    // Сеттеры для частей компьютера
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", GPU=" + gpu + ", RAM=" + ram + "]";
    }
}
