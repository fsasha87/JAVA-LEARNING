package treads.exThread1;

public class MyFirstThread extends Thread {
    @Override
    public void run() {
        System.out.println("My first thread is: " + getName());
    }
}

