package _Tasks.task1;

public enum Month {
    JANUARY(31),
    FEBRUARY(28);
    private int quantity;

    Month(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Month{" + name() +
                "quantity=" + quantity +
                '}';
    }
}
