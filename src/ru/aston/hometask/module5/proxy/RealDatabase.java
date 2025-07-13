package ru.aston.hometask.module5.proxy;

// Реальный объект — выполняет настоящие запросы
class RealDatabase implements Database {
    @Override
    public void query(String sql) {
        System.out.println("Executing SQL query: " + sql);
    }
}