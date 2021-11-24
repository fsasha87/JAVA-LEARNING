package interfaces.ex2;

public class EventsApp {
    public static void main (String args []){
        Button button = new Button(new ButtonClickHandler());
           button.click();
    }
}
