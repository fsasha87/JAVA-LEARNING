package generics.ex4;

import generics.ex3.Account;

public class Account2Main {

    public static void main(String[] args) {
        Account2<String> acc1 = new Account2<>("da123", 1000);
        System.out.println(acc1.getId());
        Account2<Integer> acc2 = new Account2<>(1230, 2000);
        System.out.println(acc2.getId());
    }
}
