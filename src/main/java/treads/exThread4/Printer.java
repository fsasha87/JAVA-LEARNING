package treads.exThread4;

public class Printer implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread());//Thread[Thread-0,5,main]
    }
}
