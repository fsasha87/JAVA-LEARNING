package collections.iterator;

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
        System.out.println(orders);
    //выберем эл-ты с суммой больше указаного числа и на них сделаем скидку
        float bigAmount = 10;
        int percent = 5;
        OrderAction action = new OrderAction();
        action.discountAction(bigAmount, orders, percent);
        System.out.println(orders);
        Iterator <Order> iter = orders.iterator();//создаем итератор для коллекции
        while (iter.hasNext()) {
            Order order = iter.next();//извлекли объект с коллекции с помощью итератора
            if (order.getAmount()<=10.0){
                iter.remove();//удаляем объекты с суммой <10
            } else {
                order.setAmount(order.getAmount()*0.95);//считаем сумму со скидкой 5%
            }
        }
//        orders.removeIf(o ->o.getAmount()<=10);//2й сп: удаляем объекты с суммой <10
//        orders.forEach(o-> o.setAmount(o.getAmount()*0.95));//2й сп: считаем сумму со скидкой 5%
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
//        System.out.println(orders);
    }
}
