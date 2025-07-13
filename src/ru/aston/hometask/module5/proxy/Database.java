package ru.aston.hometask.module5.proxy;

// Интерфейс, который описывает общую функциональность
// Это общий контракт для настоящего объекта и прокси
interface Database {
    void query(String sql);
}
