package object;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.userName="Java";
        account.password="123";

        account.isLoggedIn("Java","123");

        account.deposit(10000);
        account.withdraw(1000);
        account.printInfo();
    }
}
