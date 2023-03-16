package patterns.adapter.ex1;

public class Main {
    public static void main(String[] args) {
        Usb cardreader = new CardReader(new MemoryCard());
        cardreader.connectWithUsbCable();
    }
}
