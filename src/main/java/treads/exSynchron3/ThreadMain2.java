package treads.exSynchron3;

public class ThreadMain2 {
    public static void main(String[] args) {
        Object lock = new Object();
        // task будет ждать, пока его не оповестят через lock
        Runnable task = () -> {
            synchronized(lock) {
                try {
                    lock.wait();
                } catch(InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
            // После оповещения нас мы будем ждать, пока сможем взять лок
            System.out.println("thread");
        };
        Thread taskThread = new Thread(task);
        taskThread.start();
        // Ждём и после этого забираем себе лок, оповещаем и отдаём лок
        try {
//            Thread.currentThread().sleep(3000);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main");
        synchronized(lock) {
            lock.notify();
        }
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element); }

    }
}
