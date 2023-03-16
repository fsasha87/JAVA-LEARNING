package treads.exThread4;

public class PrinterMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());//main
        Thread thread1 = new Thread(new Printer());
        thread1.start();
        System.out.println(Thread.currentThread());//main
        try {
            thread1.join();//вклинивается в main, выполняет свои методы, а мейн ждет
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread());//main



    }
}
