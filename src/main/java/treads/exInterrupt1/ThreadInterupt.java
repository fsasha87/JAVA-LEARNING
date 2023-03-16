package treads.exInterrupt1;

public class ThreadInterupt {
    public static void main(String[] args) {

        Thread thread1 = new Thread(()-> {
            for (int i = 1; i < 10; i++) {
                System.out.println("sec="+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.printf("%s is interrupted\n", Thread.currentThread().getName());
                    break;
                }
            }
        }
        );
        thread1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.interrupt();
        System.out.printf("%s is finished\n", Thread.currentThread().getName());
    }
}
//        sec=1
//        sec=2
//        main is finished
//        Thread-0 is interrupted
