package _Tasks.task6;

public class Message {
    private String message;

    public synchronized String getMessage() {
        return message;
    }

    public synchronized void setMessage(String message) {
        this.message = message;
        notify();
    }
}
