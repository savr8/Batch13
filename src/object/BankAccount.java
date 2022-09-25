package object;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class BankAccount {
    String bankName;
    String accountHolderName;
    double balance;
    int accountNumber;
    String userName;
    String password;
    boolean isLoggedIn;
    /*
     * create a method to display account info
     * create a method, deposit(), which is updating balance and return balance
     * create a method, withdraw(), which is updating balance and return balance
     * create a method which checks if the user logged in ot not, returns true/false

     */

    public void printInfo() {
        if (isLoggedIn == true) {


            System.out.println(" Bank Name: " + bankName +
                    " Account holder's name: " + accountHolderName +
                    " Balance: " + balance +
                    " Account Number: " + accountNumber +
                    " User Name: " + userName +
                    " Password: " + password +
                    " Logged in: " + isLoggedIn);
        } else {
            System.out.println("Please log in first to see your information");
        }
    }

    public double deposit(double deposit$) {
        balance += deposit$;
        System.out.println("Your new balance after deposit amount of " + deposit$ + " is: " + balance);
        return balance;
    }

    public double withdraw(double withdraw$) {
        balance -= withdraw$;
        System.out.println("Your new balance after withdrawal amount of " + withdraw$ + " is: " + balance);
        return balance;
    }

    public boolean isLoggedIn(String userUserName, String userPassWord) {

        if (userName.equals(userUserName) && password.equals(userPassWord)) {
            isLoggedIn = true;
            System.out.println("You successfully logged in!");

        } else {
            isLoggedIn = false;
            System.out.println("Either username or password is not matching");
        }
        return isLoggedIn;
    }
}
