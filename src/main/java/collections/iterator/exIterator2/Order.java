package collections.iterator.exIterator2;

public class Order {
    private long orderId;
    private double amount;

    public Order(long orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", amount=" + amount +
                '}';
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        else {
//            final boolean b = obj == null || getClass() != obj.getClass();
//        }
//        return false;
//    }
}
