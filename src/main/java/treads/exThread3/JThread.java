package treads.exThread3;

public class JThread extends Thread{
    public JThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s thread started...\n", Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s thread finished\n", Thread.currentThread().getName());
        super.run();
    }
}
