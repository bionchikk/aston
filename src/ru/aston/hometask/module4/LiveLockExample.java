package ru.aston.hometask.module4;
/**
 * Класс LiveLockExample3 демонстрирует LiveLock.
 *
 * В этом примере два сервиса (ServiceA и ServiceB) пытаются запускаться по очереди,
 * но постоянно уступают друг другу из-за проверки статуса.
 * В результате оба остаются активными, но не выполняют полезной работы.
 */
public class LiveLockExample {

    /**
     * Класс Service моделирует рабочий процесс, который проверяет статус другого сервиса
     * и пытается уступить, если другой "занят".
     */
    static class Service {
        private final String name;
        private volatile boolean active;

        /**
         * Конструктор сервиса.
         *
         * @param name имя сервиса
         */
        public Service(String name) {
            this.name = name;
            this.active = true;
        }

        /**
         * Проверка, активен ли сервис.
         *
         * @return true если активен
         */
        public boolean isActive() {
            return active;
        }

        /**
         * Деактивация сервиса после выполнения работы.
         */
        public void deactivate() {
            active = false;
        }

        /**
         * Основная логика работы сервиса.
         * Уступает запуск, если другой сервис активен.
         *
         * @param other другой сервис
         */
        public void work(Service other) {
            while (active) {
                if (other.isActive()) {
                    System.out.println(name + ": Другой сервис активен. Уступаю запуск.");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException ignored) {}
                    continue;
                }

                // Если другой сервис не активен — выполняем работу
                System.out.println(name + ": Выполняю свою задачу!");
                deactivate();
            }
        }
    }

    /**
     * Точка входа в программу.
     * Создаёт два сервиса и запускает их в отдельных потоках.
     * Демонстрирует LiveLock, где оба сервиса бесконечно уступают друг другу.
     */
    public static void main(String[] args) {
        final Service serviceA = new Service("ServiceA");
        final Service serviceB = new Service("ServiceB");

        Thread threadA = new Thread(() -> serviceA.work(serviceB));
        Thread threadB = new Thread(() -> serviceB.work(serviceA));

        threadA.start();
        threadB.start();
    }
}