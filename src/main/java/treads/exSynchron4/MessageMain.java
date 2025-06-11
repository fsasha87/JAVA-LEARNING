package treads.exSynchron4;

public class MessageMain {
    public static void main(String[] args) {
        Message message = new Message();
        // Поток, который ожидает сообщение
        Thread waiterThread = new Thread(() -> {
            synchronized (message) {
                try {
                    System.out.println("Waiter is waiting for a message...");
                    message.wait(); // Ожидание уведомления о изменении сообщения
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Waiter received a message: " + message.getMessage());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName());
            }
        });
        waiterThread.start(); // Запуск потока ожидающего сообщение

        // Другой поток устанавливает сообщение после некоторой задержки
        try {
            Thread.sleep(2000); // Имитация некоторой работы
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        message.setMessage("Hello from Notifier!"); // Установка сообщения

        // Ждем завершения потока ожидающего сообщение
        try {
            waiterThread.join();//ждет завершения другого потока
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
