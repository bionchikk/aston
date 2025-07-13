package ru.aston.hometask.module5.proxy;

// Прокси — контролирует доступ к RealDatabase
class DatabaseProxy implements Database {
    private RealDatabase realDatabase;

    @Override
    public void query(String sql) {
        // Прокси может добавлять контроль доступа, кеширование, логирование и т.д.
        System.out.println("Proxy: Проверка прав доступа перед выполнением запроса.");

        // Ленивая инициализация: создаём объект только при первом запросе
        if (realDatabase == null) {
            realDatabase = new RealDatabase();
        }

        // Делегируем выполнение настоящему объекту
        realDatabase.query(sql);
    }
}