package ru.aston.hometask.module5.adapter;

// Клиентский код
// Работает только с интерфейсом ModernPrinter
public class AdapterExample {
    public static void main(String[] args) {
        // У нас есть старый принтер
        LegacyPrinter legacy = new LegacyPrinter();

        // Оборачиваем его в адаптер
        ModernPrinter printer = new PrinterAdapter(legacy);

        // Теперь можем использовать его через новый интерфейс
        System.out.println("=== Using Adapter ===");
        printer.print("Printing via Adapter!");
    }
}