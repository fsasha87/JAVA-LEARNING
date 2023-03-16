package treads.exThread1;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyFirstThread myFirstThread = new MyFirstThread();
            myFirstThread.start();//Thread-5 Thread-1 Thread-9 Thread-0
//            myFirstThread.run(); //Thread-0 Thread-1 Thread-2 Thread-3
        }

    }
}
