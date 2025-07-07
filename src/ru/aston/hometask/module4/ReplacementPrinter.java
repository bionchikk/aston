package ru.aston.hometask.module4;

/**
 * Класс ReplacementPrinter демонстрирует согласованную печать двух чисел в консоль.
 *
 * Создаёт два потока:
 * - Первый поток печатает "1".
 * - Второй поток печатает "2".
 *
 * Потоки синхронизированы через общий объект-блокировку и булевый флаг,
 * чтобы строго чередовать вывод сообщений, начиная с "1".
 */

public class ReplacementPrinter {
    /**
     * Общий объект-блокировка для синхронизации между потоками.
     * Используется с synchronized/wait/notifyAll для координации.
     */

    private static final Object lock = new Object();

    /**
     * Флаг, определяющий, чей сейчас ход.
     * true — очередь потока 1 (печатает "1").
     * false — очередь потока 2 (печатает "2").
     */

    private static boolean isOneTurn = true;

    /**
     * Точка входа в программу.
     * Создаёт и запускает два потока для поочерёдной печати чисел.
     */


    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (!isOneTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException ignored) {}
                    }
                    System.out.println("1");
                    isOneTurn = false;
                    lock.notifyAll();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (isOneTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException ignored) {}
                    }
                    System.out.println("2");
                    isOneTurn = true;
                    lock.notifyAll();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
