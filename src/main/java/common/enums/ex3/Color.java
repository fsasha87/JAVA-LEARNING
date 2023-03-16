package common.enums.ex3;

public enum Color {
    RED ("#FF0000"), BLUE ("#0000FF"), GREEN("#00FF00");//пишем значения констант после создания конструктора
    private String code;
    Color (String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }
}
