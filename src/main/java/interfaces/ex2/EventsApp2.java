package interfaces.ex2;

public class EventsApp2 {
    public static void main (String args []){
        Button tvButton = new Button(new EventHandler() {
            private boolean on = true;
            @Override
            public void execute() {
            if (on) {
                System.out.println("Телевизор выключен");
//                on=false;
            }
            else {
                System.out.println("Телевизор включен!");
//                on=true;
            }
            }
        });
        Button printButton = new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Запущена печать на принтере");

            }
        });
        tvButton.click();
        printButton.click();
        tvButton.click();
    }
}
