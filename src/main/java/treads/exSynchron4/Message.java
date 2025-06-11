package treads.exSynchron4;

class Message {
    private String message;

    public synchronized String getMessage() {
        return message;
    }

    public synchronized void setMessage(String message) {
        this.message = message;
        notify(); // Уведомление о том, что сообщение установлено
    }
}

