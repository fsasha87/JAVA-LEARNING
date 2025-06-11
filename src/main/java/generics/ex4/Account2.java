package generics.ex4;

public class Account2<T> {//обобщенный клас
    private T id;//обобщенный тип
    private int sum;

    public Account2(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
