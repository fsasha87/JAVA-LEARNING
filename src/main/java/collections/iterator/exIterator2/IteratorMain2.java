package collections.iterator.exIterator2;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain2 {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(231, 12.));
        orders.add(new Order(389, 2.9));
        orders.add(new Order(747, 32.));
        orders.add(new Order(517, 1.7));
        orders.add(new Order(114, 17.));
        System.out.println(orders);//[Order{orderId=231, amount=12.0}, Order{orderId=389, amount=2.9}, Order{orderId=747, amount=32.0}, Order{orderId=517, amount=1.7}, Order{orderId=114, amount=17.0}]
        //выберем эл-ты с суммой больше указаного числа и на них сделаем скидку
        Iterator<Order> iter = orders.iterator();//создаем итератор для коллекции
        //1сп:
        while (iter.hasNext()) {
            Order order = iter.next();//извлекли объект с коллекции с помощью итератора
            if (order.getAmount() <= 10.0) {
                iter.remove();//удаляем объекты с суммой <10
            } else {
                order.setAmount(order.getAmount() * 0.95);//считаем сумму со скидкой 5%
            }
        }
        System.out.println(orders);
        //2сп:
        while (iter.hasNext()) {
            orders.removeIf(o -> o.getAmount() <= 10);//2й сп: удаляем объекты с суммой <10
            orders.forEach(o -> o.setAmount(o.getAmount() * 0.95));//2й сп: считаем сумму со скидкой 5%
        }
        System.out.println(orders);//[Order{orderId=231, amount=11.399999999999999}, Order{orderId=747, amount=30.4}, Order{orderId=114, amount=16.15}]
    }
}
