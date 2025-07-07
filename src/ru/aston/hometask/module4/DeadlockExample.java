package ru.aston.hometask.module4;

/**
 * Класс DeadlockExample2 демонстрирует классический Deadlock (взаимная блокировка).
 *
 * Два потока захватывают два разных лок-объекта в разном порядке,
 * что приводит к ситуации, когда каждый поток ждёт освобождения ресурса,
 * захваченного другим потоком. В результате оба зависают навсегда.
 */

public class DeadlockExample {
    /**
     * Первый объект-блокировка.
     * Используется для синхронизации доступа.
     */
    private static final Object lockA = new Object();
    /**
     * Второй объект-блокировка.
     * Используется для синхронизации доступа.
     */
    private static final Object lockB = new Object();

    /**
     * Точка входа в программу.
     * Запускает два потока, создающих Deadlock.
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread(new TaskOne(), "Thread-1");
        Thread thread2 = new Thread(new TaskTwo(), "Thread-2");

        thread1.start();
        thread2.start();
    }

    /**
     * Задача для первого потока.
     * Сначала захватывает lockA, затем пытается получить lockB.
     */
    static class TaskOne implements Runnable {
        @Override
        public void run() {
            synchronized (lockA) {
                System.out.println(Thread.currentThread().getName() + " acquired lockA");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                System.out.println(Thread.currentThread().getName() + " waiting for lockB");
                synchronized (lockB) {
                    System.out.println(Thread.currentThread().getName() + " acquired lockB");
                }
            }
        }
    }

    /**
     * Задача для второго потока.
     * Сначала захватывает lockB, затем пытается получить lockA.
     */
    static class TaskTwo implements Runnable {
        @Override
        public void run() {
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + " acquired lockB");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                System.out.println(Thread.currentThread().getName() + " waiting for lockA");
                synchronized (lockA) {
                    System.out.println(Thread.currentThread().getName() + " acquired lockA");
                }
            }
        }
    }
}