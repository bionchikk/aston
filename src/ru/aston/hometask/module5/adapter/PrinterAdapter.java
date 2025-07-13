package ru.aston.hometask.module5.adapter;

// Адаптер — приводит старый интерфейс к новому
class PrinterAdapter implements ModernPrinter {
    private LegacyPrinter legacyPrinter;

    // В конструктор передаём объект старого класса
    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    // Реализуем новый интерфейс
    @Override
    public void print(String text) {
        // Делегируем вызов методу старого класса
        legacyPrinter.printLegacy(text);
    }
}