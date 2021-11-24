package generics;

public class AccountMain {
    public static void main(String[] args) {

        Account acc1 = new Account("1876", 4500);
        Account acc2 = new Account("3476", 1500);

        Transaction<Account> tran1 = new Transaction<Account>(acc1,acc2, 4000);
        tran1.execute();
        tran1 = new Transaction<Account>(acc1,acc2, 4000);
        tran1.execute();
    }
}
