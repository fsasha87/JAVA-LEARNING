package generics.ex3;

public class AccountMain {
    public static void main(String[] args) {

        Account acc1 = new Account("1876", 4500);
        Account acc2 = new Account("3476", 1500);

        Transaction<Account> tran1 = new Transaction<Account>(acc1,acc2, 4000);
        tran1.execute();//Account 1876: 500     Account 3476: 5500
        tran1 = new Transaction<Account>(acc1,acc2, 4000);
        tran1.execute();//Operation is invalid
    }
}
