package exception.ex;

public class MyException extends Exception {
    private int detail;

    public MyException(int detail, String message) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException{"
                + "detail=" + detail
                + ", message=" + getMessage()
                + "} ";
    }
}