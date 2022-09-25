package scanner;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {
        /*
David wants to deposit his money into his bank account
-he already got $200 in his account
-he got three different paychecks ($480, $600 and $350)
-he can only deposit one paycheck at a time
-after he got his money in the account
- he bought a phone for $599 and headphone for $299
- calculat his final money in his account
open a new class under scanner package and name it as "MoneyTransaction"
*/

        Scanner scanner = new Scanner(System.in);

        double balance =200;//firstCheck,secondCheck,thirdCheck,phonePrice,headphonePrice;

        System.out.println("Please enter First Check amount");

       double firstCheck = scanner.nextDouble();
       balance+=firstCheck;
        System.out.println("Please enter second check");

        double secondCheck = scanner.nextDouble();
        balance = balance+secondCheck;

        System.out.println("Please enter third check");

        balance += scanner.nextDouble();

        System.out.println("Please enter the phone price");

        double phone$=scanner.nextDouble();

        balance = balance-phone$;

        System.out.println("Please enter the Headphone Price");

        balance = balance - scanner.nextDouble();
        System.out.println("This is your final balance "+ balance);















    }
}
