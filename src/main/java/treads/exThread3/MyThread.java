package treads.exThread3;

public class MyThread implements Runnable{


    @Override
    public void run() {
        System.out.printf("%s started\n", Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s finished\n",  Thread.currentThread().getName());
    }
}
