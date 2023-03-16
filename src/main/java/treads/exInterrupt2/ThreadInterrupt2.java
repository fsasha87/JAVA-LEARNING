package treads.exInterrupt2;

public class ThreadInterrupt2 {
    public static void main(String[] args) {
        System.out.printf("%s thread started...\n", Thread.currentThread().getName());
        LThread lThread = new LThread();
        lThread.start();
        try{
            Thread.sleep(3);
            lThread.interrupt();
            Thread.sleep(150);
            System.out.println("I am interrupted");
//
        }

        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s thread finished...\n", Thread.currentThread().getName());
    }
}
class LThread extends Thread{
    @Override
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        while(!isInterrupted()){
            System.out.println("Loop " + counter++);
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}

//        main thread started...
//        Thread-0 started...
//        Loop 1
//        ...
//        Loop 115
//        Thread-0 finished...
//        I am interrupted
//        main thread finished...

