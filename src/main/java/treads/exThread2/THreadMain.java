package treads.exThread2;

public class THreadMain {
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
            }
        };
        thread1.start();//Thread[Thread-0,5,main]

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
            }
        });
        thread2.start();//Thread[Thread-1,5,main]

        Thread thread3 = new Thread(()-> System.out.println(Thread.currentThread()));
        thread3.start();//Thread[Thread-2,5,main]

    }
}
